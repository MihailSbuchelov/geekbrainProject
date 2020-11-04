package oop;

public class Employee {

    private String fio;
    private String position;
    private String email;
    private String telefonNum;
    private Double salary;
    private int age;

    public Employee(String fio, String position, String email, String telefonNum, Double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telefonNum = telefonNum;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNum() {
        return telefonNum;
    }

    public void setTelefonNum(String telefonNum) {
        this.telefonNum = telefonNum;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfoAboutEmployee() {
        System.out.println(String.format(" Employee: %s, age: %s, %n position: %s, salary: %s, %n telefon number: %s, %n email: %s " +
                        "%n_____________________________________",
                this.getFio(), this.getAge(), this.getPosition(), this.getSalary(), this.getTelefonNum(), this.getEmail()));
    }
}