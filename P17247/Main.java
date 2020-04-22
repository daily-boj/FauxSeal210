package P17247;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		String[] split = line.split(" ");
		
		int height = Integer.parseInt(split[0].trim());

		int x_1 = -1, x_2 = 0, y_1 = 0, y_2 = 0;
		
		for (int i = 0; i < height; i++)
		{
			line = scanner.nextLine();
			split = line.split(" ");
			
			for (int j = 0; j < split.length; j++)
			{
				int x = Integer.parseInt(split[j].trim());
				
				if (x == 1)
				{
					if (x_1 == -1)
					{
						x_1 = j + 1;
						y_1 = i + 1;
					}
					else
					{
						x_2 = j + 1;
						y_2 = i + 1;
						
						break;
					}
				}
			}
		}
		
		int distance = Math.abs(x_2 - x_1) + Math.abs(y_2 - y_1);
		
		System.out.println(distance);
	}
}
