package Stock;

import javax.naming.Name;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Stock {
    static String changePercentString;
    double currentPrice;
    double previousClosingPrice;
    static float rate;
    String name;
    String symbol;

    Stock(String ten, String symbol) {
        this.name = ten;
        this.symbol = symbol;
    }

    public static String getChangePercent(double previousClosingPrice, double currentPrice) {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);// làm tròn số
        if (previousClosingPrice > currentPrice) {
            rate = (float) ((previousClosingPrice - currentPrice) / currentPrice * 100);
            changePercentString = "increase " + df.format(rate);
        } else if (previousClosingPrice < currentPrice) {
            rate = (float) ((currentPrice - previousClosingPrice) / previousClosingPrice * 100);
            changePercentString = "decrease " + df.format(rate);
        }
        return changePercentString;
    }
    public void show() {
        System.out.println(name);
        System.out.println(symbol);
        System.out.println(changePercentString);
    }
}
// dùng if và else khi giá hai ngày khác nhau(sủ dụng hàm  format)
    //public String
    /*public double previousClosingPrice(){
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the previouClosingPrice : ");
        previousClosingPrice = scanner.nextDouble();
        return previousClosingPrice;
    }

    public double currentPrice(){
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter the currentPrice : ");
        currentPrice = scanner.nextDouble();
        return currentPrice;
    }

    public float getChangePercent(){
        rate = (float)Math.abs(currentPrice - previousClosingPrice)/100;
        return rate;
    }*/

//tính giá chênh lệch của cổ phiếu của hôm nay và ngày hôm trước.
// công thức : (curn - pe / pe)*100 giá hiện tại lớn hơn ngày hôm qua
// dùng khi giá hiện tại bé hơn ngày hôm qua
