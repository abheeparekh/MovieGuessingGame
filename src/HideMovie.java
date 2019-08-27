public class HideMovie {
    public String ConvertToUnderscore (String inputString){
        String outputString = " ";
        outputString = inputString.replaceAll("[A-Za-z1-9]", "_");
        return outputString;
    }
  
}
