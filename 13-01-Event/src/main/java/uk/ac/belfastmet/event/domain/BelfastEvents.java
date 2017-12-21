package uk.ac.belfastmet.event.domain;

import java.util.ArrayList;

public class BelfastEvents
{
	private ArrayList<Event> allEvents = new ArrayList<Event>();
	
	public BelfastEvents()
	{
	}

	public BelfastEvents(ArrayList<Event> allEvents)
	{
		this.allEvents = allEvents;
	}

	//Getter/Setters
	public ArrayList<Event> getAllEvents()
	{
		return allEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents)
	{
		this.allEvents = allEvents;
	}

}//End