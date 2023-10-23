public class Main {
    public static void main(String[] args) {
        TracingArea();
    }

    public static boolean isPowerOfFour(int n) {
        // Did not work
        /*
        // first approach
        return (n > 0) && (n/4 > 0) && (n == 1 || ((n / 4) % 4 == 0));

        // second approach
        if (n == 1){
            return true;
        }

        return (n > 0) && (n / 4 > 0) && ((n / 4) % 4 == 0);
        */

        // third approach
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return true;
    }

    public static void TracingArea(){
        int [] n = {16, 1, 5, 12, 8, -2147483648, 2};

        for (int i=0; i<n.length; i++){
            if (isPowerOfFour(n[i])){
                System.out.println("Test " + i + " True");
            }
            else {
                System.out.println("Test " + i + " False");
            }
        }
    }
}