import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Enemy
{
    public void act()
    {
        moveVertically();
        moveAtEdge();
    }
    
    // Constructor for the Spider
    public Spider()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
}
