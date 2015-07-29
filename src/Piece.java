import java.util.HashMap;

public class Piece
{
	private boolean available;
	HashMap <String, String> PiecePositionList = new HashMap<String, String>();
	//HashMap <String, String> Black = new HashMap<String, String>();
	
	Piece()
	{
		PiecePositionList.put("R1", "A1");
		PiecePositionList.put("N1", "B1");
		PiecePositionList.put("B1", "C1");
		PiecePositionList.put("Q", "D1");
		PiecePositionList.put("K", "E1");
		PiecePositionList.put("B2", "F1");
		PiecePositionList.put("N2", "G1");
		PiecePositionList.put("R2", "H1");
		PiecePositionList.put("P1", "A2");
		PiecePositionList.put("P2", "B2");
		PiecePositionList.put("P3", "C2");
		PiecePositionList.put("P4", "D2");
		PiecePositionList.put("P5", "E2");
		PiecePositionList.put("P6", "F2");
		PiecePositionList.put("P7", "G2");
		PiecePositionList.put("P8", "H2");
		
		PiecePositionList.put("r1", "A8");
		PiecePositionList.put("n1", "B8");
		PiecePositionList.put("b1", "C8");
		PiecePositionList.put("q", "D8");
		PiecePositionList.put("k", "E8");
		PiecePositionList.put("b2", "F8");
		PiecePositionList.put("n2", "G8");
		PiecePositionList.put("r2", "H8");
		PiecePositionList.put("p1", "A7");
		PiecePositionList.put("p2", "B7");
		PiecePositionList.put("p3", "C7");
		PiecePositionList.put("p4", "D7");
		PiecePositionList.put("p5", "E7");
		PiecePositionList.put("p6", "F7");
		PiecePositionList.put("p7", "G7");
		PiecePositionList.put("p8", "H7");
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
	
	public void setAvailable(boolean available) {
        this.available = available;
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

