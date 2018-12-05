package student;

import java.util.Date;
import java.util.Scanner;

//Xây dựng lớp Candidate (Thí sinh) gồm các thuộc tính: mã, tên,
// ngày tháng năm sinh, điểm thi
// Toán, Văn, Anh và các phương thức cần thiết.
//Xây dựng lớp TestCandidate để kiểm tra lớp trên:
//– Nhập vào n thí sinh (n do người dùng nhập)
//– In ra thông tin về các thí sinh có tổng điểm lớn hơn 15
public class Student {
    Scanner scanner = new java.util.Scanner(System.in);
    private int theNumberStudent;
    private String name;
    private int id;
    private int age;
    private int point;
    Student(String name , int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;

    }
    Student(){

    }

    public int getTheNumberStudent() {
        return theNumberStudent;
    }

    public void setTheNumberStudent(int theNumberStudent) {
        this.theNumberStudent = theNumberStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
    }
}
