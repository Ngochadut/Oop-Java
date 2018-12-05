package com.company;

public class Main {

    public static void main(String[] args) {
    Rectangle ret = new Rectangle();
    ret.getArea();
    ret.getPerimeter();
    ret.show();
    }

    public static class Rectangle {
        int width = 20;
        int heght = 30 ;
        int S;
        int C;
        public int getArea(){
             C = (width + heght)/2;
            return C;
        }

        public int getPerimeter(){
             S = width*heght;
            return S;
        }

        public void show(){
            System.out.println(S);
            System.out.println(C);
        }
    }
}
