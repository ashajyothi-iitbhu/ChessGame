
import java.util.*;
import java.lang.*;
import java.io.*;

public class ChessBoard {
    private Square[][] squares = new Square[8][8];

    public ChessBoard() {
        super();
        for(int i=0; i<squares.length; i++){
            for(int j=0; j<squares.length; j++){
                this.squares[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSquare(int x, int y) {
        return squares[x][y];
    }
    
    public char[][] calculateFinalState(ArrayList<String> positionInput)
    {
    	Piece piece = new Piece();
    	char[][] boardFinalState = new char[8][8];
    	for(int i=0; i<positionInput.size(); i++)
    	{
    		String[] positions;
    		positions = positionInput.get(i).split(" ");
    		
    		if(positions[0].length()==2)
    			positions[0] = "P" + positions[0];
    		if(positions[1].length()==2)
    			positions[1] = "p" + positions[1];

    		if(positions[0].indexOf('X')>=0 && positions[1].indexOf('x')>=0)
    		{
    			
    		}
    		if(positions[0].indexOf('-')>=0 && positions[1].indexOf('-')>=0)
    		{
    			
    		}
    		if(positions[0].indexOf('+')>=0 && positions[1].indexOf('+')>=0)
    		{
    			
    		}
    		if(positions[0].indexOf('#')>=0 && positions[1].indexOf('#')>=0)
    		{
    			
    		}
    		else
    		{
    			String blackPositionToMove = getEquivalentBoardPosition(positions[0]);
    			String whitePositionToMove = getEquivalentBoardPosition(positions[1]);
    			movePiece(blackPositionToMove);
    			movePiece(whitePositionToMove);
    		}
    		
    	}
    	return boardFinalState;
    }
    
    public static String getEquivalentBoardPosition(String position)
    {
    	String equivalentPosition = "";
    	if(position.charAt(1) == 'A' || position.charAt(1) == 'a')
    		equivalentPosition = position.charAt(0)+","+"1"+","+position.charAt(1);
    	if(position.charAt(1) == 'B' || position.charAt(1) == 'b')
    		equivalentPosition = position.charAt(0)+","+"2"+","+position.charAt(1);
    	if(position.charAt(1) == 'C' || position.charAt(1) == 'c')
    		equivalentPosition = position.charAt(0)+","+"3"+","+position.charAt(1);
    	if(position.charAt(1) == 'D' || position.charAt(1) == 'd')
    		equivalentPosition = position.charAt(0)+","+"4"+","+position.charAt(1);
    	if(position.charAt(1) == 'E' || position.charAt(1) == 'e')
    		equivalentPosition = position.charAt(0)+","+"5"+","+position.charAt(1);
    	if(position.charAt(1) == 'F' || position.charAt(1) == 'f')
    		equivalentPosition = position.charAt(0)+","+"6"+","+position.charAt(1);
    	if(position.charAt(1) == 'G' || position.charAt(1) == 'g')
    		equivalentPosition = position.charAt(0)+","+"7"+","+position.charAt(1);
    	if(position.charAt(1) == 'H' || position.charAt(1) == 'h' )
    		equivalentPosition = position.charAt(0)+","+"8"+","+position.charAt(1);
    	return equivalentPosition;
    }
}

