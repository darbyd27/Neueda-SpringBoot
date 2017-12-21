package Test;


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
	
	//Print Whale Details
	@Override
	public String toString() {
		return  getName() + " Whale -> " + "Ocean: " + mainOcean + ", Weight: " + weight + ", Speed: " + maxSpeed + ", Length: " + length;
	}
	
	
	//Atlantic Method
	public void ocean()
	
	{
			if (getMainOcean().equals("Atlantic"))
			{
				System.out.print("\n" + getName());
			}
	}
	

	  
	//Speed method
	

//Length Method
public void longest()
{
	System.out.print("\n" + getLength());
}

//Weight Method
public void heaviest()

{
	System.out.print("\n" + getWeight());
}

}