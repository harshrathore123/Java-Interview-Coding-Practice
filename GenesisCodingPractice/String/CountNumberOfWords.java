package GenesisCodingPractice.String;

class CountNumberOfWords{
    public static void main(String args[]){
        String str = "Java is easy";

        int count = 1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') count++;
        }

        System.out.println(count);
    }
}