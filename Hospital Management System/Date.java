/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.io.Serializable;

public class Date implements Serializable{

    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y){

       
        day = checkDay(d);
         month = checkMonth(m);
        year = y;

     //   System.out.printf("Date object constructor for Date %s\n", this);
    }

    private int checkMonth(int m) {
        if (m>0 && m<=12)
            return m;
        else {
            System.out.println(m);
            return 1;
        }
    }

    private int checkDay(int d) {
        int daysPerMonth[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (d>0 && d<=daysPerMonth[month])
            return d;
   //     System.out.println(d);
        return 1;
    }

    @Override
    public String toString() {
        return String.format("%d%d%d", month, day, year);
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
        
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
  
}

