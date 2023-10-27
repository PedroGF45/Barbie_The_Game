import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LostGame extends World
{
    public LostGame(World world, Score score, Time time)
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare(world, time, score);
    }
    
    private void prepare(World world, Time time, Score score)
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        GreenfootImage gameOver = new GreenfootImage("images/gameOver.png");
        Picture gameOverImg = new Picture(gameOver, 5);
        addObject(gameOverImg, getWidth()/2, 250);
        
        addObject(new RestartLevel(), getWidth()/2, 450);
        
        // Add yes and no buttons
        addObject(new No(), 500, 600);
        addObject(new Yes(world, time, score), 300, 600);
        
        GreenfootSound defeat = new GreenfootSound("sounds/defeat.mp3");
        defeat.setVolume(50);
        defeat.play();
    }
}