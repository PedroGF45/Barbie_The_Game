import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(new History(), getBtnSound());
    }
    
    // constructor for play button
    public Play()
    {
        GreenfootImage playBtn = getImage();
        Picture playImg = new Picture(playBtn, 10);
    }
}
