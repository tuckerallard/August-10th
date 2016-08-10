package ssa.tiy.week2.day8.august10.assignment;

public class Airbus extends CommercialAirplane
{
	private boolean bagsChecked = false;

	public Airbus(int doors, int windows, int seats, int wheels, int wings, int pilotsNeeded, int flightAttendants,
			float wingspan, String snacksServed, boolean servesAlcohol, boolean bagsChecked)
	{
		super(doors, windows, seats, wheels, wings, pilotsNeeded, flightAttendants, wingspan, snacksServed,
				servesAlcohol);
		this.bagsChecked = bagsChecked;
	}

	public boolean isBagsChecked()
	{
		return bagsChecked;
	}

	public void setBagsChecked(boolean bagsChecked)
	{
		this.bagsChecked = bagsChecked;
	}
	
}
