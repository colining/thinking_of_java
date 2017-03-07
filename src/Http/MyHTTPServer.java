package Http;

/**
 * Created by asus on 2017/3/7.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class SocketHandler implements Runnable {

    final static String CRLF = "\r\n";   // 1

    private Socket clientSocket;

    public SocketHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    public void handleSocket(Socket clientSocket) throws IOException {

        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream())
        );
        PrintWriter out = new PrintWriter(
                new BufferedWriter( new OutputStreamWriter(clientSocket.getOutputStream())),
                true
        );

        String requestHeader = "";
        String s;
        while ((s = in.readLine()) != null) {
            s += CRLF;  // 2 ����Ҫ��Ĭ�������in.readLine�Ľ����`\r\n`��ȥ����
            requestHeader = requestHeader + s;
            if (s.equals(CRLF)){ // 3 �˴�HTTP����ͷ���Ƕ��õ��ˣ����������ͷ���ж����������ģ�����Ҫ������ȡ����
                break;
            }
        }
        System.out.println("�ͻ�������ͷ��");
        System.out.println(requestHeader);

        String responseBody = "�ͻ��˵�����ͷ�ǣ�\n"+requestHeader;

        String responseHeader = "HTTP/1.0 200 OK\r\n" +
                "Content-Type: text/plain; charset=UTF-8\r\n" +
                "Content-Length: "+responseBody.getBytes().length+"\r\n" +
                "\r\n";
        // 4 �������ˣ�1����������̽����� 2��������ܵ�content-length��ᰴ��ʲô��ʽ�жϣ����ֵĸ������ֽ�����

        System.out.println("��Ӧͷ��");
        System.out.println(responseHeader);

        out.write(responseHeader);
        out.write(responseBody);
        out.flush();

        out.close();
        in.close();
        clientSocket.close();

    }

    @Override
    public void run() {
        try {
            handleSocket(clientSocket);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
public class MyHTTPServer {

    public static void main(String[] args) throws Exception {

        int port = 8000;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("�������񣬰󶨶˿ڣ� " + port);

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(30);  // 5

        while (true) {  // 6
            Socket clientSocket = serverSocket.accept();
            System.out.println("�µ�����"
                    + clientSocket.getInetAddress() + ":" + clientSocket.getPort());
            try {
                fixedThreadPool.execute(new SocketHandler(clientSocket));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

