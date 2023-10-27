import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Restart extends Button
{
    public void act()
    {
        checkMouse();
        checkClicked(new GreenfootSound("../start_game.mp3"));
    }
    
    // constructor for restart button
    public Restart()
    {
        GreenfootImage restartBtn = getImage();
        Picture restartImg = new Picture(restartBtn, 10);
    }
}
