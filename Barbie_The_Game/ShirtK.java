import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CamisaK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShirtK extends KenObjects
{
    private GreenfootImage[] shirt;
    /**
     * Act - do whatever the CamisaK wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        transport();
        transport2();
    }
    public ShirtK(){
        shirt= new GreenfootImage[1];
        shirt[0]= new GreenfootImage("../Roupas/camisaK.png");
        shirt[0].scale(shirt[0].getWidth()/15, shirt[0].getHeight()/15);
        setImage(shirt[0]);
    }
}
