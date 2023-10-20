import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fight extends World
{
    private int bossHearts = 10;
    /**
     * Constructor for objects of class Fight.
     * 
     */
    public Fight()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    public void prepare()
    {
        Health bossHealth = new Health(bossHearts);
        addObject(bossHealth, 650, 50);
        Boss boss = new Boss(bossHealth);
        addObject(boss,650,200);
    }
}
