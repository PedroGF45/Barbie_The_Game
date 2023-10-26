import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{  
    // sets the amount to scale the button when overed
    private static int SCALE = 50;
    
    // keeps track if the button is overed or not
    private boolean mouseOver = false;
    
    // Check if the mouse is overing the button
    public void checkMouse()
    {
        // check if mouse is overing the image 
        if (Greenfoot.mouseMoved(this) && !mouseOver)
        {
            scaleImg(SCALE);
            mouseOver = true;
        }
        // check if mouse is not overing the image 
        else if (Greenfoot.mouseMoved(null) && mouseOver && !Greenfoot.mouseMoved(this))
        {
            scaleImg(-SCALE);
            mouseOver = false;
        }
    }
    
    // if the user clicks on the buttons change the world and play a sound
    public void checkClicked(World world, GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            ((Menu)getWorld()).switchWorld(world);
            sound.play();
        }
    }
    
    // Scales the image
    public void scaleImg(int scale)
    {
        GreenfootImage img = getImage();
        img.scale(img.getWidth() + scale,img.getHeight() + scale);
        setImage(img);
    }
}
