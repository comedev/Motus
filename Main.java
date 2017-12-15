import java.io.*;

public class Main {
    String randomWord;
    String word;


    public Main() throws IOException {
        this.randomWord = Dictionnaire.choose();
        this.word = Motus.motEntre();
    }



    public static void main(String[] args) throws IOException{

        File inputFile = new File("dict.txt");
        FileReader input = new FileReader(inputFile);

        Dictionnaire.find(word);            // J'ai un problème que je n'arrive pas à résoudre :"Non-static field 'word' & 'randomWord'
        Dictionnaire.choose();              // cannot be referenced in a static context
        Motus.motEntre();
        Motus.evaluer(word, randomWord);

        input.close();
    }
}
