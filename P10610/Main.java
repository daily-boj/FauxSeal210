package P10610;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		System.out.println(getLargestNumber(input));
	}
	
	static String getLargestNumber(String input)
	{
		List<Integer> integers = new ArrayList<>();
		
		int sum = 0;
		
		for (char c : input.toCharArray())
		{
			int num = Character.getNumericValue(c);
			
			sum += num;
			integers.add(num);
		}
		
		if (sum % 3 == 0 && integers.contains(0))
		{
			integers.sort(null);
			Collections.reverse(integers);
			
			StringBuilder result = new StringBuilder();
			
			for (int i : integers)
			{
				result.append(i);
			}
			
			return result.toString();
		}
		
		return "-1";
	}
}
