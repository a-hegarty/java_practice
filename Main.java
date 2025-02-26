public class Main {
    public static void main(String[] args) {
        String greeting = "hello";
        
        int greet_Length = greeting.length();
        //int number = 10;

        //int total = math_Utils.add(greet_Length, number);

        //int likes = 150;
        //int dislikes = 50;

        //double ratio = math_Utils.ratio(likes, dislikes);

        //System.out.println(ratio);

        //for loop prints char at position i
        for(int i = 0; i < greet_Length; i ++) {
            System.out.println(greeting.charAt(i));
        }
    }
}
