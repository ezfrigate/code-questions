package myInterface.main;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Mainclass {

    public static void main(String[] args){
        ImmutableClass immutableClass = new ImmutableClass("h");
        System.out.println(immutableClass.hashCode());
        System.out.println(Arrays.binarySearch(new int[]{1,2,3,4,5}, 4));
        List<String> list = Arrays.asList(new String[]{"A","B","C","D"});
        Consumer<String> removeElement = s -> {
            System.out.println(s + " " + list.size());
            if (s!=null && s.equals("A")) {
                list.remove("D");
            }
        };
        list.stream().forEach(removeElement);
    }

}
