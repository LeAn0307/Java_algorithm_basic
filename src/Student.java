import java.util.*;

public class Student {
    Integer age;
    String name;

    Student() {

    }

    Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public void InputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        this.name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        this.age = scanner.nextInt();
    }

    public void OutputStudent() {

        System.out.print(this.name);
        System.out.print(" - ");
        System.out.print(this.age);

    }
}
