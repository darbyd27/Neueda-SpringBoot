package Building;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Building.domain.Building;


@SpringBootApplication
public class BuildingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingApplication.class, args);
	}
	
	
	@PostConstruct
	public void createBuildings() {
		
ArrayList<Building> buildings = new ArrayList<Building>();
		
		Building first = new Building("first", "Floor", "first.png");
		buildings.add(first);
	}
	
	

	for (Building building : buildings)
	{	
		if(building.getCat().equals("Floor"))
		{
			
			System.out.println("\t" + building.getName());
		}
		
	}
}