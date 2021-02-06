package dz3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    public static void main(String[] args) {
        dir();
    }

    public static void dir() {
        Directory directory = new Directory();
        directory.add("Иванов", "8888888888");
        directory.add("Петров","9999999999");
        directory.add("Иванов", "77777777777");
        directory.add("Петров","666666666666");
        directory.add("Степанов", "55555555555");
        directory.add("Сергеев","44444444444");
        directory.add("Степанов", "333333333333");
        directory.add("Сергеев","222222222222");

        System.out.println(directory.get("Иванов"));
        System.out.println(directory.get("Петров"));
        System.out.println(directory.get("Степанов"));
        System.out.println(directory.get("Сергеев"));

    }
}
    class Directory {
        private Map<String, List<String>> directory_hm = new HashMap<>();
        private List<String> phone_number_list;

        public void add(String surname, String phone_number) {
            if (directory_hm.containsKey(surname)){
                phone_number_list = directory_hm.get(surname);
            }else {
                phone_number_list = new ArrayList<>();
            }
            phone_number_list.add(phone_number);
            directory_hm.put(surname,phone_number_list);

        }

        public List<String> get(String surname) {
            return directory_hm.get(surname);
        }
    }

