package com.thoughtworks.collection;

import org.apache.commons.collections.list.TreeList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int result = 0;
        for (int num : arrayList) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    public double getMinimum() {
        int result = Integer.MAX_VALUE;
        for (int num : arrayList) {
            if (num < result) {
                result = num;
            }
        }
        return result;
    }

    public double getAverage() {
        if (arrayList.size() == 0) {
            return 0;
        }
        double result = 0.0;
        double sum = 0;
        int count = 0;
        for (int num : arrayList) {
            sum += num;
            count += 1;
        }
        result = sum / count;
        return result;
    }

    public double getOrderedMedian() {
        double result = 0;
        List<Integer> list = new ArrayList<>();
        for (int num : arrayList) {
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int current = list.get(i);
                int next = list.get(j);
                if (current > next) {
                    list.set(i, next);
                    list.set(j, current);
                }
            }
        }
        int size = list.size();
        if (size % 2 == 0) {
            result = (list.get(size / 2) + list.get(size / 2 - 1)) / 2.0;
        } else {
            result = list.get(size / 2);
        }
        return result;
    }

    public int getFirstEven() {
        for (int num : arrayList) {
            if (num % 2 == 0) {
                return num;
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (this.arrayList.size() == arrayList.size()) {
            boolean isEqual = true;
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (this.arrayList.get(i) != arrayList.get(i)) {
                    isEqual = false;
                    break;
                }
            }
            return isEqual;
        } else {
            return false;
        }
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        double result = 0;
        int size = arrayList.size();
        if (size % 2 == 0) {
            int num1 = (int) singleLink.getNode(size / 2 + 1);
            int num2 = (int) singleLink.getNode(size / 2);
            result = (num1 + num2) / 2.0;
        } else {
            int num = (int) singleLink.getNode(size / 2 + 1);
            result = (double) num;
        }
        return result;
    }

    public int getLastOdd() {
        for (int i = arrayList.size()-1; i>=0; i--) {
            if (arrayList.get(i) % 2 == 1) {
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size()-1; i>=0; i--) {
            if (arrayList.get(i) % 2 == 1) {
                return i;
            }
        }
        return 0;
    }
}
