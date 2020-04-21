package P13301;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int amount = scanner.nextInt();
		
		long a, b;
		
		long[] tiles = new long[amount + 2];
		tiles[1] = 1;
		
		for (int i = 2; i < amount + 2; i++)
		{
			tiles[i] = tiles[i - 1] + tiles[i - 2];
		}
		
		int length = tiles.length;
		
		a = tiles[length - 1];
		b = tiles[length - 2];
		
		System.out.println((a + b) * 2);
	}
}
