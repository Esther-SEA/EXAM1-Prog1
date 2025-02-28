
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
        public Salary(double hoursWorked, double hourlyWage)
    {
        // put your code here
        double salary = hoursWorked * hourlyWage;
        double netPay = salary - salary *0.30;
        System.out.println(netPay);
    }
}
