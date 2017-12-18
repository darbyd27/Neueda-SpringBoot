package Test;

import java.util.ArrayList;



public class Whale extends Animal
{	
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;
	
	public Whale() {
		super();
	}

	public String getMainOcean() {
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	
	@Override
	public String toString() {
		return "Whale - Ocean: " + mainOcean + ", Weight: " + weight + ", Speed: " + maxSpeed + ", Length: " + length + "\n";
	}
	
	
	
	//Atlantic Method
	public String ocean()
	
	{
		if (getMainOcean().equals("Atlantic"))
		{
			System.out.println("\t" + getMainOcean());
		}
		return mainOcean + weight;
		}      
	  
	        	  
	
	
	
	
	        	  
//	        	  for(int i=0; i<whales.size(); i++)
//		  	      {  
//	        		  
//	        		  String where = getMainOcean;
//	        		  
//	        		  if(where == "Atlantic")
//	        		  {
//	        			  System.out.println(whales[i]);
//	        		  }
//		  	      }
	        	  
	        	  
	        	  
	          
	  	       
	  	        
	          
		
	
	
	//Speed method
//	private int Average(ArrayList <Whale> whales) {
//	      int sum = 0;
//	      for (int i=0; i< whales.size(); i++) {
//	            sum += i;
//	      }
//	      return sum / whales.size();

   
	    /* Method for getting the minimum value
	    public static int getMin(int[] inputArray){ 
	      int minValue = inputArray[0]; 
	      
	      for(int i=1;i<inputArray.length;i++){ 
	        if(inputArray[i] < minValue){ 
	          minValue = inputArray[i]; 
	        } 
	      } 
	      return minValue;
	      */
	       
}

