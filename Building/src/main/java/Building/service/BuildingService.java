package Building.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import Building.domain.Building;

@Service

	public class BuildingService {
	private ArrayList<Building> floorBuildings;	
	private ArrayList<Building> footBuildings;	
	
	
	public BuildingService() {
		super();
	}

	public ArrayList<Building> getfloorBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building first = new Building("1st", "Floor","New Century Global Center", "1,760,000 m\u00B2", "1_New Century Global Center.jpg");
		buildings.add(first);
		Building second = new Building("2nd", "Floor", "Dubai International Airport Terminal 3", "1,713,000 m\u00B2","2_Dubai International Airport Terminal 3.jpg");
		buildings.add(second);
		Building third = new Building("3rd", "Floor", "Abraj Al-Bait Endowment", "1,575,815 m\u00B2","3_Abraj Al-Bait Endowment.jpg");
		buildings.add(third);
		Building fourth = new Building("4th", "Floor", "CentralWorld", "1,024,000 m\u00B2","4_CentralWorld.jpg");
		buildings.add(fourth);
		Building fifth = new Building("5th", "Floor", "Aalsmeer Flower Auction", "990,000 m\u00B2","5_Aalsmeer Flower Auction.jpg");
		buildings.add(fifth);
		Building sixth = new Building("6th", "Floor", "Beijing Capital International Airport Terminal 3", "986,000 m\u00B2","6_Beijing Capital International Airport Terminal 3.jpg");
		buildings.add(sixth);
		Building seventh = new Building("7th", "Floor", "The Venetian Macao", "980,000 m\u00B2","7_The Venetian Macao.jpg");
		buildings.add(seventh);
		Building eighth = new Building("8th", "Floor", "Sands Cotai Central", "890,000 m\u00B2","8_Sands Cotai Central.jpg");
		buildings.add(eighth);
		Building ninth = new Building("9th", "Floor", "Ciputra World Surabaya", "750,000 m\u00B2","9_Ciputra World Surabaya.jpg");
		buildings.add(ninth);
		Building tenth = new Building("10th", "Floor", "Berjaya Times Square", "700,000 m\u00B2","10_Berjaya Times Square.jpg");
		buildings.add(tenth);
		return buildings;
		
}
	
public ArrayList<Building> getfootBuildings(){
		
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building first = new Building("1st", "Foot","Aalsmeer Flower Auction", "518,000 m\u00B2", "1_Aalsmeer Flower Auction.jpg");
		buildings.add(first);
		Building second = new Building("2nd", "Foot", "Tesla Factory", "427,354 m\u00B2","2_Tesla Factory.jpg");
		buildings.add(second);
		Building third = new Building("3rd", "Foot", "Boeing Everett Factory", "398,000 m\u00B2","3_Boeing Everett Factory.jpg");
		buildings.add(third);
		Building fourth = new Building("4th", "Foot", "Michelin Distribution Center", "371,612 m\u00B2","4_Michelin Distribution Center.jpg");
		buildings.add(fourth);
		Building fifth = new Building("5th", "Foot", "Great Mosque of Mecca", "356,000 m\u00B2","5_Great Mosque of Mecca.jpg");
		buildings.add(fifth);
		Building sixth = new Building("6th", "Foot", "Nike - North America Logistics Center", "260,000 m\u00B2","6_Nike - North America Logistics Center.jpg");
		buildings.add(sixth);
		Building seventh = new Building("7th", "Foot", "John Deere North American Parts Distribution Center", "246,000 m\u00B2","7_John Deere North American Parts Distribution Center.jpg");
		buildings.add(seventh);
		Building eighth = new Building("8th", "Foot", "Mall of Dubai", "500,000 m\u00B2","8_Mall of Dubai.jpg");
		buildings.add(eighth);
		Building ninth = new Building("9th", "Foot", "Mitsubishi Motors North America", "220,000 m\u00B2","9_Mitsubishi Motors North America.jpg");
		buildings.add(ninth);
		Building tenth = new Building("10th", "Foot", "Indonesia Convention Exhibition", "220,000 m\u00B2","10_Indonesia Convention Exhibition.jpg");
		buildings.add(tenth);
		return buildings;
		
}
	
public ArrayList<Building> getvolBuildings(){
	
	ArrayList<Building> buildings = new ArrayList<Building>();
	
	Building first = new Building("1st", "Vol","Boeing Everett Factory", "13.3 million m\u00B3", "1_Boeing Everett Factory.jpg");
	buildings.add(first);
	Building second = new Building("2nd", "Vol", "Great Mosque of Mecca", "approx. 8  million m\u00B3","2_Great Mosque of Mecca.jpg");
	buildings.add(second);
	Building third = new Building("3rd", "Vol", "Jean Luc Lagardere Plant", "5.6 million m\u00B3","3_Jean Luc Lagardere Plant.jpg");
	buildings.add(third);
	Building fourth = new Building("4th", "Vol", "Boeing Composite Wing Center", "3.7 million m\u00B3","4_Boeing Composite Wing Center.jpg");
	buildings.add(fourth);
	Building fifth = new Building("5th", "Vol", "Aerium", "5.2 million m\u00B3","5_Aerium.jpg");
	buildings.add(fifth);
	Building sixth = new Building("6th", "Vol", "Meyer Werft Dockhalle 2", "4.72 million m\u00B3","6_Meyer Werft Dockhalle 2.jpg");
	buildings.add(sixth);
	Building seventh = new Building("7th", "Vol", "NASA Vehicle Assembly Building", "3.66 million m\u00B3","7_NASA Vehicle Assembly Building.jpg");
	buildings.add(seventh);
	Building eighth = new Building("8th", "Vol", "The O2", "2.79 million m\u00B3","8_The O2.jpg");
	buildings.add(eighth);
	Building ninth = new Building("9th", "Vol", "Tesco Ireland Distribution Centre", "1.55 million m\u00B3","9_Mitsubishi Motors North America.jpg");
	buildings.add(ninth);
	Building tenth = new Building("10th", "Vol", "Target Import Warehouse", "1.5 million m\u00B3","10_Target Import Warehouse.jpg");
	buildings.add(tenth);
	return buildings;
	
}

	
	
	
	
}