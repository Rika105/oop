package problem2;

public class Rook extends Piece {
	public Rook(Position p) {
		super(p);
	}
@Override
public boolean isLegalMove(Position b) {
	return position.row==b.row || position.col==b.col;
}
}
