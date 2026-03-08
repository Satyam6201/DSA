package oops;

public class Basic_Class {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // // Setters:-

        // s1.setName("Satyam");
        // s1.setCollage("Rits");
        // s1.setCourse("B-tech");
        // s1.setRollNo(135);

        // // Getters:-

        // System.out.println(s1.getName());
        // System.out.println(s1.getCollageName());
        // System.out.println(s1.getCourse());
        // System.out.println(s1.getRollNo());


        // Access Modifier:-

        // Account myAccount = new Account();
        // myAccount.UserName = "satyam";
        // myAccount.setPassword("ABC");
        // System.out.println(myAccount.UserName);


        // Constructer:-

        Students s1 = new Students("Satyam Kumar mishra");
        System.out.println(s1.Name);
        Students s2 = new Students(20);
        System.out.println(s2.age);
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;


        // Copy Constructer:-
        
        Students s3 = new Students(s1);
        System.out.println(s3.age);

        // shallow Copy:-

        s1.marks[2] = 85;
        for(int i = 0 ; i< 3; i++){
            System.out.println(s3.marks[i]);
        }
    }
}

// Constructer:-

class Students{
    String Name;
    int age;
    int marks[];

    Students(String Name) {
        this.Name = Name;
    }
    Students(int age) {
        this.age = age;
    }

    // Copy Constructer:-

    // Students(Students s1) {
    //     this.age = s1.age;
    //     this.Name = s1.Name;
    // }

    // Shallow copy:-

    Students(Students s1) {
        marks = new int[3];
        this.Name = s1.Name;
        this.age = s1.age;
        for (int i = 0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    } 
}

// class Student {
//     private String Name;
//     private int RollNo;
//     private String CollageName;
//     private String Course;


//     // Getters:-
//     String getName(){
//         return this.Name;
//     }
//     int getRollNo(){
//         return this.RollNo;
//     }
//     String getCollageName(){
//         return this.CollageName;
//     }
//     String getCourse(){
//         return this.Course;
//     }

//     // Setters:-

//     void setName(String newName){
//         Name = newName;
//     }
//     void setRollNo(int NewRollNo){
//         RollNo = NewRollNo;
//     }
//     void setCourse(String NewCourse){
//        Course = NewCourse;
//     }
//     void setCollage(String newCollage){
//         CollageName = newCollage;
//     } 
// }
//     // Access modifier:-

//     class Account{
//         public String UserName;
//         private String Password;

//         public void setPassword(String PassWord){
//             Password = PassWord;
//         }
//     }

