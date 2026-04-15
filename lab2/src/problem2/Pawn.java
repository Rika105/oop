package problem2;

public class Pawn extends Piece {

    public Pawn(Position p) {
        super(p);
    }

    @Override
    public boolean isLegalMove(Position b) {

        return position.col == b.col &&
               b.row == position.row + 1;
    }
}
