public class lesson_5 {
    public static void main(String[] args) {
        Employee[] empMan = new Employee[5];
        empMan[0] = new Employee("Pushkin Kolya", "Director","892312312",35000,45);
        empMan[1] = new Employee("Smirnov Aleksey", "Assistant","892312314",25000,24);
        empMan[2] = new Employee("Makarov Sergey", "Consultant","892312315",10000,42);
        empMan[3] = new Employee("Lubina Lubov'", "PR manager","892312316",15000,19);
        empMan[4] = new Employee("Prohorov Danya", "Deputy Director","892312317",30000,25);
        for (Employee employee : empMan)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-" +position+ "\n-" +phone+ "\n-" +salary+ "\n-" +age);
    }
}


