import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Exit extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(getBtnSound());
    }
    
    // constructor for exit button
    public Exit()
    {
        GreenfootImage exitBtn = getImage();
        Picture exit = new Picture(exitBtn, 10);
    }
    
    @Override
    public void checkClicked(GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            sound.setVolume(30);
            sound.play();
            Greenfoot.stop();
        }
    }
}