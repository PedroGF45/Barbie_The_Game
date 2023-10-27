import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle extends World
{
       
    private int playerHearts = 5;
    
    private Time time;
    private Score score;
    private Health barbieHealth;
    private Barbie barbie;
    private Health kenHealth;
    private Ken ken;
    
    public Puzzle(Time time)
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        this.time = time;
        prepare();
    }
    
    public void prepare()
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        // Add time
        addObject(time, 725, 775);

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
        
        // Add the portal boost
        PortalBoost portalBoost = new PortalBoost();
        addObject(portalBoost,410,405);
    }
    
    // Encapsulation methods
    public Barbie getBarbie()
    {
        return barbie;
    }
    
    public Health getBarbieHealth()
    {
        return barbieHealth;
    }
    
    public Ken getKen()
    {
        return ken;
    }
    
    public Health getKenHealth()
    {
        return kenHealth;
    }
    
    public Score getScore()
    {
        return score;
    }
    
    public Time getTime()
    {
        return time;
    }
    
    // Switch to next world
    public void switchWorld(World world)
    {
        Greenfoot.setWorld(world);
    }
}
