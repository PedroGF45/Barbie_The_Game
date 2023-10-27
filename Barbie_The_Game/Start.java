import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked( new GreenfootSound("sounds/button.mp3"));
    }
    
    // constructor for exit button
    public Start()
    {
        GreenfootImage startBtn = getImage();
        Picture startImg = new Picture(startBtn, 10);
    }
    
    // @override
    public void checkClicked( GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Puzzle(((History)getWorld()).getTime()));
            sound.play();
        }
    }
}
