public class HarvardLawyer extends Lawyer
{ 
 
 // overrides getVacationDays from Employee class 
 public int getVacationDays()
 { 
     return super.getVacationDays() + 3; 
 } 
 
 public double getSalary() {
     return super.getSalary() * 1.20;
 }
 
 // overrides getVacationForm from Employee class 
 public String getVacationForm() 
 { 
     return super.getVacationForm() +
            super.getVacationForm() +
            super.getVacationForm() + 
            super.getVacationForm(); 
     // return "pinkpinkpinkpink";
 }
 public void sue()
 { 
     System.out.println("I'll see you in court!"); 
 } 
 
}
