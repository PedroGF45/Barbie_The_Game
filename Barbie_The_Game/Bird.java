import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Enemy
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        rotationMovement();
        moveAtEdge();
    }
    
    public Bird()
    {
        getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    
    
}
