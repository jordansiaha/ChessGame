package model;


public abstract class Piece {
	
	private Player player;
	private GameBoard board;
	private boolean captured;
	
	public Piece(Player p, GameBoard b){
		this.player = p;
		this.board = b;
		captured = false;
	}
	
	public abstract void move();
	
	public abstract char getName();
	
	public abstract boolean canCapture(Piece p);
	
	
	public void setCaptured(){
		captured = true;
	}
	public boolean isCaptured(){
		return captured;
	}
	
	public Player getPlayer(){
		return this.player;
	}
	public GameBoard getBoard(){
		return this.board;
	}
}
