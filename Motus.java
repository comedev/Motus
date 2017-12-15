import java.io.IOException;
import java.util.Scanner;

import static java.lang.StrictMath.max;

public class Motus {
    String randomWord;
    public static String word;

    public Motus() throws IOException {
        this.randomWord = Dictionnaire.choose();
        this.word=null;
    }


    public static String motEntre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisissez un mot : ");
        String word = sc.nextLine();

        return word;
    }

    public static String[] evaluer(String word, String randomWord ){
        int size1=word.length();
        int size2=randomWord.length();

        String[] tab1 = word.split("");
        String[] tab2 = randomWord.split("");

        while(tab1!=tab2){
            for(int i=0; i<max(size1,size2);i++){        //Comparer les deux tableaux
                if(!tab1[i].equals(tab2[i])){
                    tab1[i]="-";
                }
            }

            motEntre();
            evaluer(word,randomWord);
        }

        return tab1;

    }
}
