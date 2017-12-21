package Test;


import java.util.ArrayList;
import java.util.Collections;

public class WhaleWatcher extends Whale
{


	public static void main(String[] args)
	
	{


		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		Whale right = new Whale();
		right.setName("Right");
		right.setMainOcean("Atlantic");
		right.setWeight(2001);
		right.setMaxSpeed(21);
		right.setLength(16);
		
		Whale blue = new Whale();
		blue.setName("Blue");
		blue.setMainOcean("Pacific");
		blue.setWeight(2001);
		blue.setMaxSpeed(23);
		blue.setLength(16);
		
		Whale sperm = new Whale();
		sperm.setName("Sperm");
		sperm.setMainOcean("Atlantic");
		sperm.setWeight(1900);
		sperm.setMaxSpeed(20);
		sperm.setLength(40);
		
		Whale humpback = new Whale();
		humpback.setName("Humpback");
		humpback.setMainOcean("Antartic");
		humpback.setWeight(919);
		humpback.setMaxSpeed(13);
		humpback.setLength(13);
		
		//Print Whale Details
		System.out.println(right);
		System.out.println(blue);
		System.out.println(sperm);
		System.out.println(humpback);
		
		//Using Atlantic Method
		System.out.print("\n" + "Atlantic Whale(s): ");
		right.ocean();
		blue.ocean();
		sperm.ocean();
		humpback.ocean();
		
		//Using Fastest Method
		
		ArrayList<Integer> speedArray = new ArrayList<Integer>();
		
		speedArray.add(right.getMaxSpeed());
		speedArray.add(blue.getMaxSpeed());
		speedArray.add(sperm.getMaxSpeed());
		speedArray.add(humpback.getMaxSpeed());
		
		Collections.sort(speedArray, Collections.reverseOrder());

		System.out.println("\n\n" + speedArray);			
			
	
		//Using length Method
		 
		int av = (right.getLength()
				+ blue.getLength()
				+ sperm.getLength()
				+ humpback.getLength())/4;
		
		System.out.println("\n\n" + av);	

		
		
		//Using Weight Method
		ArrayList<Integer> weightArray = new ArrayList<Integer>();
		
		weightArray.add(right.getWeight());
		weightArray.add(blue.getWeight());
		weightArray.add(sperm.getWeight());
		weightArray.add(humpback.getWeight());
		
		Collections.sort(weightArray, Collections.reverseOrder());

		System.out.println("\n\n" + weightArray);
		
		//System.out.println("\n\n" + "Average Speed: " + (a + b + c + d)/4);		
		
		
		
	}
		
	}








