//1.Пусть дан произвольный список целых чисел, удалить из него четные числа
//        (в языке уже есть что-то готовое для этого)

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Random;
//
//public class HW_java_3 {
//
//    public static List<Integer> getRandomList() {
//        Random random = new Random();
//        int size = 20;
//        List<Integer> list = new ArrayList<>(size);
//        for (int i = 0; i < size; i++) {
//            list.add(random.nextInt(100));
//        }
//        System.out.println(list.toString());
//        return list;
//    }
//
//    public static List<Integer> deletEvenNum(List<Integer> list) {
//
//        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
//            Integer number = iterator.next();
//            if (number % 2 == 0) {
//                iterator.remove();
//            }
//
//        }
//        System.out.println(list.toString());
//        return list;
//    }
//
//    public static void main(String[] args) {
//        deletEvenNum(getRandomList());
//    }
//}

//2.Задан целочисленный список ArrayList. Найти минимальное,
//        максимальное и среднее арифметическое из этого списка.

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//
//public class HW3 {
//
//    public static List<Integer> getRandomList(int size) {
//
//        Random random = new Random();
//        List<Integer> randomList = new ArrayList<>(size);
//        for (int i = 0; i < size; i++) {
//            randomList.add(random.nextInt(100));
//        }
//
//        System.out.println(randomList.toString());
//        return randomList;
//    }
//
//    public static void getRezult(List<Integer> list) {
//        int min = Collections.min(list);
//        int max = Collections.max(list);
//        int count = list.size();
//        int sum = 0;
//
//        for (Integer i : list) {
//            sum += i;
//        }
//
//        double result = sum / count;
//
//        System.out.printf("Минимальное: %d, максимальное: %d, среднее арифметичское: %f", min, max, result);
//
//    }
//
//    public static void main(String[] args) {
//        getRezult(getRandomList(20));
//    }
//
//}

//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class HW3 {

        ArrayList<String> list = new ArrayList<String>();
        new ArrayList<String>[]

        {
                "One", "Two", "Three", "Four", "Five"
        }

        {
                list.add(i, s);
                ArrayList<Integer> list1 = new ArrayList<Integer>();<
                Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);
                result.addAll(list1);

                list.size();
                list.get(5);
                list.remove(list.size()-1);
                for (Integer x : result)
                {
                        System.out.println(x);
                }
}


