package class1.study;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
