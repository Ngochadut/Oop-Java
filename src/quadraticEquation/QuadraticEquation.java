package quadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    QuadraticEquation(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double delta(){
        delta = Math.sqrt(b*b - 4*a*c);
        return delta;
    }

    public double root1(){
        double root1;
        if(delta > 0){
            return root1 = (-b + Math.sqrt(delta))/2*a;
        }
        else
            return 0;
    }

    public double root2(){
        double root2;
        if(delta > 0){
            return root2 = (-b - Math.sqrt(delta))/2*a;
        }
        else
            return 0;

    }

}
