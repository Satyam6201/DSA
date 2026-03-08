package arrayList;

import java.util.ArrayList;

public class PracticeQS {
    // 1.QS

    public static boolean monotonic(ArrayList < Integer> num){
        for(int i = 0; i< num.size(); i++){
            for(int j = i+1; j< num.size(); j++){
                if(num.get(i) > num.get(j)){
                    return false;
                }
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(4);
        num.add(3);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(1);
        num2.add(2);
        num2.add(3);

        System.out.println(monotonic(num)); // false
        System.out.println(monotonic(num2)); // true
    }
}
