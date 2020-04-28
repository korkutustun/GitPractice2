package day_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localdate {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        String[] friends={"Ali","Veli","Ahmet"};
        LocalDate alibirtday=LocalDate.of(2010,12,27);
        LocalDate Velibirtday=LocalDate.of(2008,6,27);
        LocalDate ahmetbirtday=LocalDate.of(2001,8,10);
        Boolean yil=alibirtday.isAfter(Velibirtday);
        Boolean yil2=alibirtday.isBefore(Velibirtday);
        System.out.println(yil+ "" + yil2);
        LocalDate[] bd={alibirtday,Velibirtday,ahmetbirtday};
        for(int i = 0; i<friends.length; i++){
            System.out.println(friends[i]+"`s birday is "+bd[i]);
        }
        System.out.println("#####################################");
        LocalTime saat=LocalTime.now();
        System.out.println(saat);
        LocalTime time1=LocalTime.of(14,30,35);
        System.out.println(time1);
        System.out.println("#######################################################");
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time1.format(dtf));
        System.out.println("##########################################################");
        LocalDateTime datetime1=LocalDateTime.now();
        System.out.println(datetime1);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("EEE MM/dd/YYYY,  hh:mm:ss a");
        LocalDateTime time3=LocalDateTime.now();
        System.out.println(time3.format(dtf1));
    }
}
