import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    public int portals = 3;
    public int gotPortals = 0;
    
    GreenfootImage portalImg = new GreenfootImage("../portal.png");
      
    public void updatePortal(GreenfootImage portalImg) {
        int x = portalImg.getWidth();
        int y = portalImg.getHeight();
        GreenfootImage image = new GreenfootImage(x * portals, y);
        int counter = gotPortals;
        for (int i = 0; i < portals; i++)
        {
            if (counter > 0)
            {
                portalImg.setTransparency(250);
                counter--;
            }
            else
            {
                portalImg.setTransparency(30);    
            }
            image.drawImage(portalImg, i*x, 0);
            
        }
        setImage(image);
    }
    
    public Portal()
    {
        portalImg.scale(50,50); 
        updatePortal(portalImg);
    }
    
    public int getScore() 
    {
        return gotPortals;
    }
    
    public void resetScore()
    {
        gotPortals = 0;
    }
     
    public void gainPortal() 
    {
        gotPortals++;
        updatePortal(portalImg);
    }
}
