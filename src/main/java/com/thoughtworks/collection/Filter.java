package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num % 3 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> result = new ArrayList<>();
        for (int firstNum : firstList) {
            for (int secondNum : secondList) {
                if (firstNum == secondNum) {
                    result.add(firstNum);
                }
            }
        }
        return result;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}