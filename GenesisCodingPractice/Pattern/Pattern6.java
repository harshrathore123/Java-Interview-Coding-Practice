package GenesisCodingPractice.Pattern;

public class Pattern6 {
    public static void main(String args[]){
        int n = 5;

        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }

            //left star
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }

            //rigtstar
            for(int l=1;l<i;l++){
                System.out.print("*");
            }   

            System.out.println();
        }
    }
}
