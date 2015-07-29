import java.util.HashMap;

public class Chess
{
	HashMap <String, Square> Piece = new HashMap<String, Square>();
	//HashMap <String, String> Black = new HashMap<String, String>();
	
	Chess()
	{
		Square s[] = new Square[32];
		
		Piece.put("R1", s[0] = new Square(1,1));
		Piece.put("N1", s[1] = new Square(2,1));
		Piece.put("B1", s[2] = new Square(3,1));
		Piece.put("Q", s[3] = new Square(4,1));
		Piece.put("K", s[4] = new Square(5,1));
		Piece.put("B2", s[5] = new Square(6,1));
		Piece.put("N2", s[6] = new Square(7,1));
		Piece.put("R2", s[7] = new Square(8,1));
		
		Piece.put("P1", s[8] = new Square(1,2));
		Piece.put("P2", s[9] = new Square(2,2));
		Piece.put("P3", s[10] = new Square(3,2));
		Piece.put("P4", s[11] = new Square(4,2));
		Piece.put("P5", s[12] = new Square(5,2));
		Piece.put("P6", s[13] = new Square(6,2));
		Piece.put("P7", s[14] = new Square(7,2));
		Piece.put("P8", s[15] = new Square(8,2));
		
		Piece.put("r1", s[16] = new Square(1,8));
		Piece.put("n1", s[17] = new Square(2,8));
		Piece.put("b1", s[18] = new Square(3,8));
		Piece.put("q", s[19] = new Square(4,8));
		Piece.put("k", s[20] = new Square(5,8));
		Piece.put("b2", s[21] = new Square(6,8));
		Piece.put("n2", s[22] = new Square(7,8));
		Piece.put("r2", s[23] = new Square(8,8));
		
		Piece.put("p1", s[24] = new Square(1,7));
		Piece.put("p2", s[25] = new Square(2,7));
		Piece.put("p3", s[26] = new Square(3,7));
		Piece.put("p4", s[27] = new Square(4,7));
		Piece.put("p5", s[28] = new Square(5,7));
		Piece.put("p6", s[29] = new Square(6,7));
		Piece.put("p7", s[30] = new Square(7,7));
		Piece.put("p8", s[31] = new Square(8,7));
		
		
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

