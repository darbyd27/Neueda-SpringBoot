package Test;


import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args)
	
	{


		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		Whale right = new Whale();
		right.setMainOcean("Atlantic");
		right.setWeight(2001);
		right.setMaxSpeed(21);
		right.setLength(16);
		
		Whale blue = new Whale();
		blue.setMainOcean("Pacific");
		blue.setWeight(2001);
		blue.setMaxSpeed(23);
		blue.setLength(16);
		
		Whale sperm = new Whale();
		sperm.setMainOcean("Atlantic");
		sperm.setWeight(1900);
		sperm.setMaxSpeed(20);
		sperm.setLength(40);
		
		Whale humpback = new Whale();
		humpback.setMainOcean("Antartic");
		humpback.setWeight(919);
		humpback.setMaxSpeed(13);
		humpback.setLength(13);
		
		System.out.println("Right " + right);
		System.out.println("Blue " + blue);
		System.out.println("Sperm " + sperm);
		System.out.println("Humpback " + humpback);
		
		
		//Using Atlantic Method
		right.ocean();
		
		
		
	}
		
//	int Atlantic = Antlantic(whales);
//	System.out.println(Atlantic);
//	
	
	
//Call method for Atlantic, ***********************never used arrays for this before
    
    
//	String where;
//	for (int i; )
	
		
/*Call Max Speed
	
	int max = getMax(whales);
	System.out.println("Maximum Speed is: " + max);
*/      
	
/* Calling getMin() method for getting min value
  int min = getMin(array);
  System.out.println("Minimum Value is: "+min)
*/

	   
		
	}








