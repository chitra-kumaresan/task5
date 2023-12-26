package taskfour;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        //using scanner class to get dob
        System.out.println("Enter your Birthdate(yyyy-mm-dd) :");
        Scanner sc=new Scanner(System.in);
        LocalDate DOB=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());

        //i/p:current localdate,user dob
        //o/p:age(year,month,day)
        LocalDate currentDate=LocalDate.now();
       int years= Period.between(DOB,currentDate).getYears();
        int month=Period.between(DOB,currentDate).getMonths();
        int days=Period.between(DOB,currentDate).getDays();

       System.out.println("Your age is  " + years + " years, " + month +  " months and "+ days + " days");
    }
}
