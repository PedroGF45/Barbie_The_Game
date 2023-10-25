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
        checkClicked(new PlayerSelection(), new GreenfootSound("../start_game.mp3"));
    }
    
    public Play()
    {
        GreenfootImage playBtn = getImage();
        Picture playImg = new Picture(playBtn);
        //playBtn.scale(playBtn.getWidth()/10, playBtn.getHeight()/10);
        //setImage(playBtn);
    }
}
