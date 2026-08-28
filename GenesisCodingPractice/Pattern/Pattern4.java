package GenesisCodingPractice.Pattern;

public class Pattern4 {
    public static void main(String args[]){
        int n = 5;

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
