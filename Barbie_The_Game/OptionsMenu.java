import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OptionsMenu extends World
{
    // Constructor
    public OptionsMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    private void prepare()
    {
        // Add different images
        
        GreenfootImage barbieIcon = new GreenfootImage("images/barbie.png");
        Picture barbieIconImg = new Picture(barbieIcon, 5);
        addObject(barbieIconImg, 250, 100);
        
        GreenfootImage kenIcon = new GreenfootImage("images/ken.png");
        Picture kenIconImg = new Picture(kenIcon, 5);
        addObject(kenIconImg, 550, 100);
        
        GreenfootImage barbie = new GreenfootImage("images/animacoes/IdleB.png");
        Picture barbieImg = new Picture(barbie, 3);
        addObject(barbieImg, 250, 250);

        GreenfootImage wasd = new GreenfootImage("images/wasd.png");
        Picture wasdImg = new Picture(wasd, 2);
        addObject(wasdImg, 250, 450);

        GreenfootImage spaceBar = new GreenfootImage("images/spacebar.png");
        Picture spaceBarImg = new Picture(spaceBar, 7);
        addObject(spaceBarImg, 250, 625);

        GreenfootImage ken = new GreenfootImage("images/animacoes/Idle_009.png");
        Picture kenImg = new Picture(ken, 3);
        addObject(kenImg, 550, 250);

        GreenfootImage arrow = new GreenfootImage("images/arrow.png");
        Picture arrowImg = new Picture(arrow, 2);
        addObject(arrowImg, 550, 450);

        GreenfootImage zeroKey = new GreenfootImage("images/zerokey.png");
        Picture zeroKeyImg = new Picture(zeroKey, 7);
        addObject(zeroKeyImg, 550,625);
        
        Return returnImg = new Return();
        addObject(returnImg, 725, 775);
        
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
    }
    
    // Switch to a different world
    public void switchWorld(World world)
    {
        Greenfoot.setWorld(world);
    }
}
