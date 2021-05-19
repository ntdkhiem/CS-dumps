public class Employee
    { 
    private String name;
    
        // =====================================================
        public Employee()
        {
            // empty
            // name="";
            this("");
        }
        public Employee(String name)
        {
            this.name = name;     
        }  
        
        // =====================================================
        public boolean equals(Employee that)
        {
            return this.getSalary() == that.getSalary();
        }
        
        
        // =====================================================
        public String getName()
        {
            return name;
        }
        public int getHours() 
        { 
            return 40; 
        } 
        public double getSalary() { 
            return 40000.0; 
        } 
        public int getVacationDays()
        { 
            return 10; 
        } 
        public String getVacationForm() 
        { 
            return "yellow"; 
        } 
    } 
