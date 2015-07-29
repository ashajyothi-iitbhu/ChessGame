public class Square {
    int x;
    int y;
    Piece piece;

    public Square(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    
    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    
}
