import java.io.*;
import java.util.*;

public class ChessGame {

	public static ArrayList<String> parseInput(BufferedReader br) throws IOException
	{
		ArrayList<String> parsedInput = new ArrayList<String> ();
		String pattern = "([0-9]+)([.]+)";
		String[] tempParsed = {};
		for(String line; (line = br.readLine()) != null; ) {
			tempParsed = line.split(pattern);
			for(String p : tempParsed)
			{
				parsedInput.add(p);
			}	
			
	    }
		

		String[] casedInput = new String[2];
		for(int i=0; i<parsedInput.size();i++)
		{
			if(parsedInput.get(i).equalsIgnoreCase(""))
				parsedInput.remove(i);
			else
			{
				casedInput = parsedInput.get(i).split(" ");
				parsedInput.set(i, (casedInput[0].toUpperCase() + " " + casedInput[1].toLowerCase()));
			}
		
		}
		
		return parsedInput;
	}
	public static void main(String[] args) throws IOException
	{
		File file = new File("C:/Users/test/Downloads/Bootcamp/Programs/Akopian.pgn");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> positionsInput = new ArrayList<String> ();
		positionsInput = parseInput(br);
		for(String p : positionsInput)
			System.out.println(p);
		
		ChessBoard boardObject = new ChessBoard();
		
		char[][] boardFinalState = boardObject.calculateFinalState(positionsInput);
		
	}
}
