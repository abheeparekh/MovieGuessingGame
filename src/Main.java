import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String [] args) throws Exception{
        MovieSelect myMovieSelect = new MovieSelect();
        HideMovie hideMyMovie = new HideMovie();
        // Get the movie name from file
        String movieName = myMovieSelect.ReadFile();
       // System.out.println("Read Movie " + movieName);
        // Hide the movie name
        String hiddenMovie = hideMyMovie.ConvertToUnderscore(movieName);
        System.out.println("Hide My Movie " + hiddenMovie);
        // Ask user to type a character

        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int i = 0;
        while(i<10){

            System.out.println("Enter an alphabet");
            String inputChar = scanner.nextLine();
            char guessedChar = inputChar.charAt(0);
            int charExist = movieName.indexOf(guessedChar, 0);

            if (charExist == -1) {
                //character do not exist in the string
                i++;
                System.out.println("Incorrect Guess. Number of guess(es) left: " + (10 - i));

            }else{
                char[] arrayhiddenMovie = hiddenMovie.toCharArray();
                for(int j=0;j<movieName.length();j++){
                    if(movieName.charAt(j) == guessedChar){
                        arrayhiddenMovie[j] = guessedChar;
                    }
                }
                hiddenMovie = String.valueOf(arrayhiddenMovie);
                System.out.println(hiddenMovie);
                System.out.println("Correct Guess. Number of guess(es) left: " + (10 - i));
                if(movieName.equals(hiddenMovie)){
                    result = true;
                    break;
                }
            }

        }

        if(result){
            System.out.println("You Win :) ");
        }else{
            System.out.println("You Lose :(  Try again :)");
        }


    }
}
