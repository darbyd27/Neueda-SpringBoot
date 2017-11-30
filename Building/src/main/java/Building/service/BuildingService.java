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

	public ArrayList<Building> getfloorBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building first = new Building("1st", "Floor","New Century Global Center", "1,760,000 m\u00B2", "FirstFloor.jpg");
		buildings.add(first);
		Building second = new Building("2nd", "Floor", "Dubai International Airport Terminal 3", "1,713,000 m\u00B2","SecondFloor.jpg");
		buildings.add(second);
		Building third = new Building("3rd", "Floor", "Abraj Al-Bait Endowment", "1,575,815 m\u00B2","ThirdFloor.jpg");
		buildings.add(third);
		Building fourth = new Building("4th", "Floor", "CentralWorld", "1,024,000 m\u00B2","FourthFloor.jpg");
		buildings.add(fourth);
		Building fifth = new Building("5th", "Floor", "Aalsmeer Flower Auction", "990,000 m\u00B2","FifthFloor.jpg");
		buildings.add(fifth);
		Building sixth = new Building("6th", "Floor", "Beijing Capital International Airport Terminal 3", "986,000 m\u00B2","SixthFloor.jpg");
		buildings.add(sixth);
		Building seventh = new Building("7th", "Floor", "The Venetian Macao", "980,000 m\u00B2","SeventhFloor.jpg");
		buildings.add(seventh);
		Building eighth = new Building("8th", "Floor", "Sands Cotai Central", "890,000 m\u00B2","EighthFloor.jpg");
		buildings.add(eighth);
		Building ninth = new Building("9th", "Floor", "Ciputra World Surabaya", "750,000 m\u00B2","NinthFloor.jpg");
		buildings.add(ninth);
		Building tenth = new Building("10th", "Floor", "Berjaya Times Square", "700,000 m\u00B2","TenthFloor.jpg");
		buildings.add(tenth);
		return buildings;
		
}
	
public ArrayList<Building> getfootBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building first = new Building("1st", "Floor","New Century Global Center", "1,760,000 m\u00B2", "FirstFloor.jpg");
		buildings.add(first);
		Building second = new Building("2nd", "Floor", "Dubai International Airport Terminal 3", "1,713,000 m\u00B2","SecondFloor.jpg");
		buildings.add(second);
		Building third = new Building("3rd", "Floor", "Abraj Al-Bait Endowment", "1,575,815 m\u00B2","ThirdFloor.jpg");
		buildings.add(third);
		Building fourth = new Building("4th", "Floor", "CentralWorld", "1,024,000 m\u00B2","FourthFloor.jpg");
		buildings.add(fourth);
		Building fifth = new Building("5th", "Floor", "Aalsmeer Flower Auction", "990,000 m\u00B2","FifthFloor.jpg");
		buildings.add(fifth);
		Building sixth = new Building("6th", "Floor", "Beijing Capital International Airport Terminal 3", "986,000 m\u00B2","SixthFloor.jpg");
		buildings.add(sixth);
		Building seventh = new Building("7th", "Floor", "The Venetian Macao", "980,000 m\u00B2","SeventhFloor.jpg");
		buildings.add(seventh);
		Building eighth = new Building("8th", "Floor", "Sands Cotai Central", "890,000 m\u00B2","EighthFloor.jpg");
		buildings.add(eighth);
		Building ninth = new Building("9th", "Floor", "Ciputra World Surabaya", "750,000 m\u00B2","NinthFloor.jpg");
		buildings.add(ninth);
		Building tenth = new Building("10th", "Floor", "Berjaya Times Square", "700,000 m\u00B2","TenthFloor.jpg");
		buildings.add(tenth);
		return buildings;
		
}
	
	
	
	
	
	
}