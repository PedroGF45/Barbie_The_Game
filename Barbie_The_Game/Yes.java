import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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

    // constructor for yes button
    public Yes(World world, Time time, Score score)
    {
        GreenfootImage yesBtn = getImage();
        Picture yesImg = new Picture(yesBtn, 10);
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
            
            // Check if current world is a Maze world
            if (currentWorld instanceof Maze)
            {
                Greenfoot.setWorld(new Maze(barbieHealth, new Barbie(barbieHealth), kenHealth, new Ken(kenHealth), currentScore, currentTime));
            }
            // Check if current world is a Fight world
            else if (currentWorld instanceof Fight)
            {
                Greenfoot.setWorld(new Fight(barbieHealth, new Barbie(barbieHealth), kenHealth, new Ken(kenHealth), currentScore, currentTime));
            }
            sound.play();
        }
    }
}
