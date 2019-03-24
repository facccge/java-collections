package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int result = 0;
        if (leftBorder > rightBorder) {
            int temp = rightBorder;
            rightBorder = leftBorder;
            leftBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int result = 0;
        if (leftBorder > rightBorder) {
            int temp = rightBorder;
            rightBorder = leftBorder;
            leftBorder = temp;
        }
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 1) {
                result += i;
            }
        }
        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int result = 0;
        for (int num : arrayList) {
            result += 3 * num + 2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> result = new ArrayList<>();
        for (int num : arrayList) {
            if (num % 2 == 0) {
                result.add(num);
            } else {
                result.add(num * 3 + 2);
            }
        }
        return result;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;
        for (int num : arrayList) {
            if (num % 2 == 1) {
                result += num * 3 + 5;
            }
        }
        return result;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double result = 0;
        List<Integer> list = new LinkedList<>();
        for (int num : arrayList) {
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int a = list.get(i);
                int b = list.get(j);
                if (a > b) {
                    list.set(j, a);
                    list.set(i, b);
                }
            }
        }
        if (size % 2 == 0) {
            result = (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
        } else {
            result = list.get(size / 2);
        }
        return result;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double result = 0;
        int sum = 0;
        int count = 0;
        for (int num : arrayList) {
            if (num % 2 == 0) {
                sum += num;
                count+=1;
            }
        }
        result = sum/count;
        return result;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
