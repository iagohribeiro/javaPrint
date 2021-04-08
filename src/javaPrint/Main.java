package javaPrint;

import java.util.Scanner;

public class Main {
	
	private static PrintElements message = new PrintElements();
	
	private static void header ()
	{
		//Input to example
		message.setName("Iagoh Ribeiro Lima");
		message.setNationality("Brazilian");
		message.setDream("To visit as many countries as I can and learn something "
							+ "of their culture that can be added to my daily life.");
		
		String helloMessage="-----------------------------\n" 
							+"Enter your name, nationality, and biggest dream. After that, "
							+ "you will get a result like the one below.\n"
							+ "	Ëxample: ";
		System.out.println(helloMessage);

		//Function to print the elements (Name, Nationality and Dream)
		message.printElements(message.getName(), message.getNationality(), message.getDream());
	}

	public static void main(String[] args)
	{
		//Information and example for the user
		header();

		//To get User input
		Scanner input = new Scanner(System.in);

		try
		{
			//Input from User
			System.out.println("----------------- Your data -----------------");
			System.out.println("Name: ");
			message.setName(input.nextLine());
			System.out.println("Nationality: ");
			message.setNationality(input.nextLine());
			System.out.println("Biggest Dream: ");
			message.setDream(input.nextLine());

			//Function to print the elements (Name, Nationality and Dream)
			message.printElements(message.getName(), message.getNationality(), message.getDream());
		}
		catch (java.util.InputMismatchException e)
		{
			System.out.println(e);
		}
	}

}
