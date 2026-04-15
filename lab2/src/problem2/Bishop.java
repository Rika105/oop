package problem2;

public class Bishop extends Piece{
	public Bishop(Position p) {
		super(p);
	}
	
@Override
public boolean isLegalMove(Position b) {
	return Math.abs(position.row-b.row)== Math.abs(position.col-b.col);
}

}
