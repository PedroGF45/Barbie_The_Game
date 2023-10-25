import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGroundHistory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundHistory extends Text
{
    public BackgroundHistory()
    {
        GreenfootImage text = new GreenfootImage("Once upon a time, Barbie and Ken lived happily,\n" + "surrounded by friendship, fun, and beauty.\n" +
                                                    "One day, they decided to embark on a journey to Planet Earth.\n" +
                                                    "On Planet Earth, Barbie and Ken explored exotic beaches,\n" + "majestic mountains, and bustling cities. \n" + "However, unexpectedly, a magical anomaly occurred\n" +  "and closed the portal that connected them to the Barbie Land.\n" +
                                                    "They were stranded on Earth, far from home. Determined to return\n" + "to their magical land, Barbie and Ken embarked on an exciting journey.\n" + 
                                                    "With the help of the friends they made on Earth, they discovered\n" + "that the key to reopening the portal was hidden in various places,\n" + "protected by intriguing challenges and puzzles.\n" + 
                                                    "The game  begins here, where players take on the roles of Barbie and Ken,\n" + " helping them overcome obstacles, unravel clues, and complete missions\n" + "to find the magical pieces that will reopen the portal.",
                                                    25, Color.WHITE, new Color(0,0,0,0));
        setImage(text);
    }
}
