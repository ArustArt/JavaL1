package JavaL1.Lesson5;

public class HomeWorkApp5 {

// 4. Создать массив из 5 сотрудников.

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Konstantin Yurievich Khabensky",
                "actor", "khab@not.com", "89250000000", 200000, 49);
        employees[1] = new Employee("Tatiana Albertovna Arntgolts",
                "actress", "arnt@not.com", "89290000000", 100000, 39);
        employees[2] = new Employee("Vladimir Lvovich Mashkov",
                "actor", "mash@not.com", "89160000000", 250000, 57);
        employees[3] = new Employee("Ekaterina Konstantinovna Guseva",
                "actress", "guse@not.com", "89010000000", 150000, 45);
        employees[4] = new Employee("Sergey Vitalievich Bezrukov",
                "actor", "bezr@not.com", "89270000000", 210000, 48);

// 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].empAge() > 40) {
                employees[i].outputInfo();
            }
        }
    }
}
