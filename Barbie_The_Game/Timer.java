import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    private int timeInSeconds; // The time counter in seconds
    private int timeInMinutes; // The time counter in minutes

    public Timer() {
        timeInSeconds = 0;
        updateImage();
    }

    public void act() {
        // Increment the time counter every frame
        timeInSeconds++;
        updateImage();
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }
    
    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    private void updateImage() {
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
