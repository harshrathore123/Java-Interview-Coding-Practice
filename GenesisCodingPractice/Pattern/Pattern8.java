package GenesisCodingPractice.Pattern;

public class Pattern8 {
    public static void main(String args[]){
        int n = 5;

        System.out.println("*");
        for(int i=0;i<n-1;i++){
            System.out.print("*");

            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int k=i;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<=n;i++){
            System.out.print("*");
        }
    }
}
