package ElementsOfProgramming;

import java.util.Scanner;

//Writing a program to count the number of bits that are set to 1
public class OneBits {
    static int setBitsOne(int n){
        int cnt = 0;
        while(n != 0){
            cnt += (n & 1);
            n >>= 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(setBitsOne(n));
    }
}
