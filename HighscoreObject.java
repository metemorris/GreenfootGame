import java.io.*;
 
 public class HighscoreObject implements Comparable <HighscoreObject>{
     private int score;
     private String name;
	 public HighscoreObject(int uScore, String uName) 
	 {
		 score = uScore;//no set methods needed but can be added in the future
		 name = uName;

	 }
	//getname
	public String getName(){
		return name;
	}
	
	//getscore
	public int getScore(){
		return score;
		}
	//compareTo
	public int compareTo(HighscoreObject that){
		int returnValue;
		if( this.getScore() == that.getScore() ){
			// returns 0 if this. is same as that.
			returnValue=0;
			
		}
		else if( this.getScore() > that.getScore() ) {
			// returns 1 if this. is greater than that
			
			returnValue=1;
		}
		else{// else returns -1 
			returnValue = -1;
		}

		return returnValue;
	}
	//tostring
	public String toString(){
		return score+"  "+ name;
	}
	
 }
	 