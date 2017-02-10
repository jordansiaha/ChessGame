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

}
