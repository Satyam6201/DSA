package oops;

public class inheritance {

        // Inheritance:-

//     public static void main(String[] args) {
//         Animals a1 = new Animals();
//         Fish shark = new Fish();
//         shark.eat();
//         shark.breath();
//         shark.swim();
//         a1.skin_color = "gray";
//         a1.weight = 20;
//         System.out.println(a1.skin_color);
//         System.out.println(a1.weight);
//     }
// }
//     // Base Class 
//     class Animals{
//         String skin_color;
//         int weight;
//         void eat(){
//             System.out.println("Eat rice");
//         }
//         void breath(){
//             System.out.println("breath");
//         }
//     }
//         // Derived Class
//     class Fish extends Animals{
//         int fine;
//         String name;
//         void swim(){
//             System.out.println("Swimming in the water");
//         }
// }

    // 1.Single Inheritance:-

//    public static void main(String[] args) {
//         Animals a1 = new Animals();
//         Fish shark = new Fish();
//         shark.eat();
//         shark.breath();
//         shark.swim();
//         a1.skin_color = "gray";
//         a1.weight = 20;
//         System.out.println(a1.skin_color);
//         System.out.println(a1.weight);
//     }
// }
//     // Base Class 
//     class Animals{
//         String skin_color;
//         int weight;
//         void eat(){
//             System.out.println("Eat rice");
//         }
//         void breath(){
//             System.out.println("breath");
//         }
//     }
//         // Derived Class
//     class Fish extends Animals{
//         int fine;
//         String name;
//         void swim(){
//             System.out.println("Swimming in the water");
//         }
//     }

    //2.MultiLevel Inheritance :-

//         public static void main(String[] args) {
//         Animals a1 = new Animals();
//         Dogs tom = new Dogs();
//         Cats jerry = new Cats();
//         tom.eat();
//         tom.bark();
//         jerry.legs = 4;
//         jerry.name = "jerry";
//         jerry.home();
//         System.out.println(jerry.legs);
//         System.out.println(jerry.name);
//     }
// }
//     // Base Class 
//     class Animals{
//         void eat(){
//             System.out.println("Eat rice");
//         }
//     }
//         // Derived Class
//     class Dogs extends Animals{
//         String name;
//         void bark(){
//             System.out.println("Barking");
//         }
//     }
//     // Another Derived Class
//     class Cats extends Dogs{
//         int legs;
//         void home(){
//             System.out.println("in the house");
//         }
//    }

    //3.Hierarchical Inheritance:-

//     public static void main(String[] args) {
//         Animals a1 = new Animals();
//         a1.color();
//         Dogs d1 = new Dogs();
//         d1.name = "Tom";
//         System.out.println(d1.name);
//         d1.bark();
//         d1.color();
//         Cats c1 = new Cats();
//         c1.name();
//         Elephant e1 = new Elephant();
//         e1.teeth();
//         e1.color();
//     }
// }
//     // Base Class
//     class Animals{
//         void color(){
//             System.out.println("gray in color");
//         }
//     }
//     // Derived Class
//     class Dogs extends Animals{
//         String name;
//         void bark(){
//             System.out.println("Barking!");
//         }
//     }
//     // Derived Class
//     class Cats extends Animals{
//         void name(){
//             System.out.println("Pussy");
//         }
//     }
//     // Derived Class
//     class Elephant extends Animals{
//         void teeth(){
//             System.out.println("Only Two Teeth");
//         }
//     }

    // 4.Hybrid Inheritance:-

    public static void main(String[] args) {
        Animals a1 = new Animals();
        a1.eat();
        BabyDog b1 = new BabyDog();
        b1.bark();
        b1.weep();
        shark s1 = new shark();
        s1.eat();
        s1.swim();
        Bird b2 = new Bird();
        b2.fly();

    }
}   
    class Animals{
        void eat(){
            System.out.println("Eat");
        }
    }
    class Dogs extends Animals{
        void bark(){
            System.out.println("Barking");
        }
    }
    class BabyDog extends Dogs{
        void weep(){
            System.out.println("Weeping");
        }
    }
    class Fish extends Animals{
        void swim(){
            System.out.println("Swimming");
        }
    }
    class shark extends Fish{
        void size(){
            System.out.println("Very Big in the size");
        }
    }
    class Bird extends Animals{
        void fly(){
            System.out.println("Fly");
        }
    }



      


    






    
