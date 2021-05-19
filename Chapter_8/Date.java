import java.util.*;

public class Date{

    //feilds
    private int year,month,day;
    private int daysInMonth[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    //constructors
    public Date(){
        this(0,0,0);
    }

    public Date(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

     //methods
       public void setDate(int year,int month,int day)
    {
       this.year = year;
       this.month = month;
       this.day = day;
    }

    public void addDays(int days){
        //starting from this.year
        int total = this.day;
    }
   
    public void addWeeks(int weeks){
        //bois542
    }
    
    public boolean isLeapYear(){
        if (((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return this.year + "/" + this.month + "/" + this.day;
    }
}