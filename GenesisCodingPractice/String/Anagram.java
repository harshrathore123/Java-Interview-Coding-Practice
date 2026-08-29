package GenesisCodingPractice.String;
import java.util.*;

public class Anagram {
    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<ch1.length&&i<ch2.length;i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");

    }
}
