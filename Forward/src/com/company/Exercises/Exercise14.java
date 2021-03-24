package com.company.Exercises;

public class Exercise14 {

    public static void doIT(String String){ // 1
        int i = 10;
        i : for (int k = 0; k<10; k++){  // 2
            System.out.println(String + i); // 3
            if(k * k > 10) continue i; // 4
        }
    }
}
