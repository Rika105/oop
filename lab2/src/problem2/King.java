package problem2;

public class King extends Piece {

    public King(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int dr = Math.abs(position.row - b.row);
        int dc = Math.abs(position.col - b.col);

        return dr <= 1 && dc <= 1;
    }
}
