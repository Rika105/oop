package problem2;

public  abstract class Piece {
   protected Position position;
   public Piece(Position p) {
	   this.position=p;
   }
   
   public abstract boolean isLegalMove(Position newPos);
}
