import greenfoot.*;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Characters
{
     private ScoreCounter score;
     private int gunDelay;//these two variables are there so that there is a delay in shooting inspired by http://www.greenfoot.org/scenarios/1027
     private int minGunDelay;
     
    public Player (ScoreCounter sCounter)
    {
        score= sCounter;
        gunDelay = 0;
        minGunDelay = 20;
    }
     
     public void act() 
    {
        if (Greenfoot.isKeyDown("right"))
        {
         move(5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
         move(-5);
        }
        tryToEatFood();
        if(Greenfoot.isKeyDown("space")){
            fire();
        }
        gunDelay++;
        
    }    
    

    
   //the eating food method
     private void tryToEatFood()
      {
      if(canSee(Food.class))
      {
      eat(Food.class);
      score.add(1);
      }
      }
      
      //method to fire , used so that bullet is generated on top of the player
      private void fire()
      {
          if(gunDelay>= minGunDelay && score.getValue()>=0 ){
          Bullet bullet = new Bullet(score);
          getWorld().addObject(bullet,getX(),getY());
          gunDelay = 0;
          score.add(-1);
        }
      }
    
          
}


