import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fight extends World
{
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
        //Health bossHealth = new Health(10);
        //addObject(bossHealth, 650, 50);
        //Boss boss = new Boss(bossHealth);
        //addObject(boss,650,200);
        Health barbieHealth = new Health(5);
        addObject(barbieHealth, 50,705);
        Barbie barbie = new Barbie(barbieHealth);
        addObject(barbie, 50, 470);
        Health kenHealth = new Health(5);
        addObject(kenHealth, 50,10);
        Ken ken = new Ken(kenHealth);
        addObject(ken, 50, 150);
        addObject(new Spider(),620, 15);
        addObject(new Spider(),620, 350);
        addObject(new Spider(),620, 650);
        addObject(new Spider(),690, 150);
        addObject(new Spider(),690, 450);
        addObject(new Snake(),600, 170);
        addObject(new Snake(),610, 490);
        addObject(new Snake(),510, 410);
        addObject(new Gun(), 250, 50);
        addObject(new Gun(), 250, 650);
    }
}