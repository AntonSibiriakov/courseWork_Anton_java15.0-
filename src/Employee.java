public class Employee {
    public static int keyCounter;// 2. переменная счетчик
    private int id = keyCounter;
    private String fullName;

    private int department;
    private int salary;

    Employee(String fullName, int department, int salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = keyCounter++;// инкремент счетчика
    }
    public int getId(){
        return id;
    }
    public void setId (int id) {
        this.id = id;

    }
    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public  int getDepartment(){
        return department;
    }
    public int getSalary(){
        return  salary;
    }

    public String toString() {


        return id+" "+fullName+"  "+department+" "+salary;
    }


    public void setDepartmentSalary(int department, int salary) {
        this.department = department;
        this.salary = salary;
    }


}
