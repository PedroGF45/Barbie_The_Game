import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WonGame extends World
{

    // Initialize score and time variables
    private Score score;
    private Time time;
    
    public WonGame(Score score, Time time)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        this.score = score;
        this.time = time;
        prepare();
    }
    
    private void prepare()
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        GreenfootImage gameWin = new GreenfootImage("images/gameWin.png");
        Picture gameWinImg = new Picture(gameWin, 5);
        addObject(gameWinImg, getWidth()/2, 250);
        
        // Add score
        addObject(score, getWidth()/2, 350);
        
        // Add time
        int minutes = time.getTimeInMinutes();
        int seconds = time.getTimeInSeconds() / 60;
        
        // Format the time as "mm:ss"
        String timeString = String.format("%02d:%02d", minutes, seconds);

        GreenfootImage timeText = new GreenfootImage("Time" , 50, Color.WHITE, new Color(0,0,0,0));
        Picture timeTextImg = new Picture(timeText, 1);
        GreenfootImage timeNumbers = new GreenfootImage(timeString, 30, Color.WHITE, new Color(0,0,0,0));
        Picture timeNumbersImg = new Picture(timeNumbers, 1);
        
        addObject(timeTextImg, getWidth()/2, 450);
        addObject(timeNumbersImg, getWidth()/2, 490);
        
        GreenfootSound victory = new GreenfootSound("sounds/victory.mp3");
        victory.setVolume(67);
        victory.play();

        // Add button to restart
        addObject(new Restart(), 300, 600);
        
        // Add button to exit
        addObject(new Exit(), 500, 600);
    }
}
