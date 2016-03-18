package com.epam;

import java.util.Arrays;

/**
 * Created by Hrinchenko on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {

       Integer[] arrInt = {1,2,3,4,5,6,7,8,9,10};
        String[] arrStr = {"one", "two", "three", "four", "five", "six","seven", "eight", "nine", "ten"};

        MyMixer<Integer> mixInt = new MyMixer<>(arrInt);
        MyMixer<String> mixStr = new MyMixer<>(arrStr);

        System.out.println(Arrays.toString(mixInt.shuffle()));
        System.out.println(Arrays.toString(mixStr.shuffle()));
    }
}
