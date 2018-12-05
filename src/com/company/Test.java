package com.company;

public class Test {
    String loai;
    String ten;
    void bay(){
    }

    void Dongvat(String loai){
        this.loai = "chim";
    }
}

class Test1{
    public static void main(String[] args){
        Test obj = new Test();
        System.out.println(obj.loai);
    }
}
