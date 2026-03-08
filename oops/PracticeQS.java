package oops;

public class PracticeQS {
    //  1.Qs:-

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.name = "aman";
//         System.out.println(s.name);
//     }
// }
// class Student{
//     String name;
//     int roll;
// }

    //  4.Qs:-

//     public static void main(String[] args) {
//         vehicle v = new car();
//     }
// }
//     class vehicle{
//         void color(){
//             System.out.println("Blue");
//         }
//     }
//     class car extends vehicle{
//         void color(){
//             System.out.println("black");
//         }
//     }

    //  5.QS
//     public static void main(String[] args) {
//         vehicle v = new car();
//         v.print();

//         vehicle v1 = new vehicle();
//         v1.print();
//     }
// }
//     class vehicle{
//         void print(){
//             System.out.println("Base class is call");
//         }
//     }
//     class car extends vehicle{
//         void print(){
//             System.out.println("Derived class is call");
//         }
//     } 


    //    6.Qs
public static void main(String[] args) {
    vehicle v = new car();
    // v.print_1();  // it give error

    vehicle v1 = new vehicle();
    v1.print();
}
}
class vehicle{
    void print(){
        System.out.println("Base class is call");
    }
}
class car extends vehicle{
    void print_1(){
        System.out.println("Derived class is call");
    }
} 


