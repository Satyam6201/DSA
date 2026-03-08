package string;

public class ToUpperCase {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i) == ' ' &&  i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compression(String str){
        String newStr = "";
        for(int i = 0; i< str.length(); i++){
            Integer count = 1;
            while (i< str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1) {
               newStr += count.toString(); 
            }
        }
        return newStr;
    }

    public static String compression2(String str){
        StringBuilder newStr=  new StringBuilder("");
        for(int i = 0 ; i< str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1  && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count >1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        // String str = "i, am Satyam kumar mishra";
        // System.out.println(toUpperCase(str));

        String str = "aaabbcccdd";
        // System.out.println(compression(str));
        System.out.println(compression2(str));
    }
}
