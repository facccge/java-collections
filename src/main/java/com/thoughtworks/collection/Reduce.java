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
        throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {
        throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        throw new NotImplementedException();
    }

    public int getLastOdd() {
        throw new NotImplementedException();
    }

    public int getIndexOfLastOdd() {
        throw new NotImplementedException();
    }
}
