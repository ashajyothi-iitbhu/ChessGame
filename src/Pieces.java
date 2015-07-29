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
		P[0] = new Pawn("P1",0,1);
		P[1] = new Pawn("P2",1,1);
		P[2] = new Pawn("P3",2,1);
		P[3] = new Pawn("P4",3,1);
		P[4] = new Pawn("P5",4,1);
		P[5] = new Pawn("P6",5,1);
		P[6] = new Pawn("P7",6,1);
		P[7] = new Pawn("P8",7,1);
		
		p[0] = new Pawn("p1",0,6);
		p[1] = new Pawn("p2",1,6);
		p[2] = new Pawn("p3",2,6);
		p[3] = new Pawn("p4",3,6);
		p[4] = new Pawn("p5",4,6);
		p[5] = new Pawn("p6",5,6);
		p[6] = new Pawn("p7",6,6);
		p[7] = new Pawn("p8",7,6);
	
		R[0] = new Rook("R1",0,0);
		N[0] = new Night("N1",1,0);
		B[0] = new Bishop("B1",2,0);
		Q = new Queen("Q",3,0);
		K = new King("K",4,0);
		B[1] = new Bishop("B2",5,0);
		N[1] = new Night("N2",6,0);
		R[1] = new Rook("R2",7,0);
		
		r[0] = new Rook("r1",0,7);
		n[0] = new Night("n1",1,7);
		b[0] = new Bishop("b1",2,7);
		q = new Queen("q",3,7);
		k = new King("k",4,7);
		b[1] = new Bishop("b2",5,7);
		n[1] = new Night("n2",6,7);
		r[1] = new Rook("r2",7,7);
	}
	
	}
