import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
    private  ArrayList<String> movies;

    Movies() {
        movies = new ArrayList<>();
        File file = new File("/home/dennis/Desktop/com.expample.java8/GuessMOVIE/src/movies.txt");
        try {
            Scanner scanner = new Scanner(file);
            String movie;
            while (scanner.hasNextLine()){
                movie = scanner.nextLine();
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }


    public String getMovie(int index) {
        return movies.get(index);
    }


    public void getAllMovies(){
        movies.forEach((q) -> System.out.println(q));
    }

}
