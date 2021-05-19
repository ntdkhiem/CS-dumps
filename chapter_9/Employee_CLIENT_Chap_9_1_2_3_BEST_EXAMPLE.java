public class Employee_CLIENT_Chap_9_1_2_3_BEST_EXAMPLE 
{ 
 
     public static void main() 
     { 
     /* Given */


        // Create Employee subclass just as pg 577       
        System.out.println(" ---------------------- Pg 577 Employee ---------------------- ");      
        Employee eddy = new Employee("eddy");
        System.out.println("Employee: Eddy"); 
        System.out.print(eddy.getHours() + ", "); 
        System.out.printf("$%.2f, ", eddy.getSalary()); 
        System.out.print(eddy.getVacationDays() + ", "); 
        System.out.println(eddy.getVacationForm()); 
        System.out.println(" -------------------------------- \n\n");           
        
        // Create Secretary subclass just as pg 580   
        System.out.println(" ---------------------- Pg 578 Secretary ---------------------- ");        
        Secretary sally = new Secretary();   
        System.out.println("Secretary: sally"); 
        System.out.print(sally.getHours() + ", "); 
        System.out.printf("$%.2f, ", sally.getSalary()); 
        System.out.print(sally.getVacationDays() + ", "); 
        System.out.println(sally.getVacationForm()); 
        sally.takeDictation("Sally is taking dictation!"); 
        System.out.println(" -------------------------------- \n\n");        
        
        //Create Lawyer subclass just as pg 581  
        System.out.println(" ---------------------- Pg 581 Lawyer ---------------------- ");     
        Lawyer leia = new Lawyer();                           
        System.out.println("Lawyer: leia"); 
        System.out.print(leia.getHours() + ", "); 
        System.out.printf("$%.2f, ", leia.getSalary()); 
        System.out.print(leia.getVacationDays() + ", "); 
        System.out.println(leia.getVacationForm()); 
        leia.sue(); 
        System.out.println(" -------------------------------- \n\n");        
         
       //Create LegalSecretary subclass just as pg 582     
        System.out.println(" ---------------------- Pg 582 LegalSecretary ---------------------- ");       
        LegalSecretary leo = new LegalSecretary(); 
        System.out.println("Legal Secretary: leo"); 
        System.out.print(leo.getHours() + ", "); 
        System.out.printf("$%.2f, ", leo.getSalary()); 
        System.out.print(leo.getVacationDays() + ", "); 
        System.out.println(leo.getVacationForm()); 
        leo.takeDictation("leo is taking dictation!"); 
        leo.fileLegalBriefs(); 
        System.out.println(" -------------------------------- \n\n");           
        
       //Pg 642 Exercise #1: Create mike the Marketer subclass 
        System.out.println(" ---------------------- Pg 642 Exercise #1---------------------- ");       
        Marketer mike = new Marketer();             
        System.out.println("Marketer: mike"); 
        System.out.print(mike.getHours() + ", "); 
        System.out.printf("$%.2f, ", mike.getSalary()); 
        System.out.print(mike.getVacationDays() + ", "); 
        System.out.println(mike.getVacationForm()); 
        mike.advertise();
        System.out.println(" -------------------------------- \n\n");        

      // Pg 642 Exercise #2: Create jay the Janitor
        System.out.println(" ---------------------- Pg 642 Exercise #2---------------------- ");      
        Janitor jay = new Janitor();    
        System.out.println("Janitor: jay"); 
        System.out.print(jay.getHours() + ", "); 
        System.out.printf("$%.2f, ", jay.getSalary()); 
        System.out.print(jay.getVacationDays() + ", "); 
        System.out.println(jay.getVacationForm()); 
        jay.clean();
        System.out.println(" -------------------------------- \n\n"); 
        
        // Pg 643 Exercise #3: Create harry the HarvardLawyer
        System.out.println(" ---------------------- Pg 643 Exercise #3 ---------------------- ");                
        HarvardLawyer harry = new HarvardLawyer();
        System.out.println("Harvard Lawyer:harry "); 
        System.out.print(harry.getHours() + ", "); 
        System.out.printf("$%.2f, ", harry.getSalary()); 
        System.out.print(harry.getVacationDays() + ", "); 
        System.out.println(harry.getVacationForm()); 
        harry.sue(); 
        System.out.println(" -------------------------------- \n\n");                       
          
    // pg 583-4 Overriding/partial-overriding methods
    // Problem: Have it such that LegalSecretaries make $5000 more than secretaries
    // and HarvardLawyers make 1.20% more than regular Lawyers.
    // Solution: Partially override LegalSecretary's and HarvardLawyer's getSalary()
    //    Make the changes needed and rerun the program as the above code will 
    //    show the difference in the output.
    //      In LegalSecretary super.getSalary():  super.getSalary() + 5000;
    //      In HarvardLawyer super.getSalary(): super.getSalary() * 1.20;
    // Compile and run your program again.
    
    // pg 587 >>>>>>> VERY IMPORTANT <<<<<<<
    // Say 100 times: "I promise I will ALWAYS write my own default constructor!!!"
    // (1) Comment out Employee() default constructor and recompile: Error!! So put it back in.
    // (2) Comment out Secretary() default constructor and recompile. Fine/No problem.
    //     Why?  Because an INVISIBLE one was created for you. Leave it commented out for now.
    // (3) Comment out LegalSecretary default constructor and recompile. Fine/No problem.
    // (4) Put back in LegalSecretary default constructor and inside of it put: super().
    //     Recompile.  Result = ERROR!!
    //     Q: Why?
    //     A: Because we wrote our own Secretary constructor that took in a String, Java thinks
    //        that we know best and do not want a default constructor for Secretary. But LegalSecretary
    //        default constructor first line, invisible to us, is implicitly calling Secretary default 
    //        constructor but cannot find it. Thus: ERROR!
    //
    //  Thus, the rule:  "I promise I will ALWAYS write my own default constructor!!!"
    // Compile and run your program again.
    
     // Section 9.2 pg583 - Pg 587 super(name)        
     // Add into Employee:    
     //    (1) a String field called "name" 
     //    (2) a constructor that takes in String for name.
     // Add into Lawyer:
     //    (1) A constructor that takes in a String for name and
     //        passes that String name up to the Employee class.
     System.out.println(" ---------------------- Section 9.2 pg583 - Pg 587 super(name) ---------------------- ");               
     Lawyer larry1 = new Lawyer();
     System.out.println("larry1's name = " + larry1.getName());
     Lawyer larry2 = new Lawyer();
     System.out.println("larry2's name = " + larry2.getName());
     System.out.println(" -------------------------------- \n\n");         
    
     // Pg 590 Object Class
     System.out.println(" ---------------------- Pg 590 Object Class ---------------------- ");     
     // Every class extends Object, essentionally.  
     // Change "Employee" to extend Object explicitly, even though it does implicitly.
     //      public class Employee extends Object
     //  Also, since all the subclasses extend Employee in some way, they also extend Object.
     //  Q: What does the following line print?
     System.out.println("larry1.getClass() = " + larry1.getClass() );
     System.out.println(" -------------------------------- \n\n");         
     
     // Pg 591 .equals() Method.
     System.out.println(" ---------------------- Pg 591 .equals() Method. ---------------------- ");     
     // (I) We can overite the .equals() method in Object to compare anything we want in the class.
     // For example, add the following code to Lawyer where as it compares 2 Lawyers salaries. 
     //  public boolean equals(Lawyer that)
     //  {
     //       return (this.getSalary() == that.getSalary());
     //  }     
     System.out.println("larry1.equals(larry2) = " + larry1.equals(larry2));  
     System.out.println("larry1.equals(harry) = " + larry1.equals(harry));  
     Lawyer law = larry1;
     System.out.println("law.equals(larry2) = " + law.equals(larry2));      
     
     System.out.println("(larry1 == larry2): " + (larry1 == larry2));
     System.out.println("(larry1 == law): " + (larry1 == law));
         
     // Put in at least 2 more examples, one that results in true the other false.
     System.out.println(" -------------------------------- \n\n");       
     // 
     // (II) Pg 591 .equals() Method again. [Delete equals() from Lawyer and put the following in Employee]
     //      Question: But what if we want to see if any 2 Employees are .equal()? Where should we put the it?
     //      Answer: in Employee as follows
     //      public boolean equals(Employee that)
     //      {
     //           return (this.getSalary() == that.getSalary());
     //      }  
     // (III) Pg 593-594 Java standard .equals(Object) [Change equals() in Employee to the following.]
     //      In keeping with Java's standard .equals() method  we will write it as follows.
     //      public boolean equals(Object that)
     //      {
     //      Employee e = (Employee) that;
     //           return (this.getSalary() == e.getSalary());
     //      }   
     // Compile and run your program again.     
     
     // Pg 594 instanceof keyword 
        System.out.println(" ---------------------- Pg 594 instanceof keyword ---------------------- ");
        System.out.println("(harry instanceof HarvardLawyer): " + (harry instanceof HarvardLawyer));
        System.out.println("(harry instanceof Lawer): " + (harry instanceof Lawyer));
        System.out.println("(harry instanceof Employee): " + (harry instanceof Employee));     
  // Error: System.out.println("(harry instanceof Secretary): " + (harry instanceof Secretary));
        // >>>>>>>    Write a few of your own where 2 of them would be true and 2 others would be false.
       Employee e = harry;
       System.out.println("(e instanceof HarvardLawyer): " + (e instanceof HarvardLawyer));
       System.out.println("(e instanceof Lawer): " + (e instanceof Lawyer));
       System.out.println("(e instanceof Employee): " + (e instanceof Employee)); 
       System.out.println("(e instanceof Secretary): " + (e instanceof Secretary));
       System.out.println("(e instanceof Janitor): " + (e instanceof Janitor));           
       System.out.println(" -------------------------------- \n\n");        
     
   
      // pg 596-7 >>>>>> Section 9.3 Polymorphism. <<<<<<<
      // Demonstrates polymorphism by passing many types of employees
      // as parameters to the same method.
      Employee edna = new Employee();
      Lawyer lucy = new Lawyer();
      Secretary stan = new Secretary();
      LegalSecretary leoo = new LegalSecretary();
             printInfo(edna);
             printInfo(lucy);
             printInfo(stan);
             printInfo(leo);

     // pg 598 Errors in "late binding" 
     Employee ed = new LegalSecretary();
     //ed.takeDictation("Hello");  // compile error
     //ed.fileLegalBriefs();  // compile error         
     
     // pg 599 CompileTime vs RunTime
     Secretary steve = new LegalSecretary();
     steve.takeDictation("Hello");
     //steve.fileLegalBriefs();  // compile error     
     Employee edd = new Secretary();
     ((Secretary) edd).takeDictation("Hello");  // OK
     
     // Pg 599 (continued) CompileTime vs RunTime 
     // Given the declarations below, fix all statements either by down casting
     //   or stating why the statement is impossible:
     Employee e1 = new Marketer();
     Employee e2 = new Janitor();
     Employee e3 = new LegalSecretary();
     Employee e4 = new Employee();
     Employee e5 = new Secretary();
     Employee e6 = new Marketer();
     Employee e7 = new Janitor();        
     // e1.advertise();
     // e2.clean();
     // e3.fileLegalBriefs();
     // e4.sue();
     // e5.fileLegalBriefs();
     // e6.clean();
     // e7.sue();     
     
     // Pg 600 - Polymorphism Mechanics
     // Array of Employee: It works just the code above from pg 597.
     System.out.println("\n\n printInfo via emps");
     Employee emps[] = {edna, lucy, stan, leo, new Janitor()};
     for (int i=0; i<emps.length; i++)
         printInfo(emps[i]);     
  
 
    } //  main

     // =====================================================================
     // pg 596-7 >>>>>> Section 9.3 Polymorphism. (continued) <<<<<<< 
     // Prints information about any kind of employee.     
     public static void printInfo(Employee e) 
     {
         System.out.print(e.getHours() + ", ");
         System.out.printf("$%.2f, ", e.getSalary());
         System.out.print(e.getVacationDays() + ", ");
         System.out.print(e.getVacationForm() + ", ");
         System.out.println(e); // toString representation of employee
         
   // Uncover the following and find out if they work. Why or why not?
     /*  System.out.println("e.sue(): " + e.sue());
         System.out.println("e.takeDictation(): " + e.takeDictation());
         System.out.println("e.fileLegalBriefs(): " + e.fileLegalBriefs());         
     */
    
     } // printInfo
     
     
     
} // Employee_CLIENT_Chap_9_1_2_3_BEST_EXAMPLE     
