import java.util.List;

public interface Game {


    static final int SIZE_OF_PIECE = 3;

    int linesInGrid();

    void permutatePiece(int n);

    void placePiece(int col);

    void generatePiece() ;

    int spaceInColumn(int col);

    boolean finished();

    String currentPiece();

    void registerPlayScore(List<Integer> eliminated);

    int score();

}
