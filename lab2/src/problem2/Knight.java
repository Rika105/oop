package problem2;

public class Knight extends Piece {
	public Knight(Position p) {
		super(p);
	}
	
@Override
public boolean isLegalMove(Position b) {
	int dr = Math.abs(position.row - b.row);
    int dc = Math.abs(position.col - b.col);

    return (dr == 2 && dc == 1) ||
           (dr == 1 && dc == 2);
}

}
