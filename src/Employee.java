public class Employee {
    public static int keyCounter;// 2. переменная счетчик
    private int id = keyCounter;// 3.
    private String fullName;

    private int department;
    private int salary;

    Employee(String fullName, int department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        keyCounter++;// инкремент счетчика
    }
    public int getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public  int getDepartment(){
        return department;
    }
    public int getSalary(){
        return  salary;
    }

    public String toString() {
        String a = id+" "+fullName+"  "+department+" "+salary;

        return a;
    }


    public void setDepartmentSalary(int department, int salary) {
        this.department = department;
        this.salary = salary;
    }


}
