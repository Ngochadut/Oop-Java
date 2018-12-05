package Stopwatch;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new java.util.Scanner(System.in);
        int choice;
        Stopwatch time = new Stopwatch();
        time.start();
        System.out.println("is executing algorithm (1)");
        time.sort();
        time.endTime();

    }
}
