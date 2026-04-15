package problem2;

public class Main {

	    public static void main(String[] args) {

	        Piece rook = new Rook(new Position(0,0));
	        Piece bishop = new Bishop(new Position(2,2));
	        Piece knight = new Knight(new Position(4,4));
	        Piece queen= new Queen(new Position(3,4)); 

	        Position newPos1 = new Position(0,5);
	        Position newPos2 = new Position(5,5);
	        Position newPos3 = new Position(6,5);
	        

	        System.out.println("Rook move: " + rook.isLegalMove(newPos1));
	        System.out.println("Bishop move: " + bishop.isLegalMove(newPos2));
	        System.out.println("Knight move: " + knight.isLegalMove(newPos3));
	        System.out.println("Queen move: " + queen.isLegalMove(newPos3));
	    }
	

}
