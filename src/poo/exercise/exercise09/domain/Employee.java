package poo.exercise.exercise09.domain;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){}

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(Double percentage){
        this.salary += salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return  "%d, %s, %.2f".formatted(id, name, salary);
    }
}
