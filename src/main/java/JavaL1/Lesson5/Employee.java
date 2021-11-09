package JavaL1.Lesson5;

// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;


// 2. Конструктор класса должен заполнять эти поля при создании объекта.

    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

// 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    public void outputInfo() {
        System.out.println("fullName:" + fullName + ", position: " + position
                + ", email: " + email + ", salary: " + salary + ", age: "
                + age);
    }


    int empAge() {
        return age;
    }

}




