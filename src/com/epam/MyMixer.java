package com.epam;

import java.util.Random;

/**
 * Created by Hrinchenko on 18.03.2016.
 */
public class MyMixer <T> {

    private T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] shuffle(){
        Random random = new Random();
        for(int i = 0; i<array.length; i++){
            int arryLength = array.length;
            int randomIndex = random.nextInt(arryLength);
            T element = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = element;

        } return  array;
    }
}
