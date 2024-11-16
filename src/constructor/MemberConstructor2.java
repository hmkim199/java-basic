package constructor;

public class MemberConstructor2 {
    String name;
    int age;
    int grade;

    MemberConstructor2(String name, int age) {
        this(name, age, 50); // 생성자 내부에서 다른 생성자 호출 가능. 생성자 코드의 첫 줄에서만 호출 가
    }

    MemberConstructor2(String name, int age, int grade) {
        System.out.println("생성자 호출. name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
