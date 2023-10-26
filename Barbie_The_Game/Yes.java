import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yes extends Button
{
    private World currentWorld;
    private Time currentTime;
    private Score currentScore;

    public void act()
    {
        checkMouse();
        checkClicked(new GreenfootSound("../start_game.mp3"));
    }
    
    public Yes(World world, Time time, Score score)
    {
        GreenfootImage noBtn = getImage();
        Picture noImg = new Picture(noBtn, 5);
        this.currentWorld = world;
        this.currentTime = time;
        this.currentScore = score;
    }
    
    // @override
    public void checkClicked(GreenfootSound sound)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Health barbieHealth = new Health(5);
            Health kenHealth = new Health(5);
            
            if (currentWorld instanceof Maze)
            {
                Greenfoot.setWorld(new Maze(barbieHealth, new Barbie(barbieHealth), kenHealth, new Ken(kenHealth), currentScore, currentTime));
            }
            else if (currentWorld instanceof Fight)
            {
                Greenfoot.setWorld(new Fight(barbieHealth, new Barbie(barbieHealth), kenHealth, new Ken(kenHealth), currentScore, currentTime));
            }
            sound.play();
        }
    }
}
