
/**
 * Pg 868 Chapter 13 Programming Project #3  "STUDENT DATA_PROCESS"
    Write a program that processes a data file of students’ course grade data. The data arrive in random order; each line
    stores information about a student’s last name, first name, student ID number, grade as a percentage, and letter
    grade. For example, here are a few lines of data:
        Smith Kelly 438975 98.6 A
        Johnson Gus 210498 72.4 C
        Reges Stu 098736 88.2 B
        Smith Marty 346282 84.1 B
        Reges Abe 298575 78.3 C
    Your program should be able to sort the data by any of the columns. Use Comparators to achieve the sort orderings.
    Make the data sortable by last name, student ID, and grade percentage in ascending and descending order. For example,
    here are the lines of student data sorted a few different ways:
        Student data, by last name:
            Johnson Gus 210498 72.4 C
            Reges Stu 098736 88.2 B
            Reges Abe 298575 78.3 C
            Smith Kelly 438975 98.6 A
            Smith Marty 346282 84.1 B
        Student data, by student ID:
            Reges Stu 098736 88.2 B
            Johnson Gus 210498 72.4 C
            Reges Abe 298575 78.3 C
            Smith Marty 346282 84.1 B
            Smith Kelly 438975 98.6 A 
            
OUTPUT:
Programming Project Chapter 5 #3:
================================= 

 Student: LastName FirstName ID AVG Grade 

 Students list originally: 
 students list: [Smith Kelly 438975 98.6 A, Johnson Gus 210498 72.4 C, Reges Stu 098736 88.2 B, Smith Marty 346282 84.1 B, Reges Abe 298575 78.3 C]

 Students list by LastName: 
 students list: [Johnson Gus 210498 72.4 C, Reges Stu 098736 88.2 B, Reges Abe 298575 78.3 C, Smith Kelly 438975 98.6 A, Smith Marty 346282 84.1 B]

 Students list by FirstName: 
 students list: [Reges Abe 298575 78.3 C, Johnson Gus 210498 72.4 C, Smith Kelly 438975 98.6 A, Smith Marty 346282 84.1 B, Reges Stu 098736 88.2 B]

 Students list by idNum: 
 students list: [Reges Stu 098736 88.2 B, Johnson Gus 210498 72.4 C, Reges Abe 298575 78.3 C, Smith Marty 346282 84.1 B, Smith Kelly 438975 98.6 A]

 Students list by Average: 
 students list: [Johnson Gus 210498 72.4 C, Reges Abe 298575 78.3 C, Smith Marty 346282 84.1 B, Reges Stu 098736 88.2 B, Smith Kelly 438975 98.6 A]

 Students list by LetterGrade: 
 students list: [Smith Kelly 438975 98.6 A, Smith Marty 346282 84.1 B, Reges Stu 098736 88.2 B, Johnson Gus 210498 72.4 C, Reges Abe 298575 78.3 C]

            
            
 */
import java.util.*;

public class Chapter5_ProgProject_3_CLIENT_SHELL
{
    public static void main()
    {
    Student students[] = { new Student("Smith","Kelly","438975",98.6,'A'),
                           new Student("Johnson","Gus","210498",72.4,'C'),
                           new Student("Reges","Stu","098736",88.2,'B'),
                           new Student("Smith","Marty","346282",84.1,'B'),
                           new Student("Reges","Abe","298575",78.3, 'C')
                        };
         
            System.out.println("Programming Project Chapter 5 #3:");                        
            System.out.println("================================= \n");   
            System.out.println("Student: LastName FirstName ID AVG Grade \n");
            
            System.out.println("Students list originally: ");
            System.out.print(" students list: "); 
            System.out.print("[");
            for (int i=0; i<students.length-1; i++) 
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length-1]+"]");    
            System.out.println();
            
            System.out.println(" Students list by LastName: ");
            Arrays.sort(students,new studentLastNameComparator());
            System.out.print(" students list: "); 
            System.out.print("[");
            for (int i=0; i<students.length-1; i++) 
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length-1]+"]");    
            System.out.println();  
            
            System.out.println(" Students list by FirstName: ");
            Arrays.sort(students,new studentFirstNameComparator());
            System.out.print(" students list: "); 
            System.out.print("[");
            for (int i=0; i<students.length-1; i++) 
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length-1]+"]");    
            System.out.println();
            
            System.out.println(" Students list by idNum: ");
            Arrays.sort(students,new studentIdNumComparator());
            System.out.print(" students list: "); 
            System.out.print("[");
            for (int i=0; i<students.length-1; i++) 
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length-1]+"]");    
            System.out.println();
            
            System.out.println(" Students list by Average: ");
            Arrays.sort(students,new studentAverageComparator());
            System.out.print(" students list: "); 
            System.out.print("[");
            for (int i=0; i<students.length-1; i++) 
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length-1]+"]");    
            System.out.println();
            
            System.out.println(" Students list by LetterGrade: ");
            Arrays.sort(students,new studentLetterGradeComparator());
            System.out.print(" students list: "); 
            System.out.print("[");
            for (int i=0; i<students.length-1; i++) 
                System.out.print(students[i] + ", ");
            System.out.println(students[students.length-1]+"]");    
            System.out.println();            
     
    } // main
    
    
}  // Chapter5_ProgProject_3
