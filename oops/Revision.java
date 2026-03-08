package oops;

public class Revision {
    // public static void main(String[] args) {

        // Object and Class:-


//         Student s1 = new Student(); // Create a student object called s1
//         s1.setName("satyam");
//         System.out.println(s1.name);
//         s1.setBranch("CSE");
//         System.out.println(s1.branch);
//         s1.setRollNo(111);
//         System.out.println(s1.rollNo);


//         Traveling t1 = new Traveling();
//         t1.setTrain("sawatanta senani");
//         t1.setTicketFee(545);
//         t1.setFrom("Bhopal junction");
//         t1.setTo("Madhubani");
//         System.out.println(t1.train);
//         System.out.println(t1.ticketFee);
//         System.out.println(t1.form);
//         System.out.println(t1.to);
//         t1.to ="new Delhi"; //we can also write this After declear once
//         System.out.println(t1.to);
//     }
// }

//     class Student{
//         String name;
//         int rollNo;
//         String branch;

//         void setName(String newName){
//             name = newName;
//         }
//         void setRollNo(int newRollNo){
//             rollNo = newRollNo;
//         }
//         void setBranch(String newBranch){
//             branch = newBranch;
//         }
//     } 

//     class Traveling{
//         String train;
//         int ticketFee;
//         String form;
//         String to;

//         void setTrain(String newTrain){
//             train = newTrain;
//         }
//         void setTicketFee(int newTicketFee){
//             ticketFee = newTicketFee;
//         }
//         void setFrom(String newFrom){
//             form = newFrom;
//         }
//         void setTo(String newTo){
//             to = newTo;
    // }

    // Access Modifier:-
    
//     public static void main(String[] args) {
//         BankAccount MyAccount = new BankAccount();
//         MyAccount.userName = "Satyam";
//         MyAccount.bankName = "Union Bank of india";
//         MyAccount.setAccountNo(111);
//         System.out.println(MyAccount.userName);
//         System.out.println(MyAccount.bankName);
//     }
// }
//     class BankAccount{
//         public String userName;
//         protected String bankName;
//         private int accountNo;
//         // To access private things :-
//         void setAccountNo(int AccNo){
//             accountNo = AccNo;
//         }

    //   Getter and Setter:-

// public static void main(String[] args) {
//         Student s1 = new Student(); // Create a student object called s1
//         s1.setName("satyam");
//         System.out.println(s1.name);
//         s1.setBranch("CSE");
//         System.out.println(s1.getBranch());
//         s1.setRollNo(111);
//         System.out.println(s1.getRollNo());
//     }
// }
// class Student{
//             public String name;
//             private int rollNo;
//             private String branch;
//             String getName(){  //Getter
//                 return this.name;
//             }
//             int getRollNo(){
//                 return this.rollNo;
//             }
//             String getBranch(){
//                 return  this.branch;
//             }
//             void setName(String name){   //setter
//                 this.name = name;
//             }
//             void setRollNo(int rollNo){
//                 this.rollNo = rollNo;
//             }
//             void setBranch(String Branch){
//                 this.branch = Branch;
    // }
    
        // Constructor:-

    //     public static void main(String[] args) {
    //         Student s1 = new Student(135);
    //         Student s2 = new Student();
    //         Student s3 = new Student("satyam");
    //         System.out.println(s1.RollNo);
    //         System.out.println(s3.name);
    //         s2.marks[0] = 100;
    //         s2.marks[1] = 90;
    //         s2.marks[2] = 80;
    //         Student copyCon = new Student(s2);
    //         s2.branch = "ME";
    //         s2.course = "M-tech";

    //        for(int i = 0 ; i<3 ; i++){
    //         System.out.println(copyCon.marks[i]);
    //        }
    //         System.out.println(s2.branch);
    //         System.out.println(s2.course);
    //     }
    // }
    //     class Student{
    //         String name; 
    //         int RollNo;
    //         String branch;
    //         String course;
    //         int marks[];

    //         Student(Student s2){ //copy Constructor & Shallow copy constructor
    //             marks = new int[3];
    //             this.branch = s2.branch;
    //             this.course = s2.course;
    //             this.marks = s2.marks;
    //         }
    //         Student(){ //Non-Parameterized Constuctor
    //             marks = new int[3];
    //             System.out.println("Constuctor is call");
    //         }
    //         Student(int rollNo){   //Parameterized constructor
    //             marks = new int[3];
    //             this.RollNo = rollNo;
    //         }
    //         Student(String name){
    //             marks = new int[3];
    //             this.name = name;
    //         }
    //     }


    

}