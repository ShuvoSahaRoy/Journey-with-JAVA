
package exam;

public class Date {
    private int monthdate;
    private int daydate;
    private int yeardate;
    
    public Date (int month, int day, int year) {
        monthdate = month;
        daydate = day;
        yeardate = year;
    }
    
    public void setMonth (int month) {
        monthdate = month;
    }
    
    public int getMonth() {
        return monthdate;
    }
    
    public void setday (int day) {
        daydate = day;
    }
    
    public int getDay() {
        return daydate;
    }
    
    public void setYear (int year ) {
        yeardate = year;
    }
    
    public int getYear() {
        return yeardate;
    }
    
    public void displayDate () {
        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }

}
