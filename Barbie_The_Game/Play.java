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
        checkClicked(new Game(), new GreenfootSound("../start_game.mp3"));
    }
    
    public Play()
    {
        GreenfootImage playBtn = getImage();
        playBtn.scale(playBtn.getWidth()-1750, playBtn.getHeight()-1000);
        setImage(playBtn);
    }
}
