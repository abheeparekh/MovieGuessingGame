import java.util.Scanner;
import java.io.File;

public class MovieSelect {
    public String ReadFile () throws Exception {
        String movieName = "";
        int numberOfMovies = 20;
        // Pick a random number
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
