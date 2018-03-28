//An�l �elik - 160302021 

import java.util.*;

public class MainMethod 
{	
	public static void main(String[] args)
	{
		int count, choice, RAM, HDD;
		double inch, price;
		String resolution, type, model, cpuDesc, gpuDesc;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("How many items you want to add?: "); count = reader.nextInt();
		
		Electronics[] objectArray = new Electronics[count];
		
		for(int i=0 ; i<count ; i++)
		{
			System.out.print("Which item do you want to add? (1 for TV / 2 for Notebook): "); choice = reader.nextInt();
			
			if(choice == 1)
			{
				System.out.print("Enter inch: "); inch = reader.nextDouble();
				System.out.print("Enter resolution: "); resolution = reader.next();
				System.out.print("Enter type: "); type = reader.next();
				System.out.print("Enter model: "); model = reader.next();
				System.out.print("Enter price: "); price = reader.nextDouble();
				
				objectArray[i] = new TV(model, price, resolution, type, inch);
				
				System.out.println(i+1 + " item added to the store.");
			}
			
			else if(choice == 2)
			{
				System.out.print("Enter RAM amount: "); RAM = reader.nextInt();
				System.out.print("Enter storage amount: "); HDD = reader.nextInt();
				System.out.print("Enter model: "); model = reader.next();
				System.out.print("Enter price: "); price = reader.nextDouble();
				System.out.print("Enter CPU type: "); cpuDesc = reader.next();
				System.out.print("Enter GPU type: "); gpuDesc = reader.next();
				
				objectArray[i] = new Notebook(model, price, RAM, HDD, cpuDesc, gpuDesc);
				
				System.out.println(i+1 + " item added to the store.");
			}
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Items in the store:");
		
		for(int i=0 ; i<count ; i++)
			System.out.println("Item[" + i + "]: " + objectArray[i]);
		
	}
}
