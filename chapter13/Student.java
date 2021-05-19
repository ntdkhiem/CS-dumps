public class Student
{
    public String lastName, firstName;
    public String idNum;
    public Double average;
    public char letterGrade;

    public Student()
    {
        this("","","",0.0,' ');
    }
    public Student(String lastName, String firstName, String idNum,
                      double average, char letterGrade)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNum = idNum;
        this.average = average;
        this.letterGrade = letterGrade;
    }
    public String toString()
    {
        return lastName + " " + firstName + " " + idNum  + " " +
               average + " " + letterGrade;
    }
    
    
}  // Student  