import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    private int portals = 3;
    private int gotPortals = 0;
    
    GreenfootImage portalImg = new GreenfootImage("../portal.png");
    
    // Constructor for the score
    public Score()
    {
        portalImg.scale(50,50); 
        updatePortal(portalImg);
    }
    
    // Update the image of the score granting transparency to portals that players haven't got
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
                portalImg.setTransparency(70);    
            }
            image.drawImage(portalImg, i*x, 0);
            
        }
        setImage(image);
    }
    
    // Get number of portals gained by players
    public int getPortals() 
    {
        return gotPortals;
    }
    
    // reset score method
    public void resetScore()
    {
        gotPortals = 0;
    }
     
    // Increse number of portals
    public void gainPortal() 
    {
        gotPortals++;
        updatePortal(portalImg);
    }
}
