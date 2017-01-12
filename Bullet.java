import greenfoot.*;

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Characters
{
    int life = 40;
    private ScoreCounter score; 
    public Bullet(ScoreCounter sCounter){
        score = sCounter;
       // removeBullet();
    }
    
    public void act() 
    {
        setLocation(getX(),getY()-5);//to make the bullet go up
        tryToEatFood();
        tryToEatDeath();
        if ( life <= 0 )
        {
            getWorld().removeObject(this);
        } 
        else 
        {
            setLocation ( getX(), getY() - 7 );
            life--;
        }         
    }   
    //eat methods for bullet
    private void tryToEatFood()
    {
      if(canSee(Food.class))
      {
      score.add(-1);
      eat(Food.class);
      }
    }
    
    private void tryToEatDeath()
    {
      if(canSee(Death.class))
      {
      score.add(1);
      eat(Death.class);
      }
    }
    

}
