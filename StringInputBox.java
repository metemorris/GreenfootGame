import greenfoot.*;
import java.awt.Color;
import java.io.*;
import java.util.*;
 //I copied this code from http://www.greenfoot.org/topics/5532, and it was written by danpost. I have done some major changes in the act part but the rest is his work
public class StringInputBox extends Actor
{
    static final int MAX_INPUT_LENGTH = 20;
    String text = "Enter a String";
    int score;
     
    public StringInputBox(int uScore)
    {
        updateImage();
        text = "";
        score = uScore;
    }
     
    private void updateImage()//to update the image
    {
        GreenfootImage image = new GreenfootImage(15*MAX_INPUT_LENGTH, 30);
        image.setColor(new Color(128, 0, 0));
        image.fill();
        image.setColor(Color.lightGray);
        image.fillRect(3, 3, image.getWidth()-6, 24);
        GreenfootImage textImage = new GreenfootImage(text, 24, Color.black, null);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, 15-textImage.getHeight()/2);
        setImage(image);
    }
 
    public void act() 
    {
        String key = Greenfoot.getKey();
        if (key == null) return;//if it is null nothing will happen
        if ("enter".equals(key) && text.length() > 0)//this is what happenes when enter is pressed
        {
            
            try{
            HighscoreObject hscore = new HighscoreObject(score,text);//creates a highscore object

            FileInputStream ifile =  new FileInputStream("highscores.txt");
            Scanner scan = new Scanner(ifile);
            int lines = 0;
            while(scan.hasNextInt()){//this part scan the document to see how many lines there are
               lines++;
                String garbage = scan.nextLine();
             }
            HighscoreObjectList mete = new HighscoreObjectList(lines, "highscores.txt");//this part calls the list and generates an orered list

        
            mete.insert(hscore);//inserts the highscore to the list
            
            FileOutputStream  ofile = new FileOutputStream("highscores.txt",false);
            
            PrintWriter pw= new PrintWriter(ofile);
            //this code is to print out the highscore to the text document
            if(lines<10){
            for(int i=0;i<lines+1;i++){
            pw.println(mete.getNextItem());
            }
            }
            else{
              for(int i=0;i<10;i++){
              pw.println(mete.getNextItem());
            } 
            }
            
            
            pw.close();

           }//this part is in case there is no existing highscore file. it simply creates one and writes the current score as the highscore
           catch (IOException ex){
               try{
             FileOutputStream  ofile = new FileOutputStream("highscores.txt",false);
            
            PrintWriter pw= new PrintWriter(ofile);
                pw.print(score+" "+text);
                pw.close();
            }
                 catch (IOException et){
                     System.out.println("hello");
                    }
             
            }
            Greenfoot.setWorld(new HighscoreWorld());  
        }
        //special input for special keys
        if ("backspace".equals(key) && text.length() > 0) text = text.substring(0, text.length() - 1);
        if ("escape".equals(key)) text = "";
        if ("space".equals(key)) key = "_";
        if (key.length() == 1 && text.length() < MAX_INPUT_LENGTH) text += key;
        updateImage();
    }
    
 
}