package P1357;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		String[] split = line.split(" ");
		
		int a = Integer.parseInt(split[0].trim());
		int b = Integer.parseInt(split[1].trim());
		
		System.out.println(reverse(reverse(a) + reverse(b)));
	}
	
	static int reverse(int num)
	{
		StringBuilder stringBuilder = new StringBuilder(num + "");
		
		return Integer.parseInt(stringBuilder.reverse().toString());
	}
}
