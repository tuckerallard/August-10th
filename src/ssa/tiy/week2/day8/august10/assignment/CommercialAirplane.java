package ssa.tiy.week2.day8.august10.assignment;

public class CommercialAirplane extends Airplane
{
	public int doors = 0;
	public int windows = 0;
	public int seats = 0;
	public int wheels = 0;
	public int wings = 0;
	public int pilotsNeeded = 0;
	public int flightAttendants = 0;
	public float wingspan = 0.0f;
	public String snacksServed = null;
	public String whatTypeOfDrink = null;
	
	public CommercialAirplane(int doors, int windows, int seats, int wheels, int wings, int pilotsNeeded,
			int flightAttendants, float wingspan, String snacksServed, boolean servesAlcohol)
	{
		super();
		this.doors = doors;
		this.windows = windows;
		this.seats = seats;
		this.wheels = wheels;
		this.wings = wings;
		this.pilotsNeeded = pilotsNeeded;
		this.flightAttendants = flightAttendants;
		this.wingspan = wingspan;
		this.snacksServed = snacksServed;
		this.whatTypeOfDrink = whatTypeOfDrink;
	}

	public CommercialAirplane()
	{
		super();
	}

	public int getDoors()
	{
		return doors;
	}

	public void setDoors(int doors)
	{
		this.doors = doors;
	}

	public int getWindows()
	{
		return windows;
	}

	public void setWindows(int windows)
	{
		this.windows = windows;
	}

	public int getSeats()
	{
		return seats;
	}

	public void setSeats(int seats)
	{
		this.seats = seats;
	}

	public int getWheels()
	{
		return wheels;
	}

	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}

	public int getWings()
	{
		return wings;
	}

	public void setWings(int wings)
	{
		this.wings = wings;
	}

	public int getPilotsNeeded()
	{
		return pilotsNeeded;
	}

	public void setPilotsNeeded(int pilotsNeeded)
	{
		this.pilotsNeeded = pilotsNeeded;
	}

	public int getFlightAttendants()
	{
		return flightAttendants;
	}

	public void setFlightAttendants(int flightAttendants)
	{
		this.flightAttendants = flightAttendants;
	}

	public float getWingspan()
	{
		return wingspan;
	}

	public void setWingspan(float wingspan)
	{
		this.wingspan = wingspan;
	}

	public String getSnacksServed()
	{
		return snacksServed;
	}

	public void setSnacksServed(String snacksServed)
	{
		this.snacksServed = snacksServed;
	}

	public String getWhatTypeOfDrink()
	{
		return whatTypeOfDrink;
	}

	public void setWhatTypeOfDrink(String whatTypeOfDrink)
	{
		this.whatTypeOfDrink = whatTypeOfDrink;
	}

	@Override
	public void flies()
	{
		
	}

	@Override
	public void starts()
	{
		
	}

	@Override
	public void stops()
	{
		
	}

	@Override
	public String toString()
	{
		return " The CommercialAirplane you would like to fly on has " + doors + " doors and " + windows + " windows.\n It has " + seats + " seats, " + wheels
				+ " wheels, and " + wings + " wings. You want " + pilotsNeeded + " pilots and " + flightAttendants
				+ " flight attendants.\n The wingpsan of your plane is " + wingspan + " feet long. The snack you want to eat is " + snacksServed + ".\n The drink you want is " + whatTypeOfDrink
				+ ".\n \nAlright, that is not possible. Please lower your expectations!";
	}
	
}
