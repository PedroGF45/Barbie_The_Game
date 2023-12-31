import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Collections;
import javafx.util.Pair; // Import Pair from the JavaFX library

public class Maze extends World
{
    public int imageSize = 50;
    
    private Time time;
    private Score score;
    private Health barbieHealth;
    private Barbie barbie;
    private Health kenHealth;
    private Ken ken;
    
    // Variables to get random coordinates for Barbie and Ken
    private ArrayList<Pair<Integer, Integer>> coordinates;
    private Pair<Integer, Integer> coordBarbie;
    private Pair<Integer, Integer> coordKen;
    
    public void act()
    {
        checkWinMaze();
    }

    public Maze(Health barbieHealth, Barbie barbie, Health kenHealth, Ken ken, Score score, Time time) {
        super(800, 800, 1);
        
        this.barbieHealth = barbieHealth;
        this.barbie = barbie;
        this.kenHealth = kenHealth;
        this.ken = ken;
        this.score = score;
        this.time = time;
        
        coordinates = new ArrayList<>();
        coordinates.add(new Pair<>(75, 75));
        coordinates.add(new Pair<>(75, 700));
        coordinates.add(new Pair<>(725, 75));
        coordinates.add(new Pair<>(725, 700));
        
        prepare();
    }

    private void prepare()
    {
        // Scales the image to fit in the screen
        getBackground().scale(getWidth() + 115, getHeight() + 115);
        
        // build the outter layers of the maze
        int counter = 0;
        // top border 
        for (int i = imageSize / 2; i < getWidth(); i+=imageSize) {
            Square square = new Square();
            addObject(square, i, imageSize/2);
        }

        // bottom border
        for (int i = imageSize / 2; i < getWidth(); i+=imageSize) {
            Square square = new Square();
            addObject(square,i, getHeight() - imageSize/2);
        }

        // right border
        for (int i = imageSize / 2; i < getHeight() - imageSize; i+=imageSize) {
            Square square = new Square();
            addObject(square, imageSize/2, i);
        }

        // left border
        for (int i = imageSize + imageSize / 2; i < getHeight() - imageSize; i+=imageSize) {
            Square square = new Square();
            addObject(square, getWidth()- imageSize/2, i);
        }

        // build the inner layers of the maze
        Square square = new Square();
        addObject(square,75,625);
        Square square63 = new Square();
        addObject(square63,125,625);
        Square square64 = new Square();
        addObject(square64,175,725);
        Square square65 = new Square();
        addObject(square65,125,575);
        Square square67 = new Square();
        addObject(square67,175,575);
        Square square68 = new Square();
        addObject(square68,225,675);
        Square square69 = new Square();
        addObject(square69,125,525);
        Square square70 = new Square();
        addObject(square70,125,475);
        Square square71 = new Square();
        addObject(square71,75,125);
        Square square72 = new Square();
        addObject(square72,125,125);
        Square square73 = new Square();
        addObject(square73,225,125);
        Square square74 = new Square();
        addObject(square74,225,75);
        Square square75 = new Square();
        addObject(square75,225,175);
        Square square76 = new Square();
        addObject(square76,125,225);
        Square square77 = new Square();
        addObject(square77,125,275);
        Square square78 = new Square();
        addObject(square78,75,275);
        Square square79 = new Square();
        addObject(square79,75,375);
        Square square80 = new Square();
        addObject(square80,125,375);
        Square square81 = new Square();
        addObject(square81,175,375);
        Square square82 = new Square();
        addObject(square82,225,225);
        Square square83 = new Square();
        addObject(square83,225,275);
        Square square84 = new Square();
        addObject(square84,225,375);
        Square square85 = new Square();
        addObject(square85,275,375);
        Square square86 = new Square();
        addObject(square86,325,375);
        Square square87 = new Square();
        addObject(square87,325,325);
        Square square88 = new Square();
        addObject(square88,325,275);
        Square square89 = new Square();
        addObject(square89,325,125);
        Square square90 = new Square();
        addObject(square90,325,175);
        Square square91 = new Square();
        addObject(square91,375,125);
        Square square92 = new Square();
        addObject(square92,375,325);
        Square square93 = new Square();
        addObject(square93,425,325);
        Square square94 = new Square();
        addObject(square94,325,425);
        Square square95 = new Square();
        addObject(square95,325,475);
        Square square96 = new Square();
        addObject(square96,375,475);
        Square square97 = new Square();
        addObject(square97,475,375);
        Square square98 = new Square();
        addObject(square98,475,425);
        Square square99 = new Square();
        addObject(square99,475,475);
        Square square100 = new Square();
        addObject(square100,375,525);
        Square square101 = new Square();
        addObject(square101,375,575);
        Square square102 = new Square();
        addObject(square102,375,625);
        Square square103 = new Square();
        addObject(square103,375,675);
        Square square104 = new Square();
        addObject(square104,525,475);
        Square square105 = new Square();
        addObject(square105,675,725);
        Square square106 = new Square();
        addObject(square106,675,675);
        Square square107 = new Square();
        addObject(square107,675,625);
        Square square109 = new Square();
        addObject(square109,625,475);
        Square square110 = new Square();
        addObject(square110,725,475);
        Square square111 = new Square();
        addObject(square111,675,575);
        Square square112 = new Square();
        addObject(square112,625,575);
        Square square113 = new Square();
        addObject(square113,525,675);
        Square square114 = new Square();
        addObject(square114,475,675);
        Square square115 = new Square();
        addObject(square115,475,625);
        Square square116 = new Square();
        addObject(square116,475,575);
        Square square117 = new Square();
        addObject(square117,425,625);
        Square square118 = new Square();
        addObject(square118,525,575);
        Square square119 = new Square();
        addObject(square119,625,675);
        Square square120 = new Square();
        addObject(square120,275,575);
        Square square121 = new Square();
        addObject(square121,175,475);
        Square square122 = new Square();
        addObject(square122,225,475);
        Square square123 = new Square();
        addObject(square123,325,675);
        Square square124 = new Square();
        addObject(square124,675,375);
        Square square125 = new Square();
        addObject(square125,725,375);
        Square square126 = new Square();
        addObject(square126,575,375);
        Square square127 = new Square();
        addObject(square127,575,325);
        Square square128 = new Square();
        addObject(square128,525,325);
        Square square129 = new Square();
        addObject(square129,475,325);
        Square square130 = new Square();
        addObject(square130,575,225);
        Square square131 = new Square();
        addObject(square131,575,275);
        Square square132 = new Square();
        addObject(square132,675,275);
        Square square133 = new Square();
        addObject(square133,675,125);
        Square square134 = new Square();
        addObject(square134,725,125);
        Square square135 = new Square();
        addObject(square135,675,175);
        Square square136 = new Square();
        addObject(square136,575,75);
        Square square137 = new Square();
        addObject(square137,575,125);
        Square square138 = new Square();
        addObject(square138,475,225);
        Square square139 = new Square();
        addObject(square139,425,225);
        Square square140 = new Square();
        addObject(square140,475,125);
        Square square141 = new Square();
        addObject(square141,475,75);
        Square square142 = new Square();
        addObject(square142,375,225);

        // Add speedboost, lifeboost
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,74,574);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,374,171);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,525,375);
        LifeBoost lifeBoost = new LifeBoost();
        addObject(lifeBoost,677,328);
        LifeBoost lifeBoost2 = new LifeBoost();
        addObject(lifeBoost2,77,327);
        LifeBoost lifeBoost3 = new LifeBoost();
        addObject(lifeBoost3,175,525);
        LifeBoost lifeBoost4 = new LifeBoost();
        addObject(lifeBoost4,326,229);
        LifeBoost lifeBoost5 = new LifeBoost();
        addObject(lifeBoost5,522,626);
        

        // Add enemies
        Bird bird = new Bird();
        addObject(bird,375,503);
        //Bird bird2 = new Bird();
        //addObject(bird2,372,618);
        Bird bird3 = new Bird();
        addObject(bird3,375,734);
        Snake snake = new Snake();
        addObject(snake,70,322);
        Snake snake2 = new Snake();
        addObject(snake2,720,525);
        //Snake snake3 = new Snake();
        //addObject(snake3,615,725);
        Spider spider = new Spider();
        addObject(spider,264,325);
        Spider spider2 = new Spider();
        addObject(spider2,628,77);
        Spider spider3 = new Spider();
        addObject(spider3,526,79);
        //Spider spider4 = new Spider();
        //addObject(spider4,571,429);

        // Add portal at the middle
        Portal portal = new Portal();
        addObject(portal,410,400);
        
        // Add time
        addObject(time, 725, 775);
        
        // Add score
        addObject(score, 125, 775);

        // Add Health bars and players
        addObject(barbieHealth, 100, 50);
        
        GreenfootImage barbieIcon = new GreenfootImage("images/barbie.png");
        Picture barbieIconImg = new Picture(barbieIcon, 10);
        addObject(barbieIconImg, 100, 25);
        
        addObject(kenHealth, 700, 50);

        GreenfootImage kenIcon = new GreenfootImage("images/ken.png");
        Picture kenIconImg = new Picture(kenIcon, 10);
        addObject(kenIconImg, 700, 25);

        // Shuffle the list of coordinates to randomize the order
        Collections.shuffle(coordinates);

        // Pop the first 2 coordinates from the shuffled list
        coordBarbie = coordinates.get(0);
        coordKen = coordinates.get(1);

        // Add players at the selected coordinates
        addObject(barbie, coordBarbie.getKey(), coordBarbie.getValue());
        addObject(ken, coordKen.getKey(), coordKen.getValue());

    }
    
    // Encapsulation methods
    public Barbie getBarbie()
    {
        return barbie;
    }
    
    public Pair<Integer, Integer> getCoordBarbie(){
        return coordBarbie;
    }
    
    public Pair<Integer, Integer> getCoordKen(){
        return coordKen;
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
    private void checkWinMaze()
    {
        if (ken.ishittingPortal() && barbie.ishittingPortal())
        {
            GreenfootSound wrap = new GreenfootSound("sounds/warp.mp3");
            wrap.setVolume(50);
            wrap.play();
            // increase number of portals
            score.gainPortal();
            //removeTouching(Portal.class);
            Greenfoot.setWorld(new Fight(barbieHealth, barbie, kenHealth, ken, score, time));
        }
    }
}
