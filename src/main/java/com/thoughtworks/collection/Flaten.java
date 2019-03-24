package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (Integer[] arr : array) {
            for (Integer num : arr) {
                result.add(num);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (Integer[] arr : array) {
            for (Integer num : arr) {
                if (!result.contains(num)) {
                    result.add(num);
                }
            }
        }
        return result;
    }
}
