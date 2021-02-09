package main;

import java.util.ArrayList;
import java.util.Arrays;

import static main.Sort.merge;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 15, 15, 25, 25, 26, 32, 32, 54));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(12, 14, 16, 32, 45, 62, 65, 84, 85, 94));

        merge(arrayList1, arrayList2);
    }
}