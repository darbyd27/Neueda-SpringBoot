package Building;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Building.domain.Building;


@SpringBootApplication
public class BuildingApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(BuildingApplication.class, args);
	}
	

	
}