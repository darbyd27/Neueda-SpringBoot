package JavaExample;
import java.util.ArrayList;

public class Main
{//Class Start
	
	public static void main(String[] args)
	{//Class Start
		
	ArrayList<String>dwarfs = new ArrayList<String>();
	dwarfs.add("Happy");
	dwarfs.add("Sleepy");
	dwarfs.add("Dopey");
	dwarfs.add("Bashful");
	dwarfs.add("Sneezy");
	dwarfs.add("Doc");
	dwarfs.add("Grumpy");
	
	ArrayList<String>dwarves = new ArrayList<String>();
	dwarves.add("Thorin");
	dwarves.add("Balin");
	dwarves.add("Dwalin");
	dwarves.add("Fili");
	dwarves.add("Kili");
	dwarves.add("Dori");
	dwarves.add("Nori");
	dwarves.add("Oin");
	dwarves.add("Ori");
	dwarves.add("Gloin");
	dwarves.add("Bifur");
	dwarves.add("Bofur");
	dwarves.add("Bombur");
	 
		System.out.println("Disney");
		for (int i = 0; i < dwarfs.size(); i++)
		{
			System.out.println("\t" + dwarfs.get(i));
		}
     
		System.out.println("Hobbit");
		for (int i = 0; i < dwarves.size(); i++)
		{
			System.out.println("\t" + dwarves.get(i));
		}
    
	}//Main End
}//Class End