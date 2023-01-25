package Demo;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<String> as=new ArrayList<>();
        as.add("Srija");
        as.add("Hanish");
        arr.add(34);
        arr.add(89);
        System.out.println(arr);
        if(arr.isEmpty()) {
            System.out.println("Empty array");
        }
        arr.remove(1);
        System.out.println(as);
        System.out.println(arr);
    }
}
