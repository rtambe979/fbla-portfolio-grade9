
import java.util.Arrays;

public class SumDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int length = args.length -  1;
        int[] a = new int [length];

        // Copy all elements from array args, starting from element 1, into array a
        for(int i = 0; i < length; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }        

        // Create a new array s
        int[] s = new int[length];

        // variable "sum" should contain sum of all numbers from a[0] . . . a[i]
        int sum = 0;
        for(int j = 0; j < length; j++) {
            sum = sum + a[j];
            s[j] = sum;
        }

        int min = 0;
        int max = s[s.length - 1] - 1;

        // Print output
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        // System.out.println("a = " + Arrays.toString(a));

        System.out.println("s = " + Arrays.toString(s));
        
        int count = 0;
        // p = interval bucket
        for(int q = 1; q <= m; q++) {
            double r = (Math.random() * (max - min)) + min;

            System.out.println("r = " + r);

            if (r <= s[0]) {
                System.out.print(0 + " ___\n");
                continue;
            }

            for(int p = 0; p < s.length; p++){


                if (p != s.length - 1 ){

                    if (r >= s[p] && r < s[p + 1]) {
                        System.out.print((p + 1) + " ---\n");
                        count++;
                        break;
                    }
                }
                else
                    if (r == s[p])
                    System.out.print(p + " ===\n");

            }

        }
        

    }
}