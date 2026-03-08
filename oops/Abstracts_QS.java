package oops;

public class Abstracts_QS {

    // Abstract Class:-

//     public static void main(String[] args) {
//         // Dog d1 = new Dog();
//         // d1.eat();
//         // d1.walk();
//         // Hen h1 = new Hen();
//         // h1.walk();
//         // System.out.println(h1.color);
//         Husky h = new Husky();
//     }
// }
// abstract class Animal{
//     String color;
//     // Animal() {  //constructor in the abstract class
//     //     color = "Brown";
//     // }
//     Animal(){
//         System.out.println("Animal Constructor is call!");
//     }

//     void eat(){
//         System.out.println("Eat Food!");
//     }
//     abstract void walk();
// }
// class Dog extends Animal{
//     void changeColor(){
//         color = "Black";
//     }
//     Dog() {
//         System.out.println("Dog Constructor is call!");
//     }
//     void walk(){
//         System.out.println("Walk on 4 leg!");
//     }
// }
// class Husky extends Dog{
//     Husky() {
//         System.out.println("Husky Constructor is call!");
//     } 
// }
// class Hen extends Animal{
//     void changeColor(){
//         color = "White";
//     }
//     void walk(){
//         System.out.println("Walk on 2 leg!");
//     }
// }

    // Interface:-

//     public static void main(String[] args) {
//         // Batsman b = new Batsman();
//         // b.role();
//         // AllRounder a = new AllRounder();
//         // a.role();

//         Beer b1 = new Beer();
//         b1.eat();
//     }
// }
//     interface cricket{
//         void role();
//     }
//     class Batsman implements cricket{
//         public void role(){
//             System.out.println("Batsman are batted!");
//         }
//     }
//     class Bowler implements cricket{
//         public void role(){
//             System.out.println("Bowler are boled!");
//         }
//     }
//     class WicketKeeper implements cricket{
//         public void role(){
//             System.out.println("WicketKeeper are keepring!");
//         }
//     }
//     class AllRounder implements cricket{
//         public void role(){
//             System.out.println("It can both bowl and bat!");
//         }
//     }

//     // HomeWork:-

//     interface Harbivore{
//         void eat();
//     }
//     interface Carnervore{
//         void eat();
//     }
//     class Beer implements Harbivore,Carnervore{
//         public void eat(){
//             System.out.println("Eat Both Maet and Grass!");
//         }
//     }


        //  Static keyword:-

        //     public static void main(String[] args) {
        //         Student s1 = new Student();
        //         s1.schoolName = "ppp school"; // Setting the static variable
        //         Student s2 = new Student();
        //         System.out.println(s2.schoolName); // Should print "ppp school"
        //         Student s3 = new Student();
        //         s3.schoolName = "Rose public school";
        //         System.out.println(s3.schoolName);
        //     }
        // }
        // class Student {
        //     String name;
        //     int rollno;
        //     static String schoolName;
        //     void setName(String name){
        //         this.name = name;
        //     }
        //     String getName(){
        //         return this.name;
        //     }
        // }

        // Super keyWord:-

    //     public static void main(String[] args) {
    //         Dog d = new Dog();
    //         System.out.println(d.color);
    //     }
    // }
    //     class Animal{
    //         String color;
    //         Animal(){
    //             System.out.println("Animal constructor is call!");
    //         }
    //     }
    //     class Dog extends Animal{
    //         Dog(){
    //             super();
    //             super.color = "Black";
    //             System.out.println("Dog constructor is call!");
    //         }
    //     }
    public static void main(String[] args) {
        Temp t = new Temp();
    }
}
    class Temp{
        Temp(){
            this(5);
            System.out.println("Temp is call!");
        }
        Temp(int x){
            this(5,15);
            System.out.println("x = "+ x);
        }
        Temp(int x , int y){
            System.out.println("x*y = "+ x*y);
        }
    }