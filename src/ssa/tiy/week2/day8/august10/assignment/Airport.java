package ssa.tiy.week2.day8.august10.assignment;

import java.util.Scanner;

import javax.script.ScriptException;

public class Airport
{
	public static void main(String[] args)
	{
		Scanner crashAndBurn = new Scanner(System.in);
		String userAirplaneInput = null;
		boolean userMistake = false;
		int airplaneTrait = 0;
		float airplaneTraitFloat = 0.0f;
		String airplaneTraitString = null;
		boolean airplaneTraitBoolean = false;
		CommercialAirplane ourNewPlane = new CommercialAirplane();
		
		System.out.println("Welcome to Tucker's airport!");
		System.out.println("Please answer some questions about your flight needs today.\n");
		System.out.println("Where would you like to travel today?");
		String userDestination = crashAndBurn.nextLine();
		
		do
		{
			System.out.println("How many doors do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setDoors(airplaneTrait);
		
		do
		{
			System.out.println("How many windows do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWindows(airplaneTrait);
		
		do
		{
			System.out.println("How many seats do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setSeats(airplaneTrait);
		
		do
		{
			System.out.println("How many wheels do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWheels(airplaneTrait);
		
		do
		{
			System.out.println("How many wings do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setWings(airplaneTrait);
		
		do
		{
			System.out.println("How many pilots do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setPilotsNeeded(airplaneTrait);
		
		do
		{
			System.out.println("How many flight attendants do you want the plane to have?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = numberEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTrait = Integer.parseInt(userAirplaneInput);
		ourNewPlane.setFlightAttendants(airplaneTrait);

		do
		{
			System.out.println("How large is the wingspan of your plane?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = floatEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		
		airplaneTraitFloat = Float.parseFloat(userAirplaneInput);
		ourNewPlane.setWingspan(airplaneTraitFloat);
	
		do
		{
			System.out.println("What snack would you like served on the flight?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = stringEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		airplaneTraitString = userAirplaneInput;

		ourNewPlane.setSnacksServed(airplaneTraitString);
		
		do
		{
			System.out.println("What would you like to drink on the flight?");
			userAirplaneInput = crashAndBurn.nextLine();
			
			userMistake = stringEnteredIsValid(userAirplaneInput);
		} while(userMistake);
		airplaneTraitString = userAirplaneInput;

		ourNewPlane.setWhatTypeOfDrink(airplaneTraitString);
		
		System.out.println(" The place you would like to travel to is " + userDestination + ".");
		System.out.println(ourNewPlane.toString());
		
	}
	
	public static boolean numberEnteredIsValid(String someStringToCreateANumber)
	{
		try
		{
			int aNumber = Integer.parseInt(someStringToCreateANumber);
			return false;
		} catch (NumberFormatException e)
		{
			return true;
		}
	}
	
	public static boolean floatEnteredIsValid(String someStringToCreateAFloat)
	{
		try
		{
			float aFloat = Float.parseFloat(someStringToCreateAFloat);
			return false;
		} catch(NumberFormatException e)
		{
			return true;
		}
	}
	
	public static boolean stringEnteredIsValid(String someStringToCreateAString)
	{
		try
		{
			float aFloat = Float.parseFloat(someStringToCreateAString);

			return true;
		} catch(NumberFormatException e)
		{
			return false;
		}
	}


}
