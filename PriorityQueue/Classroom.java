package PriorityQueue;

import java.util.*;

public class Classroom {
    // For Object:-
    static class Student implements Comparable <Student> { //for OverRiding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s1) {
            return this.rank - s1.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Satyam", 10));
        pq.add(new Student("Shivam", 20));
        pq.add(new Student("utsav", 15));
        pq.add(new Student("Raksha", 30));
        pq.add(new Student("Usha", 40));
        pq.add(new Student("Sohani", 1));
        pq.add(new Student("Shashank", 5));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
