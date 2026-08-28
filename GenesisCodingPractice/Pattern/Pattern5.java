package GenesisCodingPractice.Pattern;

public class Pattern5 {
    public static void main(String args[]){
        int n = 5;

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //star
            for(int k=i;k<n;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
