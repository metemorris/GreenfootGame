
//Not used in the program was created for testing


import java.io.*;
import java.util.*;
public class test{
	public static void main(String[]args) throws IOException{
	//HighscoreObjectList mete = new HighscoreObjectList(3, "highscores.txt");
	//System.out.println(mete.toString()+"  "+mete.getNextItem());
	FileInputStream ifile =  new FileInputStream("highscores.txt");
	Scanner scan = new Scanner(ifile);
	//System.out.println(scan.nextLine());
	//StringTokenizer st;
	/*		    int lines = 0;
	while(scan.hasNextLine()){
	     lines++;
		 String garbage = scan.nextLine();
	}
	System.out.println(lines);*/
	boolean notEmpty=true;
	while(scan.hasNextLine()&&notEmpty){
			//parses all the scannned documents to respective data types
			//st = new StringTokenizer(scan.nextLine(),",");
			//int score= Integer.parseInt(st.nextToken());
			//String name = st.nextToken();
			if(scan.next().equals("")){
				notEmpty=false;
			}
		  int score = scan.nextInt();
		  String name = scan.next();
		System.out.println(score+" "+name);
		//System.out.println(name);
		//String garbage = scan.nextLine();
	}
	}	
	
	
	
	
	
}