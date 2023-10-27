import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShirtB extends BarbieObjects
{
    private GreenfootImage[] shirt;
    public void act()
    {
        //saveItem();
        transport();
        transport2();
    }
    public ShirtB(){
        shirt= new GreenfootImage[1];
        shirt[0]= new GreenfootImage("images/Roupas/coleteB.png");
        shirt[0].scale(shirt[0].getWidth()/11, shirt[0].getHeight()/11);
        setImage(shirt[0]);
    }
}
