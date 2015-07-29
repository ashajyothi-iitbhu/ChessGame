import java.util.HashMap;

public class Chess
{
	HashMap <String, String> Piece = new HashMap<String, String>();
	//HashMap <String, String> Black = new HashMap<String, String>();
	
	Chess()
	{
		Piece.put("R1", "A1");
		Piece.put("N1", "B1");
		Piece.put("B1", "C1");
		Piece.put("Q", "D1");
		Piece.put("K", "E1");
		Piece.put("B2", "F1");
		Piece.put("N2", "G1");
		Piece.put("R2", "H1");
		Piece.put("P1", "A2");
		Piece.put("P2", "B2");
		Piece.put("P3", "C2");
		Piece.put("P4", "D2");
		Piece.put("P5", "E2");
		Piece.put("P6", "F2");
		Piece.put("P7", "G2");
		Piece.put("P8", "H2");
		
		Piece.put("r1", "A8");
		Piece.put("n1", "B8");
		Piece.put("b1", "C8");
		Piece.put("q", "D8");
		Piece.put("k", "E8");
		Piece.put("b2", "F8");
		Piece.put("n2", "G8");
		Piece.put("r2", "H8");
		Piece.put("p1", "A7");
		Piece.put("p2", "B7");
		Piece.put("p3", "C7");
		Piece.put("p4", "D7");
		Piece.put("p5", "E7");
		Piece.put("p6", "F7");
		Piece.put("p7", "G7");
		Piece.put("p8", "H7");
	}
	
	public void findNextPosition()
	{
		String input = "E5";
		int i = checkWhichPiece(input);
		switch(i)
		{
			case 0: pawn(input); break;
			case 3: bishop(input); break;
			case 4: night(input); break;
			case 5: rook(input); break;
		}
	}
	
	public int checkWhichPiece(String s)
	{
		if (s.charAt(0) == 'k' || s.charAt(0) == 'K') return 1;
		else if (s.charAt(0) == 'q' || s.charAt(0) == 'Q') return 2;
		else if (s.charAt(0) == 'b' || s.charAt(0) == 'B') return 3;
		else if (s.charAt(0) == 'n' || s.charAt(0) == 'N') return 4;
		else if (s.charAt(0) == 'r' || s.charAt(0) == 'R') return 5;
		else return 0;
	}
	
	public void pawn(String s)
	{
		
	}
	
	public void night(String s)
	{
		
	}
	
	public void bishop(String s)
	{
		
	}
	
	public void rook(String s)
	{
		
	}
}

