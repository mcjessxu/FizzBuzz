public class Reduce {

    public static void main(String[] args) {
        int n = 100;

        //method calling
        int steps = ReduceSteps(n);
        System.out.println(steps);
    }

    //user defined method
    public static int ReduceSteps (int num){
        int count = 0;

        while (num != 0) {
            if(num %2 == 0){
                // num is even
                num = num / 2;
                count += 1;
            } else {
                // num is odd
                num = num - 1;
                count += 1;
            }
        }

        return count; // return number of steps
    }

}
