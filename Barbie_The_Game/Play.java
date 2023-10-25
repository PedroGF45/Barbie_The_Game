import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(new History(), new GreenfootSound("../start_game.mp3"));
    }
    
    public Play()
    {
        GreenfootImage playBtn = getImage();
        Picture playImg = new Picture(playBtn, 10);
    }
}
