public class employee {
    public String name;
    public int id;
    public double salary;

    public employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        employee emp1 = new employee("John Doe", 101, 55000.50);
        emp1.displayDetails();
    }
}
