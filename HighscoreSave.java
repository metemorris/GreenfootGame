
//Not used in the program was created for testing

import java.io.*;
 
 public class HighscoreSave {
     private int score;
     private String name;
     FileOutputStream ofile;
     PrintWriter pw; 
	 public HighscoreSave(int uScore, String uName) throws IOException
	 {
		 score = uScore;
		 name = uName;
		ofile = new FileOutputStream("highscores.txt",true);
		pw= new PrintWriter(ofile);
		//declare file input stream
		//declare scanner
	 }
	 public void WriteFile() throws IOException
	 { 
	  //= new FileOutputStream("highscores.txt",false);
	  //= new PrintWriter(ofile);
	  //scann the file save it as an object
	  //call the insert method  of that object with score and name
	  //print the file again.
	  //catch if there is no file create a new file and enter the score as the first thingy
	  pw.println(score+"  "+name);
	  pw.close();
	  
	 }
	 
	 /*public boolean CheckTop10(){
	     
	     
	     
	   }*/
	 
	 
	 
	 
 }