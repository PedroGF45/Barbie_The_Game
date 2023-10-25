import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Options extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(new OptionsMenu(), new GreenfootSound("../start_game.mp3"));
    }
    
    public Options()
    {
        GreenfootImage optionBtn = getImage();
        Picture optionImg = new Picture(optionBtn, 10);
    }
}
