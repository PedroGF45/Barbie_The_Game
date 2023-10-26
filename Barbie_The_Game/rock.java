import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Projectiles
{
    private int speed = 8;
    /**
     * Act - do whatever the rocks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        wallCollision();
    }
}
