package test2;

/**
 * Created by asus on 2017/2/27.
 */
public class Adventure {
    public  static  void  t(CanFight fight)
    {
        fight.fight();
    }
    public  static  void  t2(ActionCharacter x )
    {
        x.fight();
    }
    public  static  void  main(String a[])
    {
        Hero hero = new Hero();
        t(hero);
        t2(hero);
    }
}
