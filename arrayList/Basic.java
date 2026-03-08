package arrayList;

import java.util.ArrayList;

public class Basic {

    public static void main(String[] args) {
        ArrayList <Integer> List = new ArrayList<>(); 
        ArrayList <String> List2 = new ArrayList<>();

        // Add Operation:-(O(1) Time complexity)

        List.add(3); 
        List.add(4);
        List.add(5);
        List.add(6);
        List2.add("car");
        List2.add(1,"bike"); //Bike is place in the 1 index
        List2.add(0,"cycle"); // Cycle is place in the 0 index 

        System.out.println(List);
        System.out.println(List2); //Cycle, Bike, car

        //Get Operation:- O(1) Time complexity
        
        int element = List.get(2);
        System.out.println(element);  //3,4,5,6 (output = 5)

        // Delete Operation:- O(n) Time complexity

        List.remove(3);
        System.out.println(List); // 3,4,5

        // Set Operation:- O(n) Time complexity

        List.set(2, 7);
        System.out.println(List); // 3,4,7

        // Contain element Operation :- O(n) Time complexity 

        System.out.println(List.contains(4)); // True
        System.out.println(List.contains(11)); // False

        // Size Method:-

        System.out.println(List.size());
        
        //Print all the Element :-
        for(int i = 0; i< List.size(); i++){
            System.out.print(List.get(i) + " ");
        }
        System.out.println();

        // MultiDimension ArrayList:-

        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        mainList.add(list);
        System.out.println(list);  //[1,2]
        System.out.println(mainList); // [[1,2]]

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        System.out.println(list2); //[3,4]
        System.out.println("mainList = " + mainList); //[[1,2], [3,4]]

        for(int i = 0; i< mainList.size(); i++){
            ArrayList <Integer> current = mainList.get(i);
            for(int j = 0; j< current.size(); j++){
                System.out.print(current.get(j)+ " ");
            }
            System.out.println();
        }

    }
}
