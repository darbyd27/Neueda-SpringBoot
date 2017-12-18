package Test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ship> spaceShips = new ArrayList<Ship>();
		
		Ship falcon = new Ship();
		
		falcon.setXpos(20);
		falcon.setXpos(30);
		falcon.setDirection("Forward");
		falcon.setSpeed(110);
		
		Ship xWing = new Ship();
		xWing.setXpos(20);
		xWing.setXpos(30);
		xWing.setDirection("Forward");
		xWing.setSpeed(20);
		
		spaceShips.add(falcon);
		spaceShips.add(xWing);
		
		
		System.out.println(falcon);
		for (int i = 0; i < spaceShips.size(); i++)
		{
			System.out.println("\t" + spaceShips.get(i));
		}
		
	}

}
