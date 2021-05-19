public class LegalSecretary extends Secretary
{
    public double getSalary() {
        return 45000.0;
    }
    
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }
    
    public void takeDictation(String text)
    { 
        System.out.println("Dictating text: " + text); 
    } 
}  

