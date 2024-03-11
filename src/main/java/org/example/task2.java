package org.example;
import java.util.Scanner;
public class task2 {
    public static boolean isSimple(long num) {
        if(num < 2) return false;
        for(int i = 2; i < num / 2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число, не превышающее 10**17:");
        long x = in.nextLong();
        System.out.println("Простые множетели числа " + x + ":");
        for (long i = 2; i <= x; i ++) {
            while (x % i == 0) {
                if (isSimple(i)) {
                    System.out.println(i);
                    x = x / i;
                }
            }
        }
    }
}