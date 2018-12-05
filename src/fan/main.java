package fan;

public class main {
    public static void main(String[] args){
        Fan fan1 = new Fan(2,false,2.5,"Blue");
        fan1.setOn(true);
        fan1.setColor("Blue");
        fan1.setRadius(2.4);
        fan1.setSpeed(1);
        fan1.toString("");
        System.out.println(fan1.toString("on"));
        System.out.println("On/off : " + fan1.isOn());
        System.out.println("Color : " + fan1.getColor());
        System.out.println("Speed : " + fan1.getSpeed());
        System.out.println("Radius of fan : " + fan1.getRadius());

    }

}
