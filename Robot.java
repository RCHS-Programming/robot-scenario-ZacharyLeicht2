import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robot1= new GreenfootImage("man01.png");
    private GreenfootImage robot2= new GreenfootImage("man02.png");
    private int lives = 3;
    private int score = 0;
    private int pizzaEaten = 0; 
    private int animatecounter = 0;
    
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       RobotMovement();
       detectWallCollision();
       detectBlockCollision();
       detectHome();
       eatPizza();
    }  
    
    public void RobotMovement()
    {
        if( Greenfoot.isKeyDown( "up" ) )
        {
            setLocation( getX(), getY() - 5 );
            animate();
        }
        
        if( Greenfoot.isKeyDown( "right" ) )
        {
            setLocation( getX() + 5, getY());
            animate();
        }
        
        if( Greenfoot.isKeyDown( "left" ) )
        {
            setLocation( getX() - 5, getY()); 
            animate();
        }
        
        if( Greenfoot.isKeyDown( "down" ) )
        {
            setLocation( getX(), getY() + 5);
            animate();
        }
    }
    
    public void detectWallCollision()
    {        
        if( isTouching( Wall.class))
        {
            setLocation( 30, 30); 
            Greenfoot.playSound("hurt.wav");
        }
    }
    
    public void detectBlockCollision()
    {
        if( isTouching( Block.class))
        {
            setLocation( 30, 30); 
            Greenfoot.playSound("hurt.wav");
        }
    }
    
    public void detectHome()
    {
        if( isTouching( House.class))
        {
            setLocation( 30, 30);
            Greenfoot.playSound("yipee.wav");
        }
    }
    
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class); 
        }
    }
    
     /*
     * Switch the image of the Robot to Animate it 
     */
    public void animate()
    {
        if( getImage() == robot1) 
        {
            setImage( robot2 );
        }
        else
        {
            setImage( robot1 );
        }
    }
}
