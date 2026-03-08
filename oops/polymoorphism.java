package oops;

public class polymoorphism {

    // polymoorphism:-

//     public static void main(String[] args) {
//         Person p1 = new Father();
//         Person p2 = new Person();
//         p1.role();
//         p2.role();
//     }
// }
// class Person{
//     void role(){
//         System.out.println("I am a Person!");
//     }
// }
// class Father extends Person{
//     void role(){
//         System.out.println("I am father");
//     }
// }

    //   1.CompileTime Polymorphism(method overloading):-

//     public static void main(String[] args) {
//         Adder a1 = new Adder();
//         a1.Sum(22, 33);
//         a1.Sum(21.8f, 33.2f);
//         System.out.println(a1.Sum(20, 5, 30));
//     }
// }
//     class Adder{
//         void Sum(int a, int b){
//             int add = a+b;
//             System.out.println(add);
//         }
//         void Sum(float a, float b){
//             float add = a+b;
//             System.out.println(add);
//         }
//         int Sum(int a , int b, int c){
//             return a+b+c;
//         }
//     }
    //  2.RunTime Polymorphism(Method OverRiding):-

//     public static void main(String[] args) {
//         SubClass1 s1 = new SubClass1();
//         s1.print();
//         SubClass2 s2 = new SubClass2();
//         s2.print();
//     }
// }
//     class Parents{
//         void print(){
//             System.out.println("I am parents");
//         }
//     }
//     class SubClass1 extends Parents{
//         void print(){
//             System.out.println("Sub-class 1");
//         }
//     }
//     class SubClass2 extends Parents{
//         void print(){
//             System.out.println("sub-class 2");
//         }
    }