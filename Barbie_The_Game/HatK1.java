import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChapeuK1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
        hatk1[0]= new GreenfootImage("../Roupas/chapeuK.png");
        hatk1[0].scale(hatk1[0].getWidth()/15, hatk1[0].getHeight()/15);
        setImage(hatk1[0]);
    }
}
