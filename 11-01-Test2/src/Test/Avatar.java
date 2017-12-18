package Test;


class Avatar
{//Class Start
	
	//Variables
	private int xpos;
	private int ypos;
	private String direction;
	private int speed;

	
	
	public Avatar() {
		super();
	}


	//Constructor
	public Avatar(int xpos, int ypos, String direction, int speed)
	{
		super();
		this.xpos = xpos;
		this.ypos = ypos;
		this.direction = direction;
		this.speed = speed;
	}


	//Getters and Setters
	public int getXpos()
	{
		return xpos;
	}

	public void setXpos(int xpos)
	{
		this.xpos = xpos;
	}

	public int getYpos()
	{
		return ypos;
	}

	public void setYpos(int ypos)
	{
		this.ypos = ypos;
	}

	public String getDirection()
	{
		return direction;
	}

	public void setDirection(String direction)
	{
		this.direction = direction;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	//To String Method
	@Override
	public String toString()
	{
		return "Avatar [xpos=" + xpos + ", ypos=" + ypos + ", direction=" + direction + ", speed=" + speed + "]";
	}


}//Class End