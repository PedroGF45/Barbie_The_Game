import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CalcasB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantsB extends BarbieObjects
{
    private GreenfootImage[] pants;
    
    public void act()
    {
        //saveItem();
        if(isTouching(Hole.class)){
            transport();
            transport2();
    }
}
    public PantsB(){
        pants= new GreenfootImage[1];
        pants[0]= new GreenfootImage("../Roupas/calcasB.png");
        pants[0].scale(pants[0].getWidth()/15, pants[0].getHeight()/15);
        setImage(pants[0]);
    }
}
