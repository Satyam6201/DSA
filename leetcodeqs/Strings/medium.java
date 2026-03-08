package leetcodeqs.Strings;

public class medium {
    public static String addBinary(String a , String b){
        StringBuilder sb = new StringBuilder();
        int num_1 = a.length()-1;
        int num_2 = b.length()-1;
        int carry = 0;

        while (num_1 >= 0 || num_2 >= 0 || carry > 0){
            int sum = carry;
            
            if (num_1 >= 0) {
                sum += a.charAt(num_1) - '0';
                num_1--;
            }
            if (num_2 >= 0) {
                sum += b.charAt(num_2) - '0';
                num_2--;
            }
            carry = sum / 2;
            sb.append(sum % 2);
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}
