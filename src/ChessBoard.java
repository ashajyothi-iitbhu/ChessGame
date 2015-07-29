
import java.util.*;
import java.lang.*;
import java.io.*;

public class ChessBoard {
	private String[][] board = new String[8][8];
	
	public ChessBoard()
	{
		board[0][0] = "R";
		board[0][1] = "N";
		board[0][2] = "B";
		board[0][3] = "K";
		board[0][4] = "Q";
		board[0][5] = "B";
		board[0][6] = "N";
		board[0][7] = "R";
		board[7][0] = "r";
		board[7][1] = "n";
		board[7][2] = "b";
		board[7][3] = "k";
		board[7][4] = "q";
		board[7][5] = "b";
		board[7][6] = "n";
		board[7][7] = "r";
		for(int i=2;i<6;i++)
		{
			for(int j=0; j<8; j++)
				board[i][j] = "e";
		}
		
		for(int i=0; i<8; i++)
		{
			board[1][i] = "P";
			board[6][i] = "p";
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
    	Piece piece = new Piece();
    	String[][] boardFinalState = new String[8][8];
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
    			
    		}
    		else
    		{
    			String blackPositionToMove = getEquivalentBoardPosition(positions[0]);
    			String whitePositionToMove = getEquivalentBoardPosition(positions[1]);
//    			System.out.println(blackPositionToMove + " " + whitePositionToMove);
    			piece.movePiece(blackPositionToMove);
    			piece.movePiece(whitePositionToMove);
    			updateBoard();
    		}
    		
    	}
    	return board;
    }

    public void updateBoard()
    {
    	for(int i = 0; i < 8; i++)
    	{
    		System.out.println("Column number "+Pieces.P[i].col);
    		board[Pieces.P[i].col][Pieces.P[i].row] = "P";
    		board[Pieces.p[i].col][Pieces.p[i].row] = "p";  		
    	}
    	for(int i=0; i<2; i++)
    	{
    		board[Pieces.N[i].col][Pieces.N[i].row] = "N";
    		board[Pieces.n[i].col][Pieces.n[i].row] = "n";
    		board[Pieces.B[i].col][Pieces.B[i].row] = "B";
    		board[Pieces.b[i].col][Pieces.b[i].row] = "b";
    		board[Pieces.R[i].col][Pieces.R[i].row] = "R";
    		board[Pieces.r[i].col][Pieces.r[i].row] = "r";
    	}
    	board[Pieces.K.col][Pieces.K.row] = "K";
		board[Pieces.k.col][Pieces.k.row] = "k";
		board[Pieces.Q.col][Pieces.Q.row] = "Q";
		board[Pieces.q.col][Pieces.q.row] = "q";
		
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

