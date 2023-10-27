import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class No extends Button
{
    /**
     * Act - do whatever the No wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkMouse();
        checkClicked( new GreenfootSound("../start_game.mp3"));
    }
    
    // constructor for no button
    public No()
    {
        GreenfootImage noBtn = getImage();
        Picture noImg = new Picture(noBtn, 5);
    }
}
