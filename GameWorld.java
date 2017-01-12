import greenfoot.*;

/**
 * Write a description of class GameWorld here.
 * 
 * @Mete Morris
 * @2015/05/08(yyyy,mm,dd)
 */
public class GameWorld extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    
    ScoreCounter score;
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        prepare();
     
  
    }
    
    public GameWorld(int points,int location)//this constructor is for getting the saved files.Passed arguments are from the resume button and the program loads these up in the places according to it
    {
        super(600, 600, 1); 
        score = new ScoreCounter();
        addObject(score, 300,15);
         score.add(points);     
        Player player = new Player(score);
        addObject(player, location,570);
        Pause_SaveButton pause = new Pause_SaveButton(score,player);
        addObject(pause,550,15);
       }

        public void act()
    {
        //these two if statements randomly generate fruits and death. The bigger the number is (inside the paranthesis) there is less chance of that object appearing
        if(Greenfoot.getRandomNumber(30) < 2) //
        {        
            addObject(new Death(score), Greenfoot.getRandomNumber(600), 0); 
        }
        if(Greenfoot.getRandomNumber(50) < 2) //
        {
            addObject(new Food(), Greenfoot.getRandomNumber(600), 0);  
        }
     
    }
    //adds all the objects
    private void prepare(){
    
        score = new ScoreCounter();
        addObject(score, 300,15);
        
       
        
        
        Player player = new Player(score);
        addObject(player, 50,570);
        Pause_SaveButton pause = new Pause_SaveButton(score,player);
        addObject(pause,550,15);
    
    }
    
    /*
    public void started()
    {
          if(Greenfoot.isKeyDown("f"))
          {
           ScoreCounter score = new ScoreCounter();
           addObject(score, 50,10);   
           Bullet bullet = new Bullet(score);
           addObject(bullet, 300,300);
          }
    }
    */
    
}
