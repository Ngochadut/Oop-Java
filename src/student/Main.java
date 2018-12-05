package student;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //nhập số lượng sinh viên
        Scanner scanner = new java.util.Scanner(System.in);
        Student st = new Student();
        int number;
        System.out.println("Enter the number student : ");
        number = scanner.nextInt();
        st.setTheNumberStudent(number);
        //nhập tên
        String name;
        System.out.println("Enter the name : ");
        name = scanner.nextLine();
        st.setName(name);
        //nhập tuổi
        int age;
        System.out.println("Enter the age : ");
        age = scanner.nextInt();
        st.setAge(age);
        //nhập id
        int id;
        System.out.println("Enter the id : ");
        id = scanner.nextInt();
        st.setId(id);
        //nhập điểm
        int point;
        System.out.println("Enter the point : ");
        point = scanner.nextInt();
        st.setPoint(point);

    }

}
