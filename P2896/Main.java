package P2896;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String line;
		String[] split;
		
		line = scanner.nextLine();
		split = line.split(" ");
		
		double a, b, c;
		
		a = Integer.parseInt(split[0]);
		b = Integer.parseInt(split[1]);
		c = Integer.parseInt(split[2]);
		
		line = scanner.nextLine();
		split = line.split(" ");
		
		double i, j, k;
		
		i = Integer.parseInt(split[0]);
		j = Integer.parseInt(split[1]);
		k = Integer.parseInt(split[2]);
		
		double ratio = Math.min(a / i, Math.min(b / j, c / k));
		
		System.out.println((a - i * ratio) + " " + (b - j * ratio) + " " + (c - k * ratio));
	}
}
