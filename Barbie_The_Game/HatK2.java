import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HatK2 extends KenObjects
{
    private GreenfootImage[] hatk2;
    public void act()
    {
        transport();
        transport2();
    }
    public HatK2(){
        hatk2= new GreenfootImage[1];
        hatk2[0]= new GreenfootImage("images/Roupas/chapeuKen_2.png");
        hatk2[0].scale(hatk2[0].getWidth()/15, hatk2[0].getHeight()/15);
        setImage(hatk2[0]);
    }
}
