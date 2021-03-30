import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       RobotMovement();
       detectWallCollision();
       detectBlockCollision();
    }  
    
    public void RobotMovement()
    {
        if( Greenfoot.isKeyDown( "up" ) )
        {
            setLocation( getX(), getY() - 5 );
        }
        
        if( Greenfoot.isKeyDown( "right" ) )
        {
            setLocation( getX() + 5, getY()); 
        }
        
        if( Greenfoot.isKeyDown( "left" ) )
        {
            setLocation( getX() - 5, getY()); 
        }
        
        if( Greenfoot.isKeyDown( "down" ) )
        {
            setLocation( getX(), getY() + 5);
        }
    }
    
    public void detectWallCollision()
    {        
        if( isTouching( Wall.class))
        {
            setLocation( 30, 30); 
        }
    }
    
    public void detectBlockCollision()
    {
        if( isTouching( Block.class))
        {
            setLocation( 30, 30); 
        }
    }
}
