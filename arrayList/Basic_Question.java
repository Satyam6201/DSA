package arrayList;

import java.util.ArrayList;

public class Basic_Question {

    public static void Swap(ArrayList <Integer> swap, int index_1, int index_2){

        int temp = swap.get(index_1);
        swap.set(index_1, swap.get(index_2));
        swap.set(index_2, temp);
    }
    public static void main(String[] args) {

        // 1.QS:-(Reverse the number) (O(n))
        // ArrayList <Integer> item = new ArrayList<>();
        // item.add(1);
        // item.add(2);
        // item.add(3);
        // item.add(4);
        // item.add(5);

        // for(int i = item.size()-1; i>= 0; i--){
        //     System.out.print(item.get(i) + " ");
        // }
        // System.out.println();

        // // 2.Qs:- (Find the max Value)

        // ArrayList <Integer> item2 = new ArrayList<>();
        // item2.add(2);
        // item2.add(5);
        // item2.add(9);
        // item2.add(6);
        // item2.add(8);

        // int max = Integer.MIN_VALUE;  // (-Infinite)

        // for(int i = 0; i< item2.size(); i++){
        //     // if(max < item2.get(i)){
        //     //     max = item2.get(i);
        //     // }
        //     // OR:-
        //     max = Math.max(max, item2.get(i));
        // }
        // System.out.println("Max value is = "+ max);

        // // 3.QS:-

        // ArrayList <Integer> swap = new ArrayList<>();
        // swap.add(2);
        // swap.add(5);
        // swap.add(9);
        // swap.add(3);
        // swap.add(6);

        // int index_1 = 1;
        // int index_2 = 3;
        // System.out.println("before Swap = "+ swap);
        // Swap(swap, index_1, index_2);
        // System.out.println("After swap = "+ swap);

        // 4.QS:-

        // ArrayList <Integer> sort = new ArrayList<>();
        // sort.add(2);
        // sort.add(5);
        // sort.add(9);
        // sort.add(3);
        // sort.add(6);

        // // Ascending order:-

        // System.out.println("Before Sort = "+ sort);
        // Collections.sort(sort);
        // System.out.println("After Sort = " + sort);

        // // Descending order:-

        // Collections.sort(sort, Collections.reverseOrder());
        // System.out.println("Reverse Order = " + sort);

        // 5.Qs:-

        ArrayList<ArrayList <Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> List1 = new ArrayList<>();
        ArrayList <Integer> List2 = new ArrayList<>();
        ArrayList <Integer> List3 = new ArrayList<>();

        // List1.add(1);
        // List1.add(2);
        // List1.add(3);
        // List1.add(4);
        // List1.add(5);
        // List2.add(2);
        // List2.add(4);
        // List2.add(6);
        // List2.add(8);
        // List2.add(10);
        // List3.add(3);
        // List3.add(6);
        // List3.add(9);
        // List3.add(12);
        // List3.add(15);

        // OR:-

        for(int i = 1; i<= 5; i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }

        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);

        for(int i = 0; i< mainList.size(); i++){
            ArrayList <Integer> currentList = mainList.get(i);
            for(int j = 0; j< currentList.size(); j++){
                System.out.print(currentList.get(j)+ " ");   // 1,2,3,4,5 | 2,4,6,8,10 | 3,6,9,12,15
            }
            System.out.println();
        }
        System.out.println(mainList); //[[1,2,3,4,5,], [2,4,6,8,10], [3,6,9,12,15]]
    }
}
