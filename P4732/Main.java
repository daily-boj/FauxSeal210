package P4732;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
	static final List<String> SOUNDS = Arrays.asList("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#");
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		List<String> convertedCases = new ArrayList<>();
		
		String testCase = null;
		String line;
		
		while (scanner.hasNextLine())
		{
			line = scanner.nextLine();
			
			if (line.equals("***"))
				break;
			
			if (isNumeric(line))
			{
				int operator = Integer.parseInt(line);
				StringBuilder converted = new StringBuilder();
				
				for (String string : testCase.split(" "))
				{
					int operator_clone = operator;
					
					if (string.contains("b"))
					{
						string = string.replace("b", "");
						operator_clone -= 1;
					}
					
					if (string.contains("#") && !SOUNDS.contains(string))
					{
						string = string.replace("#", "");
						operator_clone += 1;
					}
					
					int index = SOUNDS.indexOf(string) + operator_clone;
					
					if (index >= SOUNDS.size())
					{
						index -= SOUNDS.size();
					}
					
					if (index < 0)
					{
						index = SOUNDS.size() + index;
					}
					
					converted.append(SOUNDS.get(index)).append(" ");
				}
				
				convertedCases.add(converted.toString().trim());
			}
			else
			{
				testCase = line;
			}
		}
		
		for (String converted : convertedCases)
			System.out.println(converted);
	}
	
	static boolean isNumeric(String input)
	{
		try
		{
			Integer.parseInt(input);
		}
		catch (NumberFormatException e)
		{
			return false;
		}
		
		return true;
	}
}
