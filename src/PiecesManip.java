
public class PiecesManip 
{	
	Pieces pieces = new Pieces();
	
	public void updatePiecePos(char pieceType, int col, int row)
	{
		int i = findPieceType(pieceType);
		switch(i)
		{
			case 1: updatePawn(pieceType, col,row); break;
			case 2: updateBishop(pieceType, col,row); break;
			case 3: updateNight(pieceType, col,row); break;
			case 4: updateRook(pieceType, col,row); break;
			case 5: updateKing(pieceType, col, row); break;
			case 6: updateQueen(pieceType, col, row); break;
		}
	}
	
	public int findPieceType(char pieceType)
	{
		if (pieceType == 'p' || pieceType == 'P') return 1;
		else if (pieceType == 'b' || pieceType == 'B') return 2;
		else if (pieceType == 'n' || pieceType == 'N') return 3;
		else if (pieceType == 'r' || pieceType == 'R') return 4;
		else if (pieceType == 'k' || pieceType == 'K') return 5;
		else if (pieceType == 'q' || pieceType == 'Q') return 6;
		else return 0;
	}
	
	public void updatePawn(char pieceType, int col, int row)
	{
		if(pieceType == 'P')
		{
			for( int i = 0; i < 8; i++)
			{
				if(pieces.P[i].col == col)
				{
					pieces.P[i].row = row;
				}
			}
		}
		else
		{
			for( int i = 0; i < 8; i++)
			{
				if(pieces.p[i].col == col)
				{
					pieces.p[i].row = row;
				}
			}
		}
	}
	
	public void updateKing(char pieceType, int col, int row)
	{
		if(pieceType == 'K')
		{
			Pieces.K.col = col;
			Pieces.K.row = row;
		}
		else
		{
			Pieces.k.col = col;
			Pieces.k.row = row;
		}
	}
	
	public void updateQueen(char pieceType, int col, int row)
	{
		if(pieceType == 'Q')
		{
			Pieces.Q.col = col;
			Pieces.Q.row = row;
		}
		else
		{
			Pieces.q.col = col;
			Pieces.q.row = row;
		}
	}
	
	public void updateNight(char pieceType, int col, int row)
	{
		if(pieceType == 'N')
		{
			int index = whichNight(Pieces.N[0].col, Pieces.N[1].col, col, Pieces.N[0].row, Pieces.N[1].row, row );
			Pieces.N[index-1].col = col;
			Pieces.N[index-1].row = row;
		}
		else
		{
			int index = whichNight(Pieces.n[0].col, Pieces.n[1].col, col, Pieces.n[0].row, Pieces.n[1].row, row );
			Pieces.n[index-1].col = col;
			Pieces.n[index-1].row = row;
		}
	}
	
	public void updateBishop(char pieceType, int col, int row)
	{
		if(pieceType == 'B')
		{
			int index = whichBishop(Pieces.B[0].col, Pieces.B[1].col, col, Pieces.B[0].row, Pieces.B[1].row, row );
			Pieces.B[index].col = col;
			Pieces.B[index].col = col;
		}
		else
		{
			int index = whichBishop(Pieces.b[0].col, Pieces.b[1].col, col, Pieces.b[0].row, Pieces.b[1].row, row );
			Pieces.b[index].col = col;
			Pieces.b[index].col = col;
		}
	}
	
	public void updateRook(char pieceType, int col, int row)
	{
		if(pieceType == 'R')
		{
			int index = whichBishop(Pieces.R[0].col, Pieces.R[1].col, col, Pieces.R[0].row, Pieces.R[1].row, row );
			Pieces.R[index].col = col;
			Pieces.R[index].col = col;
		}
		else
		{
			int index = whichBishop(Pieces.r[0].col, Pieces.r[1].col, col, Pieces.r[0].row, Pieces.r[1].row, row );
			Pieces.r[index].col = col;
			Pieces.r[index].col = col;
		}
	}

	int whichRook(int x1, int x2, int x3, int y1, int y2, int y3)
	{
		if((Math.abs(x3-x1) == 0) || ( Math.abs(y3-y1) == 0)) return 1;
		return 2;
	}
	
	int whichBishop(int x1, int x2, int x3, int y1, int y2, int y3)
	{
		if(Math.abs(x3-x1) == Math.abs(y3-y1)) return 1;
		return 2;
	}
	
	public int whichNight(int x1, int x2, int x3, int y1, int y2, int y3)
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
		for(int i = 0; i < 2; i++)
		{
			System.out.println(pm.pieces.N[i].name +" "+ pm.pieces.N[i].col +" "+ pm.pieces.N[i].row);
		}
		pm.updatePiecePos('N',3,3);
		System.out.println("After move");
		for(int i = 0; i < 2; i++)
		{
			System.out.println(pm.pieces.N[i].name +" "+ pm.pieces.N[i].col +" "+ pm.pieces.N[i].row);
		}
	}

}
