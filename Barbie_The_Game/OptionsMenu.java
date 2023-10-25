import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OptionsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OptionsMenu extends World
{
    /**
     * Constructor for objects of class OptionsMenu.
     * 
     */
    public OptionsMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    private void prepare()
    {
        GreenfootImage barbie = new GreenfootImage("../animacoes/Idle_009.png");
        Picture barbieImg = new Picture(barbie, 3);
        addObject(barbieImg, 250, 250);

        GreenfootImage wasd = new GreenfootImage("../wasd.png");
        Picture wasdImg = new Picture(wasd, 2);
        addObject(wasdImg, 250, 450);

        GreenfootImage spaceBar = new GreenfootImage("../spacebar.png");
        Picture spaceBarImg = new Picture(spaceBar, 7);
        addObject(spaceBarImg, 250, 625);

        GreenfootImage ken = new GreenfootImage("../animacoes/Idle_009.png");
        Picture kenImg = new Picture(ken, 3);
        addObject(kenImg, 550, 250);

        GreenfootImage arrow = new GreenfootImage("../arrow.png");
        Picture arrowImg = new Picture(arrow, 2);
        addObject(arrowImg, 550, 450);

        GreenfootImage zeroKey = new GreenfootImage("../zerokey.png");
        Picture zeroKeyImg = new Picture(zeroKey, 7);
        addObject(zeroKeyImg, 550,625);
        
        // Add the options button as image
        Return returnImg = new Return();
        addObject(returnImg, 725, 750);

        getBackground().scale(getWidth() + 115, getHeight() + 115);
    }
    
    public void switchWorld(World world)
    {
        Greenfoot.setWorld(world);
    }
}
