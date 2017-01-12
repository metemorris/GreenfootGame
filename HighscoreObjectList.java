import java.io.*;
import java.util.*;
public class HighscoreObjectList {

	
	private final int maxSize = 100;
	private int numberOfItems;
	private int currentPos;//this is the current position that is why it is why it is not minus 1
	private HighscoreObject[] top10;
	
	
	public HighscoreObjectList(){
		numberOfItems=0;
		currentPos=0;
	    top10 = new HighscoreObject[maxSize];
	}
	
	public HighscoreObjectList(int arraySize){
		numberOfItems=0;
		currentPos=0;
		if(arraySize <= maxSize ){
	    top10 = new HighscoreObject[arraySize];
		}
		else{
			System.out.println("Error in array size. Maximum array size exceded.");
		     top10 = new HighscoreObject[maxSize];
		}
	}
	
	
	//to read the file from the saved document	
	public HighscoreObjectList(int noOfAppInFile, String filename) throws IOException {
		FileInputStream ifile =  new FileInputStream(filename);
		Scanner scan = new Scanner(ifile);
		numberOfItems=0;
		currentPos=0;
	    top10 = new HighscoreObject[maxSize];
		StringTokenizer st;
		
		
		while(scan.hasNextInt()){

		     int score = scan.nextInt();
		     String name = scan.next();
			
			
     		HighscoreObject newScore =new HighscoreObject(score,name);
			this.insert(newScore);
				
		
			

		}
	}
	//(1 point) public boolean isEmpty(), public boolean isFull(), public int length()
	public boolean isEmpty(){
		//returns true if it is empty else returns false
	   return (numberOfItems==0);
	}
	
	public boolean isFull(){
		return(numberOfItems == maxSize);
	}
	
	public int length(){
		return numberOfItems;
	}
	// not used but might be used in the future
	public HighscoreObject isThere( int score ){

		HighscoreObject returnValue;
		int first = 0; 
		int last = numberOfItems-1;
		int middle = 0;
		boolean found = false;
		//binary search
		
		while(last >= first && !found){
			middle = (first+last)/2;
			if( score == top10[middle].getScore()  ){
				found = true;//item has been found
			}
			else if(score < top10[middle].getScore()  ){
				last = middle-1;
			}
			else{
				first = middle + 1;
			}
		}
		if(found){//token check
			returnValue = top10[middle];
		}
		else{
			returnValue = null;
		}

		return returnValue;
	}
	//insert method
	public boolean insert(HighscoreObject uScore){
		boolean returnValue = false;
		if(!this.isFull()){
			int index = numberOfItems-1;
			while(index >= 0 && uScore.compareTo( top10[index] )>0)
			{//make sure compare to works in comparing and stuff
				top10[index+1]= top10[index];
				index--;
			}
			top10[index + 1 ] = uScore;
			numberOfItems++;
			returnValue=true;
		}
		
		return returnValue;
	} 
	
	//delete method not needed for now
	
	/*public boolean delete (int ){
		boolean returnValue=false;
		if( this.isThere(targetApplianceID) != null){
			for(int i = targetApplianceID; i<numberOfItems-1; i++){
				app [i] = app[i+1];
			}
			numberOfItems--;
			returnValue = true;
		}
		return returnValue;
	}*/
	//(2 points) public Appliance getNextItem() - returns a reference to the Appliance, or null if collection empty. 
	
	
	
	//Increments iterator with circular wraparound.
	public HighscoreObject getNextItem(){
		HighscoreObject next = top10[currentPos];
		if(currentPos == numberOfItems-1)
		 currentPos=0;
		else
		 currentPos++;
		
		return next;
	}
	//(1 point) public void resetList()
	public void resetList(){
		currentPos=0;
	}
	//(1 point) public string toString()
	public String toString(){
		
		return "Items = " +numberOfItems + " CurrentPosition=  "+currentPos;
	}
	//this method not used for now but might be used in the future
	public String printtop10(){
	    String returnValue= "";
	    if(numberOfItems<10){
	        for(int i=0; i<numberOfItems; i++){
	            returnValue = returnValue+"\n"+top10[i].toString();
	           }
	       }
	       else{
	           	for(int i=0; i<10; i++){
	            returnValue = returnValue+"\n"+top10[i].toString();
	           }
	       }
	       return returnValue;
	   }
	
	
}
