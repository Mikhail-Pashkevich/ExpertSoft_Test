package main;

import java.util.ArrayList;

public class Sort {
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int arraySize = a.size();
        ArrayList<Integer> arrayList = new ArrayList<>(2 * arraySize);
        try {
            for (int i = 0, j = 0; ; ) {
                if (i == arraySize) {
                    while (j < arraySize) {
                        arrayList.add(b.get(j));
                        j++;
                    }
                    return;
                }
                if (j == arraySize) {
                    while (i < arraySize) {
                        arrayList.add(a.get(i));
                        i++;
                    }
                    return;
                }
                if (a.get(i) < b.get(j)) {
                    arrayList.add(a.get(i));
                    i++;
                } else {
                    arrayList.add(b.get(j));
                    j++;
                }
            }
        } finally {
            a = arrayList;
            System.out.println(a);
            System.out.println(b);
        }
    }
}