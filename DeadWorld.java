import greenfoot.*; 
import java.io.*;
import java.util.Scanner;
import java.awt.Color;

/**
 * Write a description of class DeadWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeadWorld extends World
{

    private String name;
    private int score;
    public DeadWorld(int pScore)
    {    
        
        super(600, 600, 1); 
        score = pScore;
        addObject(new TextField("Score :  "+score),300,300);//shpws users score
        addObject(new StringInputBox(score),300,200);//this is to get highscores
    }
    public void act(){
       
       
    }

}
