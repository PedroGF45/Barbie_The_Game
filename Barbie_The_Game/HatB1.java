import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChapeuB1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HatB1 extends BarbieObjects
{
    private GreenfootImage[] hatb1;
    public void act()
    {
        //saveItem();
        transport();
        transport2();
    }
    public HatB1(){
        hatb1= new GreenfootImage[1];
        hatb1[0]= new GreenfootImage("../Roupas/chapeuB_1.png");
        hatb1[0].scale(hatb1[0].getWidth()/8, hatb1[0].getHeight()/8);
        setImage(hatb1[0]);
    }
}
