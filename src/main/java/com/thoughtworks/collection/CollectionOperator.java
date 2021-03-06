package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left > right) {
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        } else {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left > right) {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        } else {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result.add(array[i]);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for (int firstNum : firstArray) {
            for (int secondNum : secondArray) {
                if (firstNum == secondNum) {
                    result.add(firstNum);
                }
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> result = new ArrayList<>();
        for (int num : firstArray) {
            result.add(num);
        }
        for (int secondNum : secondArray) {
            boolean contained = false;
            for (int firstNum : firstArray) {
                if (secondNum == firstNum) {
                    contained = true;
                    break;
                }
            }
            if (!contained) {
                result.add(secondNum);
            }
        }
        return result;
    }
}
