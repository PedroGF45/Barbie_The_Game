import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle extends World
{
    public Puzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    public void prepare()
    {
        addObject(History.timer, 700, 750);
    }
}
