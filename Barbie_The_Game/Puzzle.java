import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle extends World
{
       
    private int playerHearts = 5;
    
    private Time time;
    private Score score;
    private Health barbieHealth;
    private Barbie barbie;
    private Health kenHealth;
    private Ken ken;
    private int iSound;
    
    public void act()
    {
        openPortal();
        checkWinPuzzle();
    }
    
    public Puzzle(Time time)
    {    
        // Create a new world with 800x800 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        this.time = time;
        prepare();
    }
    
    public void prepare()
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        // Add time
        addObject(time, 725, 775);

        // Add score
        score = new Score();
        addObject(score, getWidth()/2, 50);

        // Add Health bars and players
        barbieHealth = new Health(playerHearts);
        addObject(barbieHealth, 110, 50);

        GreenfootImage barbieIcon = new GreenfootImage("../barbie.png");
        Picture barbieIconImg = new Picture(barbieIcon, 20);
        addObject(barbieIconImg, 190, 50);

        barbie = new Barbie(barbieHealth);
        addObject(barbie,95,700); 

        kenHealth = new Health(playerHearts);
        addObject(kenHealth, 700, 50);

        GreenfootImage kenIcon = new GreenfootImage("../ken.png");
        Picture kenIconImg = new Picture(kenIcon, 15);
        addObject(kenIconImg, 620, 50);

        ken = new Ken(kenHealth);
        addObject(ken,725,75);
        
        // Add divider wall
        for(int i=0; i<17;i++){
            addObject(new Square(), getWidth()/2, getHeight()-(i*50));
        }
        
        // Add chests
        addObject(new Chest__1(), getWidth()/4, getHeight()/5);
        addObject(new Chest__2(), 3*(getWidth()/4), getHeight()/5);
        
        // Add clothes randomly
        addObject(new PantsK(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new PantsB(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new HatB1(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new HatB2(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new ShirtB(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new DressB(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new PantsK(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new ShirtK(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new HatK1(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        addObject(new HatK2(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()-(getHeight()/4))+(getHeight()/4));
        
        // Add holes to pass clothes
        addObject(new Hole_1(), (getWidth()/2)-50, getHeight()/5); 
        addObject(new Hole_2(), (getWidth()/2)+50, getHeight()/5);
        // Add the portal boost
        //Portal portal = new Portal();
        //addObject(portal,410,405);
    }
    
    // Encapsulation methods
    public Barbie getBarbie()
    {
        return barbie;
    }
    
    public Health getBarbieHealth()
    {
        return barbieHealth;
    }
    
    public Ken getKen()
    {
        return ken;
    }
    
    public Health getKenHealth()
    {
        return kenHealth;
    }
    
    public Score getScore()
    {
        return score;
    }
    
    public Time getTime()
    {
        return time;
    }
    
    // check if both players are hitting the portal and set next level
    private void checkWinPuzzle()
    {
        if (ken.ishittingPortal() && barbie.ishittingPortal())
        {
            // increase number of portals
            score.gainPortal();
            //removeTouching(Portal.class);
            Greenfoot.setWorld(new Maze(barbieHealth, barbie, kenHealth, ken, score, time));
        }
    }
    
    private void openPortal(){
        if(getObjects(KenObjects.class).size()==0){
            if(getObjects(BarbieObjects.class).size()==0){
                if (iSound==0){
                    Greenfoot.playSound("../SomPortal/portal.mp3");
                    iSound++;
                }
                Portal portal = new Portal();
                addObject(portal,410,405);
            }
        }
    }
}
