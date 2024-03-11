package org.example;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число меньшее 10^9: ");
        int a = in.nextInt();
        int pred = 0; //предыдущее число
        int actual = 1; //текущее число
        int cnt = 2; //счетчик
        while (a > actual) {
            int vr = actual;
            actual += pred;
            pred = vr;
            cnt += 1;
        }
        if(a == actual || a == 0){
            if (a == 0){
                int cnt1 = 1;
                System.out.println("Число является частью послд-ти фибоначи,  это " + cnt1 + " элемент последовательсти");

            }
            else{
                System.out.println("Число является частью послд-ти фибоначи,  это " + cnt + " элемент последовательсти");
            }
        }
        else{
            System.out.println("Число не является частью послд-ти");
        }
    }
}