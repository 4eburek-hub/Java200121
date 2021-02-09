package dz3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> words = new HashMap<>();
        String[] str = {"Яблоко", "Вишня", "Груша", "Вишня", "Яблоко", "Слива", "Виноград",
                "Черешня", "Абрикос", "Виноград"};

        for (int i = 0; i < str.length; i++) {
            if (words.containsKey(str[i]))
                words.put(str[i], words.get(str[i]) + 1);
            else
                words.put(str[i], 1);
        }
        System.out.println(words);
    }

}

//        ArrayList<String> fakeArray = new ArrayList<>();
//        fakeArray.add("Яблоко");
//        fakeArray.add("Вишня");
//        fakeArray.add("Груша");
//        fakeArray.add("Яблоко");
//        fakeArray.add("Слива");
//        fakeArray.add("Виноград");
//        fakeArray.add("Черешня");
//        fakeArray.add("Абрикос");
//        fakeArray.add("Виноград");
//        fakeArray.add("Абрикос");
//        fakeArray.add("Слива");
//        fakeArray.add("Груша");
//        fakeArray.add("Абрикос");
//
//        for (int i = 0; i < fakeArray.size(); i++) {
//            String tempChar = fakeArray.get(i);
//
//            if (!words.containsKey(tempChar)) {
//                words.put(tempChar, 1);
//            } else {
//                words.put(tempChar, words.get(tempChar) + 1);
//            }
//        }
//
//        for (Map.Entry<String, Integer> entry : words.entrySet()) {
//            System.out.println("Слово = " + entry.getKey() + ", Повторений = " + entry.getValue());
//        }
//
//    }


