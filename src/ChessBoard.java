
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
    	char[][] boardFinalState = new char[8][8];
    	
    	return boardFinalState;
    }
    
    public static String getEquivalentBoardPosition(String position)
    {
    	
    	if(position.charAt(0) == 'A')
    		return "1"+","+position.charAt(1);
    	if(position.charAt(0) == 'B')
    		return "2"+","+position.charAt(1);
    	if(position.charAt(0) == 'C')
    		return "3"+","+position.charAt(1);
    	if(position.charAt(0) == 'D')
    		return "4"+","+position.charAt(1);
    	if(position.charAt(0) == 'E')
    		return "5"+","+position.charAt(1);
    	if(position.charAt(0) == 'F')
    		return "6"+","+position.charAt(1);
    	if(position.charAt(0) == 'G')
    		return "7"+","+position.charAt(1);
    	if(position.charAt(0) == 'H')
    		return "8"+","+position.charAt(1);
    }
}

