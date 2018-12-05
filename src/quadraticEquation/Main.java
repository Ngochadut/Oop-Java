package quadraticEquation;

public class Main {
    public static void main(String[] args){
        QuadraticEquation ptb2 = new QuadraticEquation(1,3,1);
        ptb2.delta();
        ptb2.root1();
        ptb2.root2();
        System.out.println("Quadratic Equation : ");
        System.out.println("Root1 :"+ ptb2.root1());
        System.out.println("Root2 :"+ ptb2.root2());
    }
}
