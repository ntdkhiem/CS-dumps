public class Janitor extends Employee 
{
        public void clean() 
        {
            System.out.println("Workin' for the man.");
        }
    
        public int getHours() {
            return super.getHours() * 2;
        }
        
        public int getVacationDays()
        { 
            return super.getVacationDays() / 2; 
        } 
        
        public double getSalary() 
        {
            // return 50000;
            return super.getSalary() - 10000;
        }
}
