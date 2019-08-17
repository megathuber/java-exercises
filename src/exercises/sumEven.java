package exercises;

import java.util.ArrayList;

public class sumEven {
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(12);
        myList.add(43);
        myList.add(21);
        myList.add(76);
        myList.add(41);
        myList.add(2);
        myList.add(121);
        myList.add(18);
        myList.add(30);

        int sum = 0;

        for (int oneInt : myList) {
            if (oneInt % 2 == 0) {
                sum += oneInt;
            } else continue;
        }


        System.out.println(sum);
    }

}
