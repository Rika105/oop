package problem2;

public class Queen extends Piece {

    public Queen(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        int dr = Math.abs(position.row - b.row);
        int dc = Math.abs(position.col - b.col);

        return position.row == b.row ||
               position.col == b.col ||
               dr == dc;
    }
}
