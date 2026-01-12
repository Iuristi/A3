package org.example;

public class A3 {public static double calculateAverageOfEvens(int[] values) {
    int sum = 0;
    int count = 0;

    for (int v : values) {
        if (v % 2 == 0) {
            sum += v;
            count++;
        }
    }

    if (count == 0) {
        return 0;
    }

    return (double) sum / count;
}


    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        System.out.println(calculateAverageOfEvens(data));
    }

}

//მასივიდან არჩევს მხოლოდ ლუწ რიცხვებს
//
//აჯამებს მათ
//
//ითვლის რამდენი იყო
//
//ბოლოს აბრუნებს ლუწების საშუალოს