import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle extends World
{
    public static Score score;
    
    public static Health barbieHealth;
    public static Barbie barbie;
    
    public static Health kenHealth;
    public static Ken ken;
    
    private int playerHearts = 5;
    
    public Puzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    public void prepare()
    {
        // Add timer
        addObject(History.timer, 725, 775);

        // Add score
        score = new Score();
        addObject(score, getWidth()/2, 50);

        // Add Health bars and players
        barbieHealth = new Health(playerHearts);
        addObject(barbieHealth, 110, 50);

        GreenfootImage barbieIcon = new GreenfootImage("../barbie.png");
        Picture barbieIconImg = new Picture(barbieIcon, 20);
        addObject(barbieIconImg, 190, 50);

        barbie = new Barbie(barbieHealth);
        addObject(barbie,95,700); 

        kenHealth = new Health(playerHearts);
        addObject(kenHealth, 700, 50);

        GreenfootImage kenIcon = new GreenfootImage("../ken.png");
        Picture kenIconImg = new Picture(kenIcon, 15);
        addObject(kenIconImg, 620, 50);

        ken = new Ken(kenHealth);
        addObject(ken,725,75);
        
        PortalBoost portalBoost = new PortalBoost();
        addObject(portalBoost,410,405);
    }
    
    public void switchWorld(World world)
    {
        Greenfoot.setWorld(world);
    }
}
