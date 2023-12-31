import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Time extends Actor
{
    private int timeInSeconds; // The time counter in seconds
    private int timeInMinutes; // The time counter in minutes
    private boolean stopTime = false;

    public Time() {
        timeInSeconds = 0;
        updateImage();
    }

    public void act() {
        // Increment the time counter every frame
        updateTime(stopTime);
        updateImage();
    }

    public int getTimeInSeconds() 
    {
        return timeInSeconds;
    }
    
    public int getTimeInMinutes() 
    {
        return timeInMinutes;
    }
    
    public void stopTime()
    {
        stopTime = true;
    }
    
    public void updateTime(boolean stopTime)
    {
        if (!stopTime)
        {
            timeInSeconds++;
        }
    }

    private void updateImage() 
    {
        int minutes = timeInMinutes;
        int seconds = timeInSeconds / 60;
        
        if (seconds == 60)
        {
            timeInMinutes++;
            timeInSeconds = 0;
        }

        // Format the time as "mm:ss"
        String timeString = String.format("%02d:%02d", minutes, seconds);

        GreenfootImage img = new GreenfootImage("Time: " + timeString, 24, Color.WHITE, Color.BLACK);
        // Set the timer's image to display the formatted time
        setImage(img);
    }
}
