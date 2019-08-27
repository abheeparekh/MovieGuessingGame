import java.util.Scanner;
import java.io.File;

public class MovieSelect {
    public String ReadFile () throws Exception {
        String movieName = "";
        int numberOfMovies = 10;
        // Pick a random number between 1 and 6
        int randomNumber = (int)(Math.random() * numberOfMovies + 1);

        File file1 = new File("movies.txt");
        Scanner scanner = new Scanner(file1);
        int lineNumber = 1;
        int words = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if (lineNumber == randomNumber) {
                movieName = line;
            }
            words += line.split(" ").length;
            //System.out.println("Read Movie Name = "+ line);
            lineNumber++;
        }
        return movieName;
    }
}
