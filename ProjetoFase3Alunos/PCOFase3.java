import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PCOFase3 {

	/**
	 * Creates 4 different games, using different eliminators and 
	 * accomodators, and lets the user play those games.
	 * @param args Not used
	 */
	public static void main(String[] args) {
		
		// Initially, the game symbols are colored balls
		Symbol[] symbols = Balls.values();

		int nrLins = 7;
		int nrCols = 5;

		Scanner myReader = new Scanner(System.in);

		/*
		 * Creates a ClassicalTransformer, which is both an Eliminator and 
		 * an Accomodator. It also creates a FatalFallAccomodator.
		 * Then it creates a MultipleRewardGame with the previous
		 * ClassicalTransformer as an Eliminator, and plays the game, 
		 * starting with 2 lines already filled
		 */
		ClassicalTransformer transf = 
				new ClassicalTransformer(AbstractGame.SIZE_OF_PIECE, symbols[symbols.length - 1]);
		Accomodator fatalAccom = new FatalFallAccomodator(3);
		Game myGame = 
				new MultipleRewardGame(nrLins, nrCols, 2, symbols[symbols.length - 1], 
						symbols, new Random(1), transf, fatalAccom);

		System.out.println("Let's play!");
		playGame(nrCols, myReader, myGame);		

		/*
		 * Creates a list with 3 patterns and a PatternEliminator.
		 * Then it creates a MultipleRewardGame using that Eliminator and the
		 * previous ClassicalTransformer as an Accomodator, and lets the user 
		 * play the game, starting with 1 line already filled
		 */
		System.out.println("=======================");
		System.out.println("Let's play again!");

		// The game symbols are now colored hearts
		symbols = Hearts.values();
		
		List<Symbol[]> patterns = createPatterns(symbols,3);
		System.out.println("Patterns: ");
		for(Symbol[] pattern : patterns) {
			System.out.println(Arrays.toString(pattern) + "  ");
		}

		Eliminator elim = new PatternEliminator(patterns);

		myGame = new MultipleRewardGame(nrLins, nrCols, 1, symbols[symbols.length - 1], 
						 symbols, new Random(2), elim, transf);

		playGame(nrCols, myReader, myGame);	

		/*
		 * Then it creates a SingleScoreGame using a ClassicalTransformer
		 * both as Eliminator and Accomodator, and lets the user play the game, 
		 * starting with 4 lines already filled
		 */
		System.out.println("=======================");
		System.out.println("Let's play again!");

		// The game symbols are now traffic signals
		symbols = Signs.values();
		nrLins = 8;
		nrCols = 8;
		transf = new ClassicalTransformer(AbstractGame.SIZE_OF_PIECE, symbols[symbols.length - 1]);

		myGame = new SingleScoreGame(nrLins, nrCols, 4, symbols[symbols.length - 1],
						            symbols, new Random(0), transf, transf);

		playGame(nrCols, myReader, myGame);	

		/*
		 * Finally, it creates a SingleScoreGame starting with no lines
		 * initially filled. The game is considered finished right from the start.
		 */
		System.out.println("=======================");
		System.out.println("Let's play again!");
		myGame = new SingleScoreGame(5, 4, 0, symbols[symbols.length - 1], 
				                     symbols, new Random(0), transf, transf);

		playGame(nrCols, myReader, myGame);	
		
		myReader.close();

	}

	/**
	 * Creates and returns a list of random patterns.
	 * @param symbols The symbols to be used on patterns
	 * @param n The number of patterns to create
	 * @requires symbols != null
	 * @return A list containing n patterns
	 */
	private static List<Symbol[]> createPatterns(Symbol[] symbols, int n) {
		Random generator = new Random(1);
		List<Symbol[]> patterns = new ArrayList<Symbol[]>();
		for(int i = 1 ; i <= n ; i++) {
			Symbol[] pattern = (new Piece(generator, 2, 
					symbols[symbols.length - 1], symbols)).symbols();
			patterns.add(pattern);
		}
		return patterns;
	}

	/**
	 * Lets the user play a given game
	 * @param nrCols The number of columns on the game's grid
	 * @param reader The scanner to be used to interact with the user
	 * @param game The game to be played
	 * @requires nrCols > 0 && reader != null && game != null
	 */
	private static void playGame(int nrCols, Scanner reader, Game game) {

		boolean wantToPlay = true;
		boolean finished = game.finished();
		game.generatePiece();
		
		while(wantToPlay && !finished) {
			System.out.println(game.toString());
			System.out.println("How many permutations in piece?");
			int permut = reader.nextInt();
			game.permutatePiece(permut);
			System.out.println(game.currentPiece());
			int column;
			do {
				System.out.println("What is the target column? (1 to " + 
			                                         nrCols + ", -1 to exit)");
				column = reader.nextInt();
			} while((column < 1 && column != -1) || column > nrCols);
			
			if(column == -1) {
				wantToPlay = false;
			} else if(game.spaceInColumn(column) < AbstractGame.SIZE_OF_PIECE || 
				      game.finished()){ 
					finished = true;
			} else {
				    game.placePiece(column);
					game.generatePiece();
			}
		}
		System.out.println(game.toString());

	    if(finished) {
		    System.out.println("Impossible to continue playing");
	    } else {
		    System.out.println("See you soon!");
	    }
	}
}
