package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static int calculateSum(int[] values) {
            int sum = 0;
            for (int v : values) {
                if (v % 2 == 0) {
                    sum += v;
                }
            }
            return sum;
        }
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        System.out.println(calculateSum(data));
    }
}

//Questions:
//✓ What will be printed? - "12"
//✓ Which numbers are included and why? - " მხოლოდ 2 + 4 + 6 = 12 რადგან  კოდი ამოწმებს მასივში რომელია ლუწი და ამატებს sum-ში"