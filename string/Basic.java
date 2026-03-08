package string;

public class Basic {
    public static void main(String[] args) {
        // String str = "Satyam kumar mishra";
        // String str2 = new String("satyam kumar msihra");

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("my name is = " + name);
        // System.out.println(str.length());

        // Concatenate:-

        // String FirstName = "Satyam";
        // String MiddleName = "Kumar";
        // String LastName = "Mishra";

        // String FullName = FirstName + " "+ MiddleName + " " +LastName;
        // System.out.println(FullName);
        // System.out.println(FullName.charAt(4));

        // String compair:-

        // String str = "Satyam";
        // String str2 = "Satyam";
        // String str3 = new String("Satyam");

        // if(str == str2){
        //     System.out.println("Str is equal to the Str2");
        // }
        // else{
        //     System.out.println("Not Equal!");
        // }
        // if(str == str3){
        //     System.out.println("Str is equal to the Str3");
        // }
        // else{
        //     System.out.println("not equal!");
        // }

        // To check the value :-
        // euuals is basicly used to check the value it is equal or not:-

        // if(str.equals(str3)){
        //     System.out.println("Str is equal to the Str3");
        // }
        // else{
        //     System.out.println("Not Equal!");
        // }

        // Largest String :-

        // String fruits[] = {"apple" ,"mango" , "banana" , "Papaya" };
        // String largest = fruits[0];
        // for(int i = 1; i< fruits.length; i++){
        //     if(largest.compareToIgnoreCase(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);
        
        // String Builder:-

        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'A'; ch<='Z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.print(sb);

        // Calculate simple intrest

        double principal = 10000;
        double rate = 5;
        double time = 2;
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Principal = ");
        // double principal = sc.nextDouble();

        // System.out.println("Enter rate = ");
        // double rate = sc.nextDouble();

        // System.err.println("Enter Time = ");
        // double time = sc.nextDouble();

        double SI = (principal * rate * time) / 100;
        System.out.println(SI);

    }
}
 