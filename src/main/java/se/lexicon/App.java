package se.lexicon;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        long seconds, sec, minutes, hours, inter;
        System.out.println("Enter Seconds to Convert into hours, Minutes and seconds");
        Scanner scan = new Scanner(System.in);
        seconds = scan.nextLong();

        //hours
        hours = seconds / 3600;

        //minutes
        inter = seconds % 3600;
        minutes = inter / 60;

        //Seconds
        sec = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + sec);


    }
}
