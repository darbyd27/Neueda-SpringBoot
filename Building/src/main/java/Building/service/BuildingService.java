package Building.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import Building.domain.Building;

@Service

	public class BuildingService {
	private ArrayList<Building> floorBuildings;	
	
	public BuildingService() {
		super();
	}

	public ArrayList<Building> getFloorBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();

		Building firstFloor = new Building("First", "Floor", "FirstFloor.png");
		buildings.add(firstFloor);
		Building secondFloor = new Building("Second", "Floor", "SecondFloor.png");
		buildings.add(secondFloor);
		

		return buildings;
		
		
	
	

	
}
}