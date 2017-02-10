package model;

public class GameBoard {
	
	private Piece [][] board;
	public GameBoard(){
		
	}
	
	// Get the location of a piece on the board. Return null if not found.
	public int[] getLocation(Piece p){
		int [] array = new int[2];
		// Iterate through the game board and find the piece.
		for (int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if (board[i][j] == p){
					array[0] = i;
					array[1] = j;
					return array;
				}
			}
		}
		return null;
	}
	
	// Get a piece at a specific location, returns null if nothing is that that location.
	public Piece getPiece(int row, int col){
		if (board[row][col] != null){
			return board[row][col];
		}
		return null;
	}
	
	// Return whether a location on the board is currently occupiece by a piece.
	public boolean isOccupied(int x, int y) {
		if (board[x][y] == null){
			return false;
		}
		return true;
	}
	
	// Put a piece on a location on the board
	public void setLocation(Piece p, int row, int col){
		board[getLocation(p)[0]][getLocation(p)[1]] = null;
		board[row][col] = p;
	}
	
	// Remove a piece from a location on the game board, and return that piece.
	public Piece remove(int x, int y) {
		Piece p = board[x][y];
		board[x][y] = null;
		return p;
	}
}
