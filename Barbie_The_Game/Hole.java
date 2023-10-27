import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hole extends Actor
{
    public GreenfootImage[] hole;
    /**
     * Act - do whatever the Hole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Hole(){
        hole= new GreenfootImage[1];
        hole[0]= new GreenfootImage("../hole.png");
        
        setImage(hole[0]);
    }
}
