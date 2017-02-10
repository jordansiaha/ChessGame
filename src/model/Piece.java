package model;


public abstract class Piece {
	
	private Player player;
	
	public Piece(Player p){
		this.player = p;
	}
	
	public abstract void move();
	
	public abstract char getName();
	
	public abstract boolean canCapture(Piece p);
	
	public void setPlayer(Player p){
		player = p;
	}
	public Player getPlayer(){
		return this.player;
	}
	
}
