package Stopwatch;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Stopwatch {

    String startTime;
    Stopwatch(){

    }

    public void times(int second){

    }

    public int time(){
        Date today = new Date(System.currentTimeMillis());
        SimpleDateFormat timeFormat= new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        String s=timeFormat.format(today.getTime());
        startTime = s;
        System.out.println(s);
        return 0;
    }
    public int start() {
        int start = time();
        return start;
    }

    public int endTime(){
        int end = time();
        return end;
    }


    public void sort(){
        int[] Arr = new int[1000];
        int i = 0;
        int min = i;
        for(int j = i + 1; j < 1000 ; j ++){
            if(Arr[j] < Arr[min]){
                min = j;
            }
        }
    }

}
