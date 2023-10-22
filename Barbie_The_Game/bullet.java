import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Projectiles
{
    private int speed = 20;
    /**
     * Act - do whatever the bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
    }
}
