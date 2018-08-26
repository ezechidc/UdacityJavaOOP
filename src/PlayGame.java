
import java.util.Scanner;

public class PlayGame {

    private Movies movies;
    private String selectedMovie;
    private String play;

    public PlayGame() {
        movies = new Movies();
        selectedMovie = chooseMovie();
        movies.getAllMovies();
        play = playGame();
        isWon();
    }

    private String chooseMovie() {
        int movieIndex = (int) (Math.random() * 25);
        return movies.getMovie(movieIndex);
    }

    private static char getInput() {
        Scanner scanner = null;
        char ch = 0;
        try {
            scanner = new Scanner(System.in);
            ch = scanner.nextLine().charAt(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ch;
    }

    private StringBuilder currentGuess(){
        StringBuilder current = new StringBuilder();
        char[] chars = selectedMovie.toCharArray();
        for (int i=0; i<selectedMovie.length();i++){
            if(chars[i] == ' '){
                current.append(" ");
            } else {
                current.append("-");
            }
        }
        return current;
    }

    private String playGame(){
        StringBuilder game = currentGuess();
        System.out.println("You are guessing: " + game);
        int len = selectedMovie.length();
        int i = 0;
        while (len > 0){
            char input = getInput();
            if(input == selectedMovie.charAt(i)){
                game.setCharAt(i, input);
                i++;

            } else {
                System.out.println("No match try again");
                System.out.println("You are guessing: " + game);
            }
            len--;
            System.out.println("You have " + len + " guesses remaining");
        }
        return game.toString();
    }

    private void isWon(){
        if(selectedMovie.equalsIgnoreCase(play)){
            System.out.println("You win!");
        } else{
            System.out.println("You lose!!");
        }
    }
}