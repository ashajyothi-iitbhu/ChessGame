
import java.util.*;
import java.lang.*;
import java.io.*;

public class ChessBoard {
	private String[][] board = new String[8][8];
	Pieces pieces = new Pieces();
	public ChessBoard()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0; j<8; j++)
				board[j][i] = "e";
		}
	}
    
	public void setSquareState(String piece, int x, int y)
	{
		board[x][y] = piece;
	}
	public String[][] getBoardState()
	{
		return board;
	}
    
    public String[][] calculateFinalState(ArrayList<String> positionInput)
    {
    	PiecesManip piece = new PiecesManip(pieces);
    	String[][] boardFinalState = new String[8][8];
    	for(int i=0;i<8;i++)
		{
			for(int j=0; j<8; j++)
				board[j][i] = "e";
		}
    	for(int i=0; i<positionInput.size(); i++)
    	{
    		String[] positions;
    		positions = positionInput.get(i).split(" ");
    		
    		if(positions[0].length()==2)
    			positions[0] = "P" + positions[0].toUpperCase();
    		if(positions[1].length()==2)
    			positions[1] = "p" + positions[1].toLowerCase();
    		
    		if(positionInput.get(i).indexOf("x")>=0 
    				|| positionInput.get(i).indexOf("X")>=0
    				|| positionInput.get(i).indexOf("+")>=0
    				|| positionInput.get(i).indexOf("#")>=0
    				|| positionInput.get(i).indexOf("-")>=0)
    		{
    			if(positions[0].indexOf("X") >= 0)
    			{
    				String position = "";
    				String move = positions[0].replaceAll("X", "");
    				position += getEquivalentBoardPosition(move);
    				piece.removePiece(position);
    			}
    		}
    		else
    		{
    			String blackPositionToMove = getEquivalentBoardPosition(positions[0]);
    			String whitePositionToMove = getEquivalentBoardPosition(positions[1]);
    			piece.movePiece(blackPositionToMove);
    			piece.movePiece(whitePositionToMove);
    			initialize();
    			updateBoard(0);
    		}
    		
    	}
    	return board;
    }
    
    public void initialize()
    {
    	for(int i=0;i<8;i++)
		{
			for(int j=0; j<8; j++)
				board[j][i] = "e";
		}
    }

    public void updateBoard(int caseFlag)
    {
    	if(caseFlag == 0)
    	{
	    	for(int i = 0; i < 8; i++)
	    	{
	    		board[pieces.P[i].row][pieces.P[i].col] = "P"+i;
	    		board[pieces.p[i].row][pieces.p[i].col] = "p"+i;  		
	    	}
	    	for(int i=0; i<2; i++)
	    	{
	    		board[pieces.N[i].row][pieces.N[i].col] = "N"+i;
	    		board[pieces.n[i].row][pieces.n[i].col] = "n"+i;
	    		board[pieces.B[i].row][pieces.B[i].col] = "B"+i;
	    		board[pieces.b[i].row][pieces.b[i].col] = "b"+i;
	    		board[pieces.R[i].row][pieces.R[i].col] = "R"+i;
	    		board[pieces.r[i].row][pieces.r[i].col] = "r"+i;
	    	}
	    	board[pieces.K.row][pieces.K.col] = "K";
			board[pieces.k.row][pieces.k.col] = "k";
			board[pieces.Q.row][pieces.Q.col] = "Q";
			board[pieces.q.row][pieces.q.col] = "q";
    	}
    	
    	else
    	{
    		
    	}
    }
   
    public static String getEquivalentBoardPosition(String position)
    {
    	String equivalentPosition = "";
    	if(position.charAt(1) == 'A' || position.charAt(1) == 'a')
    		equivalentPosition = position.charAt(0)+","+"1"+","+position.charAt(2);
    	if(position.charAt(1) == 'B' || position.charAt(1) == 'b')
    		equivalentPosition = position.charAt(0)+","+"2"+","+position.charAt(2);
    	if(position.charAt(1) == 'C' || position.charAt(1) == 'c')
    		equivalentPosition = position.charAt(0)+","+"3"+","+position.charAt(2);
    	if(position.charAt(1) == 'D' || position.charAt(1) == 'd')
    		equivalentPosition = position.charAt(0)+","+"4"+","+position.charAt(2);
    	if(position.charAt(1) == 'E' || position.charAt(1) == 'e')
    		equivalentPosition = position.charAt(0)+","+"5"+","+position.charAt(2);
    	if(position.charAt(1) == 'F' || position.charAt(1) == 'f')
    		equivalentPosition = position.charAt(0)+","+"6"+","+position.charAt(2);
    	if(position.charAt(1) == 'G' || position.charAt(1) == 'g')
    		equivalentPosition = position.charAt(0)+","+"7"+","+position.charAt(2);
    	if(position.charAt(1) == 'H' || position.charAt(1) == 'h' )
    		equivalentPosition = position.charAt(0)+","+"8"+","+position.charAt(2);
    	return equivalentPosition;
    }
}

