import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DressB extends BarbieObjects
{
    private GreenfootImage[] dressB;
    public void act()
    {
        //saveItem();
        transport();
        transport2();
    }
    public DressB(){
        dressB= new GreenfootImage[1];
        dressB[0]= new GreenfootImage("images/Roupas/vestido_1.png");
        dressB[0].scale(dressB[0].getWidth()/15, dressB[0].getHeight()/15);
        setImage(dressB[0]);
    }
}
