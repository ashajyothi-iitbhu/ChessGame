import java.util.ArrayList;


public class PiecesManip 
{	
	Pieces pieces = new Pieces();
	public void findMovedPiece(char pieceType, int col, int row)
	{
		pieceType = 'P';
		col = 5;
		row = 5;
		int i = findPieceType(pieceType);
		switch(i)
		{
			case 1: updatePawnPos(col,row); break;
			case 2: whichBishop(col,row); break;
			case 3: whichNight(col,row); break;
			case 4: whichRook(col,row); break;
		}
	}
	
	public int findPieceType(char pieceType)
	{
		if (pieceType == 'p' || pieceType == 'P') return 1;
		else if (pieceType == 'b' || pieceType == 'B') return 2;
		else if (pieceType == 'n' || pieceType == 'N') return 3;
		else if (pieceType == 'r' || pieceType == 'R') return 4;
		else return 0;
	}
	
	public void updatePawnPos(int col, int row)
	{
		for( int i = 0; i < 8; i++)
		{
			if(pieces.P[i].col == col)
			{
				pieces.P[i].row++;
			}
		}
	}
	
	public void whichNight(int col, int row)
	{
		//generateNightPos();
		for(int i=0; i<2; i++)
		{
			if (Pieces.N[i].col == col && Pieces.N[i].row == row)
			{
				
			}
		}
	}
	
	public void whichBishop(int col, int row)
	{
		
	}
	
	public void whichRook(int col, int row)
	{
		
	}

	public int returnValidNight(int x1, int x2, int x3, int y1, int y2, int y3)
	{
		if((x1-1==x3 && y1+2 == y3) || (x1-1==x3 && y1-2 == y3) || 
				(x1+1==x3 && y1+2 == y3) || (x1+1==x3 && y1-2 == y3) || 
				(x1-2==x3 && y1+1 == y3) || (x1-2==x3 && y1-1 == y3) || 
				(x1+2==x3 && y1-1 == y3) || (x1+2==x3 && y1+1 == y3))
			return 1;
		else
			return 2;
	}
	public static void main(String args[]) 
	{
		PiecesManip pm = new PiecesManip();
		for(int i = 0; i < 8; i++)
		{
			System.out.println(pm.pieces.P[i].name +" "+ pm.pieces.P[i].col +" "+ pm.pieces.P[i].row);
		}
		pm.findMovedPiece('P',5,5);
		System.out.println("After move");
		for(int i = 0; i < 8; i++)
		{
			System.out.println(pm.pieces.P[i].name +" "+ pm.pieces.P[i].col +" "+ pm.pieces.P[i].row);
		}
	}

}
