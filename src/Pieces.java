class Pawn
{
	String name;
	int col;
	int row;
	Pawn(String name, int col, int row)
	{
		this.name = name;
		this.col = col;
		this.row = row;
	}
}

class King
{
	String name;
	int col;
	int row;
	King(String name, int col, int row)
	{
		this.name = name;
		this.col = col;
		this.row = row;
	}
	King()
	{
		
	}
}

class Queen
{
	String name;
	int col;
	int row;
	Queen(String name, int col, int row)
	{
		this.name = name;
		this.col = col;
		this.row = row;
	}
	Queen()
	{
		
	}
}

class Bishop
{
	String name;
	int col;
	int row;
	Bishop(String name, int col, int row)
	{
		this.name = name;
		this.col = col;
		this.row = row;
	}
}

class Night
{
	String name;
	int col;
	int row;
	Night(String name, int col, int row)
	{
		this.name = name;
		this.col = col;
		this.row = row;
	}
}

class Rook
{
	String name;
	int col;
	int row;
	Rook(String name, int col, int row)
	{
		this.name = name;
		this.col = col;
		this.row = row;
	}
}

public class Pieces
{
	static Pawn P[] = new Pawn[8];
	static Pawn p[] = new Pawn[8];
	
	static King K = new King();
	static King k = new King();
	
	static Queen Q = new Queen();
	static Queen q = new Queen();
	
	static Bishop B[] = new Bishop[2];
	static Bishop b[] = new Bishop[2];
	
	static Night N[] = new Night[2];
	static Night n[] = new Night[2];
	
	static Rook R[] = new Rook[2];
	static Rook r[] = new Rook[2];
	
	Pieces()
	{	
		P[0] = new Pawn("P1",1,2);
		P[1] = new Pawn("P2",2,2);
		P[2] = new Pawn("P3",3,2);
		P[3] = new Pawn("P4",4,2);
		P[4] = new Pawn("P5",5,2);
		P[5] = new Pawn("P6",6,2);
		P[6] = new Pawn("P7",7,2);
		P[7] = new Pawn("P8",8,2);
		
		p[0] = new Pawn("p1",1,2);
		p[1] = new Pawn("p2",2,2);
		p[2] = new Pawn("p3",3,2);
		p[3] = new Pawn("p4",4,2);
		p[4] = new Pawn("p5",5,2);
		p[5] = new Pawn("p6",6,2);
		p[6] = new Pawn("p7",7,2);
		p[7] = new Pawn("p8",8,2);
	
		R[0] = new Rook("R1",1,1);
		N[0] = new Night("N1",2,1);
		B[0] = new Bishop("B1",3,1);
		Q = new Queen("Q",4,1);
		K = new King("K",5,1);
		B[1] = new Bishop("B2",6,1);
		N[1] = new Night("N2",7,1);
		R[1] = new Rook("R2",8,1);
		
		r[0] = new Rook("r1",1,1);
		n[0] = new Night("n1",2,1);
		b[0] = new Bishop("b1",3,1);
		q = new Queen("q",4,1);
		k = new King("k",5,1);
		b[1] = new Bishop("b2",6,1);
		n[1] = new Night("n2",7,1);
		r[1] = new Rook("r2",8,1);
	}
	
	}
