package Class;

/**
 * Created by asus on 2017/3/4.
 */
public class SweetShop {
    public  static  void  main(String [] arg) throws ClassNotFoundException {
        new Candy();
        Class a =Class.forName("Class.Gum");
        
        try {
            Class.forName("Class.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("couldn't find gum");
        }
    }
}
