package com.telran.prof.homework_12_March_27_24;

import java.util.*;

public class Array {
    public static void main(String[] args) {
int[][] matrix = new int[3][];
matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
matrix[1] = new int[]{1, 2, 3};
matrix[2] = new int[]{1};
for (int[] ints : matrix) {
    for (int anInt : ints) System.out.println(anInt + " ");
}

int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepEquals(array1, array2));
        String text = "";
        System.out.println("text" + text);

//        Queue, List, Set, extends from interface of java.util.Collection
//        Queue, List, Set, Map enters into Java Collection Framework
        String[] array = {"one", "two", "three"};
        List<String> list = Arrays.asList(array);
        List<String> list1 = List.of(array);
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, array);

        List<Long> lis = new ArrayList<>();
        lis.add(2L);
        lis.add(3L);
        lis.add(1,1L);
        System.out.println(lis.get(2));

        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three", "three", "two", "one"));
        System.out.println(set);

//        System.out.println(new SortedSet<Integer>(3));

//        Set<Boolean> set1 = new TreeSet<>();
//        Set<Boolean> set2 = new HashSet<>();
//        set1.add(null); //1
//        set2.add(null); //2

        Queue<String> queue = new PriorityQueue<>(List.of("B", "A", "C", "B", "A", "C"));
        while (queue.peek() != null) {
                System.out.print(queue.poll());
        }
                Queue<String> queue1 = new PriorityQueue<>(List.of("B", "A", "C", "B", "A", "C"));
                System.out.println(queue1);
            Map<String, Integer> itemToPrice = new HashMap<>();
            itemToPrice.put("apple", 2);
            itemToPrice.get("apple");
            System.out.println(itemToPrice);

            Set<Integer> sets = Set.of();
            Iterator iterator = sets.iterator();
            while (iterator.hasNext()) {
                int n = (int) iterator.next();
                if(n<10)
                    sets.remove(n);
            }

        String one1 = "One";
        String one2 = "One";
        String one3 = new String("One");
        String one4 = new String("One");
        System.out.println(one1.equals(one2));
        System.out.println(one1 == one2);
        System.out.println(one2.equals(one3));
        System.out.println(one2 == one3);
        System.out.println(one3.equals(one4));
        System.out.println(one3 == one4);

        System.out.println( "A" .compareTo( "B"));

        List<Long> listL = new ArrayList<>();
        listL.add(2L);
        listL.add(3L);
        listL.add(null);
        listL.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(listL);
    }
}
