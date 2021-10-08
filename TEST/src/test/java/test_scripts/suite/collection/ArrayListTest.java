package test_scripts.suite.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args){
        List<String> arrList = new ArrayList<String>();
        arrList.add("d");
        arrList.add("a");
        arrList.add("w");
        arrList.add("e");
        arrList.add("d");
        System.out.println(arrList);
        System.out.println(arrList.get(0));
    }

}
