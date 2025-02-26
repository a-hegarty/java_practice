public class math_Utils {
     //method returns int sum of a, b
     public static int add(int a, int b){
        return a + b;
    }

    //method returns ratio of likes to dislikes, expressed as a double
    public static double ratio(int likes, int dislikes){
        //if there are no likes and no dislikes
        if(likes + dislikes == 0) {
            return 0;
        }
        return (double) likes / (likes + dislikes) * 100;
    }
}
