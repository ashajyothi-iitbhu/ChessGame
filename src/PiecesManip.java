
public class PiecesManip 
{	
	Pieces pieces;
	PiecesManip()
	{
		
	}
	PiecesManip(Pieces piecesObj)
	{
		pieces = piecesObj;
	}
	
	public void movePiece(String positionToMove)
	{
		String[] pcr = new String[3];
		pcr = positionToMove.split(",");
		char a =pcr[0].charAt(0);
		int a1 = Integer.parseInt(pcr[1]);
		int b = Integer.parseInt(pcr[2]);
		updatePiecePos(a, a1-1, b-1);
	}
	
	public void updatePiecePos(char pieceType, int col, int row)
	{
		int i = findPieceType(pieceType);
		System.out.println(i);
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
		System.out.println(pieceType+" "+col+" "+row);
		if(pieceType == 'P')
		{
			for( int i = 0; i < 8; i++)
			{
				if(pieces.P[i].col == col)
				{
					pieces.P[i].row = row;
					pieces.P[i].col = col;
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
					pieces.p[i].col = col;
				}
			}
		}
	}
	
	public void updateKing(char pieceType, int col, int row)
	{
		if(pieceType == 'K')
		{
			pieces.K.col = col;
			pieces.K.row = row;
		}
		else
		{
			pieces.k.col = col;
			pieces.k.row = row;
		}
	}
	
	public void updateQueen(char pieceType, int col, int row)
	{
		if(pieceType == 'Q')
		{
			pieces.Q.col = col;
			pieces.Q.row = row;
		}
		else
		{
			pieces.q.col = col;
			pieces.q.row = row;
		}
	}
	
	public void updateNight(char pieceType, int col, int row)
	{
		if(pieceType == 'N')
		{
			int index = whichNight(pieces.N[0].col, pieces.N[1].col, col, pieces.N[0].row, pieces.N[1].row, row );
			pieces.N[index-1].col = col;
			pieces.N[index-1].row = row;
		}
		else
		{
			int index = whichNight(pieces.n[0].col, pieces.n[1].col, col, pieces.n[0].row, pieces.n[1].row, row );
			pieces.n[index-1].col = col;
			pieces.n[index-1].row = row;
		}
	}
	
	public void updateBishop(char pieceType, int col, int row)
	{
		if(pieceType == 'B')
		{
			int index = whichBishop(pieces.B[0].col, pieces.B[1].col, col, pieces.B[0].row, pieces.B[1].row, row );
			pieces.B[index-1].col = col;
			pieces.B[index-1].row = row;
		}
		else
		{
			int index = whichBishop(pieces.b[0].col, pieces.b[1].col, col, pieces.b[0].row, pieces.b[1].row, row );
			pieces.b[index-1].col = col;
			pieces.b[index-1].row = row;
		}
	}
	
	public void updateRook(char pieceType, int col, int row)
	{
		if(pieceType == 'R')
		{
			int index = whichBishop(pieces.R[0].col, pieces.R[1].col, col, pieces.R[0].row, pieces.R[1].row, row );
			pieces.R[index-1].col = col;
			pieces.R[index-1].row = row;
		}
		else
		{
			int index = whichBishop(pieces.r[0].col, pieces.r[1].col, col, pieces.r[0].row, pieces.r[1].row, row );
			pieces.r[index-1].col = col;
			pieces.r[index-1].row = row;
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
	
}
