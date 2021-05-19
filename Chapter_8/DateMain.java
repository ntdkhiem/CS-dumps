public class DateMain
{

    public static void main()
    {
        Date d1 = new Date(2001,1,1);
        Date d2 = new Date(2000,1,1);

        // >>>>>>>>>>  d1: year = 2001 [NOT Leap Year] <<<<<<<<<<
        System.out.println("\n >>>>>  d1: year = 2001 [NOT Leap Year] <<<<<");
        // January 10,2001
        System.out.println("d1: " + d1.toString());        
        System.out.print("d1.addDays(10): January 10,2001 "); 
        d2.addDays(10);
        System.out.println(d1);
        // February 1,2001 
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(32): February 1,2001 "); 
        d1.addDays(32);
        System.out.println(d1);        
        // February 28,2001  
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(59): February 28,2001 "); 
        d1.addDays(59);
        System.out.println(d1);
        // February 29,2001         
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(60): March 1, 2001 "); 
        d1.addDays(60);
        System.out.println(d1);         
        // March 2, 2001         
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(61): March 2, 2000 "); 
        d1.addDays(61);
        System.out.println(d1);   
        // July 31, 2001       
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(212): July 31, 2001 "); 
        d1.addDays(212);
        System.out.println(d1);      
        // December 31, 2001     
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(365): December 31, 2001  "); 
        d1.addDays(365);
        System.out.println(d1);
        // January 1, 2002     
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(366): January 1, 2002   "); 
        d1.addDays(366);
        System.out.println(d1); 
        // January 1, 2003     
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(731): January 1, 2003   "); 
        d1.addDays(731);
        System.out.println(d1);    
        // January 1, 2004     
        d1.setDate(2001,1,1);
        System.out.println("d1: " + d1.toString());          
        System.out.print("d1.addDays(1096): January 1, 2004   "); 
        d1.addDays(1096);
        System.out.println(d1);  

        // >>>>>>>>>>  d2: year = 2000 [IS a Leap Year] <<<<<<<<<<        
        System.out.println("\n >>>>>  d2: year = 2000 [Leap Year] <<<<<");
        // January 10,2000
        System.out.println("d2: " + d2.toString());        
        System.out.print("d2.addDays(10): January 10,2000 "); 
        d2.addDays(10);
        System.out.println(d2);
        // February 1,2000 
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(32): February 1,2000 "); 
        d2.addDays(32);
        System.out.println(d2);        
        // February 28,2000 
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(59): February 28,2000 "); 
        d2.addDays(59);
        System.out.println(d2);
        // February 29,2000 (2000 is a leap year!)        
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(60): February 29,2000 (2000 is a leap year!) "); 
        d2.addDays(60);
        System.out.println(d2);         
        // March 1, 2000         
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(61): March 1, 2000 "); 
        d2.addDays(61);
        System.out.println(d2);     
        // July 31, 2000       
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(211): July 31, 2000 "); 
        d1.addDays(211);
        System.out.println(d1);      
        // December 31, 2000     
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(366): December 31, 2000  "); 
        d2.addDays(366);
        System.out.println(d2);    
        // January 1, 2001     
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(367): January 1, 2001   "); 
        d2.addDays(367);
        System.out.println(d2);   
        // January 1, 2004     
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(1465): January 1, 2004 (2004 is a leap year!)  "); 
        d2.addDays(1465);
        System.out.println(d2); 
        // February 28, 2004     
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(1523): February 28, 2004 (2004 is a leap year!)   "); 
        d2.addDays(1523);
        System.out.println(d2);   
        // February 29, 2004     
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(1524): February 29, 2004 (2004 is a leap year!)   "); 
        d2.addDays(1524);
        System.out.println(d2);   
        // March 1, 2004     
        d2.setDate(2000,1,1);
        System.out.println("d2: " + d2.toString());          
        System.out.print("d2.addDays(1525): March 1, 2004 (2004 is a leap year!)  "); 
        d2.addDays(1525);
        System.out.println(d2);    

    }

}