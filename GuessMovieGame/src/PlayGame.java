
import java.util.ArrayList;
import java.util.Scanner;

class PlayGame {

    private Movies movies;
    private String selectedMovie;
    private String play;

    PlayGame() {
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

        char ch = 0;
        try {
            Scanner scanner = new Scanner(System.in);
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
        ArrayList<Character> wrongLetters = new ArrayList<>();

        while (len > 0){
            System.out.print("Guess a letter: ");
            char input = getInput();
            if(input == selectedMovie.charAt(i)){
                game.setCharAt(i, input);
                System.out.println("Current guess: " + game);

            } else {
                wrongLetters.add(input);
                System.out.print("You have guessed (" + wrongLetters.size() + ")" + "wrong letters: ");
                wrongLetters.forEach(System.out::print);
                System.out.println("\n");
                System.out.println("You are guessing: " + game);
            }
            i++;
            len--;
            if(wrongLetters.size()!=10) {
                System.out.println("You have " + len + " guesses remaining");
            }else {
                break;
            }
        }
        return game.toString();
    }

    private void isWon(){
        if(selectedMovie.equalsIgnoreCase(play)){
            System.out.println("You win!");
            System.out.println("You have guessed '" + selectedMovie + "' correctly.");
        } else{
            System.out.println("You lose!!");
        }
    }
}