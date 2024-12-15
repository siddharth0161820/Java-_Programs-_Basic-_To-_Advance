//Create a PriorityQueue of a custom class Student with attributes
//name and grade. Use a comparator to order by grade

package Challenges94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentpPriorityQueue {
    //4>psvm
    public static void main(String[] args) {
        ///5>creating comparator
               ////5.1> Use a comparator to order by grade..
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getStudentGrade()-t1.getStudentGrade();
            }
        });
        ///5.2> add the students
        queue.offer(new Student("Sidd",'A'));
        queue.offer(new Student("siddharth",'C'));
        queue.offer(new Student("Shubham",'B'));
        queue.offer(new Student("RAM",'D'));
        queue.offer(new Student("RAHUL",'A'));
        System.out.printf("Queue is : %s\n ",queue);
        System.out.printf("Getting elements as : %s\n ",queue.poll());
        System.out.printf("Getting elements as  : %s\n ",queue.poll());
        System.out.printf("Getting elements as  : %s\n ",queue.poll());
        System.out.printf("Getting elements as  : %s\n ",queue.poll());
        System.out.printf("Getting elements as  : %s\n ",queue.poll());


    }

    ///1> create a class with name student
    private static class Student{
        ///2>Instance variable for student class
        private  final String  studentName;
        private  final char studentGrade;

        ///3>Constructor to assign both the values

        public Student(String studentName, char studentGrade) {
            this.studentName = studentName;
            this.studentGrade = studentGrade;
        }

        //4>getter no setter required as the attributes are set as final can be changed

        public String getStudentName() {
            return studentName;
        }

        public char getStudentGrade() {
            return studentGrade;
        }

        ///4.1> OTSTRING FOR STUDENT

        @Override
        public String toString() {
            return studentName + ": " + studentGrade;
        }
    }
}
