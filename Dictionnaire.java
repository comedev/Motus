import java.util.List;
import java.io.*;
import java.util.Random;


public class Dictionnaire {
    List<String> words;
    String randomWord;


    public Dictionnaire(List<String> wordDict){
        this.words = wordDict;
        this.randomWord = null;

    }

    public static boolean find(String word) throws IOException{
        String line = null;
        String fileName = "dict.txt";

        FileReader file = new FileReader(fileName);
        BufferedReader input = new BufferedReader(new FileReader("dict.txt"));

        try{
            while((line=input.readLine())!=null){

                String wordDict=line.substring(0);

                if(word.equals(wordDict)){
                    System.out.println(line);
                    return true;
                }
            }

            file.close();
        }
        catch(IOException x){
            System.err.format("IOException: %s%n", x);
        }

        return false;
    }


    public static String choose() throws IOException{
        String line = null;
        int i=0;

        Random number = new Random();
        int rnd = number.nextInt(14061);

        BufferedReader file = new BufferedReader(new FileReader("dict.txt"));

        try{
            while((line=file.readLine()) != null){
                if(i==rnd){
                    String randomWord = line.replaceAll("\\d", "");
                    System.out.println("Random word : "+randomWord);
                    return randomWord;
                }
                else
                    i++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


        return null;
    }
}
