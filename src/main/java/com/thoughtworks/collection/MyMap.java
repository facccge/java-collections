package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            result.add(num * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (int num : array) {
            char letter = (char) (num + 96);
            result.add(letter + "");
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for (int num : array) {
            int nowNum = num - 1;
            String letters = "";
            while (nowNum / 26 > 0) {
                char letter = (char) (nowNum / 26 + 96);
                letters += letter;
                nowNum -= nowNum / 26 * 26;
            }
            char letter = (char) (nowNum % 26 + 97);
            letters += letter;
            result.add(letters);
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            result.add(num);
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                int current = result.get(i);
                int next = result.get(j);
                if (current < next) {
                    result.set(j, current);
                    result.set(i, next);
                }
            }
        }
        return result;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = new ArrayList<>();
        for (int num : array) {
            result.add(num);
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                int current = result.get(i);
                int next = result.get(j);
                if (current > next) {
                    result.set(j, current);
                    result.set(i, next);
                }
            }
        }
        return result;
    }
}
