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
    
    public void occupySquare(Piece piece){
        //if piece is already here, mark it dead
        if(this.piece != null)
            this.piece.setAvailable(false);
        //place the piece here
        this.piece = piece;
    }

    public Piece releaseSquare() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }
    
}
