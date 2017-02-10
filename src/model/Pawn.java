package model;

public class Pawn extends Piece{

	public Pawn(Player p, GameBoard b) {
		super(p, b);
	}

	@Override
	public void move() {
		
	}

	@Override
	public char getName() {
		return 'P';
	}

	@Override
	public boolean canCapture(Piece p) {
		return false;
	}

	/*
	 * Return whether the given coordinates make up a valid move for this particular chess piece
	 * (x1,y1) represent the starting location of the piece.
	 * (x2, y2) represent the ending location of the piece
	 */
	@Override
	public boolean canMove(int x1, int y1, int x2, int y2) {
		
		return false;
	}

}
