import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RobotWorld here.
 * 
 * @author (Zachary) 
 * @version (Version 1 ; 3/29/2021)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        addObject( new Pizza(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        
        addObject( new Robot(), 30, 30); 
        addObject( new Wall(), 55, 173); 
        addObject( new Wall(), 160, 173);
        addObject( new Wall(), 260, 173);
        addObject( new Wall(), 642, 173);
        addObject( new Wall(), 748, 173);
        addObject( new Block(), 457, 173);
        addObject( new House(), 752, 751);
        addObject( new ScorePanel(), 83, 742);
    }
}
