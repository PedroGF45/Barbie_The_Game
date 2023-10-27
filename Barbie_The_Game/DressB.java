import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VestidoB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        dressB[0]= new GreenfootImage("../Roupas/vestido_1.png");
        dressB[0].scale(dressB[0].getWidth()/15, dressB[0].getHeight()/15);
        setImage(dressB[0]);
    }
}
