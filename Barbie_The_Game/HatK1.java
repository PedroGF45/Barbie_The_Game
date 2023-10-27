import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HatK1 extends KenObjects
{
    private GreenfootImage[] hatk1;
    
    public void act()
    {
        transport();
        transport2();
    }
    
    public HatK1(){
        hatk1= new GreenfootImage[1];
        hatk1[0]= new GreenfootImage("images/Roupas/chapeuK.png");
        hatk1[0].scale(hatk1[0].getWidth()/15, hatk1[0].getHeight()/15);
        setImage(hatk1[0]);
    }
}
