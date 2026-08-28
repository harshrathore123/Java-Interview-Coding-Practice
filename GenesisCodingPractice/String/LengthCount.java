package GenesisCodingPractice.String;

class LengthCount{
    public static void main(String args[]){
        String name = "hello";
        System.out.println(name);

        //length count without using length method
        int count = 0;

        for(char ch: name.toCharArray()){
            count++;
        }

        System.out.println(count);
    }
}