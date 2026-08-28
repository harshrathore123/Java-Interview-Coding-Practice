package GenesisCodingPractice.Pattern;

public class Pattern12 {
    public static void main(String args[]){
        int n = 4;

        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            //leftdesign
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }

            //rightdesign
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
            
            System.out.println();
        }
    }
}
