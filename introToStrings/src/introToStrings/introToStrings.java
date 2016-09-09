package introToStrings;

import java.util.Scanner;

public class introToStrings
{

		public static void main(String[] args)
	{
//			exercise1();
//			exercise2();
//			exercise3();
	}
			
			
				
			
				public static void exercise1()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please enter text that is in all caps.");
				String text = userInput.nextLine();
				
				
				System.out.println(text.substring (0,1) + text.toLowerCase().substring (1));
			}
		
				public static void exercise2()
			
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Please say whatever you want.");
					String text = userInput.nextLine();
					for (int i=0; i < text.length(); i++)
						{		
							System.out.println(text.substring (i,i+1));
						}
		
					
				}

				public static void exercise3()
				{
					Scanner userInput = new Scanner(System.in);
					System.out.println("Please say something and I will count the vowels.");
					String text = userInput.nextLine();
					int counter=0;
					for (int i=0; i <text.length(); i++)
						{
							switch (text.substring (i,i+1))
							{
								case "a":
								case "e":
								case "i":
								case "o":
								case "u":
									
										{
									counter++;
											break;
											
										}
								
							}
					
							
						}
					
					System.out.println("There are " + counter + " vowels.");
				}

	}


	
				
				


		