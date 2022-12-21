public class Main {

    public static void main(String[] args) {
        Employee[] base = new Employee[10];
        base[0] = new Employee("Иванова Агата Тимофеевна   ", 2, 15000);
        base[1] = new Employee("Майоров Олег Демидович     ", 2, 22000);
        base[2] = new Employee("Тимофеева Евгения Ильинична", 1, 18000);
        base[3] = new Employee("Котова Малика Михайловна   ", 4, 25000);
        base[4] = new Employee("Борисов Тимофей Миронович  ", 5, 20000);
        base[5] = new Employee("Андрианов Семён Максимович ", 2, 19000);
        base[6] = new Employee("Пименова Милана Тимофеевна ", 3, 28000);
        base[7] = new Employee("Блинов Ян Артёмович        ", 4, 15000);
        base[8] = new Employee("Левин Матвей Тимурович     ", 1, 23000);
        base[9] = new Employee("Ракова Софья Максимовна    ", 1, 21000);



        fullListEmployee(base);//1. Получить список всех сотрудников.

        totalSalary(base);//2. Посчитать сумму затрат на зарплаты.

        System.out.println(minSalary(base));//3.Найти сотрудника с минимальной заплатой

        System.out.println(maxSalary(base));//4/Найти сотрудника с максимальной зарплатой.

        int i = totalSalary(base)/ base.length; //5. Подсчитать среднее значение зарплат.
        System.out.println(i);

        listEmployee(base);//Получить Ф. И. О. всех сотрудников (вывести в консоль).


        System.out.println( "=======Повышенная сложность========\n");

        salaryIndexation(base, 10);//  1. Проиндексировать зарплату


        Employee[] oneDep = baseOneDep(base, 1);// Получение массива Employee[] с сотрудниками указанного отдела


        System.out.println("\nМинимальна ЗП "+minSalary(oneDep));
        System.out.println("\nМаксимальная ЗП "+ maxSalary(oneDep));
        System.out.println("\nЗП отдела "+totalSalary(oneDep));
        System.out.println("\nСредняя ЗП "+ totalSalary(oneDep)/ oneDep.length);
        salaryIndexation(oneDep, 10);
        for (int j = 0; j < oneDep.length; j++) {
            System.out.println(oneDep[j].getId()+" "+oneDep[j].getFullName()+" "+oneDep[j].getSalary());
        }
        sortedLowSalary(base, 23000);

        sortedHighSalary(base,23000 );


    }

    public static Employee[] baseOneDep(Employee[] base, int dep) {
        int k = 0;
        for (int i = 0; i < base.length; i++) {
            if (base[i].getDepartment() == 1){
                k++;
            }
        }
        Employee[] oneDep= new Employee[k];
        int h = 0;
        for (int j = 0; j < base.length ;j++ ) {
            if (base[j].getDepartment()  == dep) {
                oneDep[h] = new Employee(base[j].getFullName(), dep, base[j].getSalary());
                oneDep[h].setId(h);
                h++;
            }
        }
    return  oneDep;}



    public static void fullListEmployee(Employee[] base) {
        for (int i = 0; i < 10; i++) {
            String str = base[i].toString();
            System.out.println(str);
        }
    }
    public static int totalSalary(Employee[] base) {
     int salary = 0;
        for (int i = 0; i < base.length; i++) {
            salary += base[i].getSalary();
        }
            return salary;
    }


    public static int minSalary(Employee[] base) {

        int minSalary = base[0].getSalary();
        int id = 0;

        for (int i = 0; i < base.length; i++) {
            int actual = base[i].getSalary();
            if (actual <= minSalary) {
                minSalary = actual;
                id = i;
            }
        }
        return base[id].getSalary();

    }


    public static int maxSalary(Employee[] base) {

        int id = 0;
        int max = 0;
        for (int i = 0; i < base.length; i++) {
            int actual = base[i].getSalary();
            if (actual > max) {
                id = i;
                max = actual;

            }
        }
        return base[id].getSalary();
    }
    public static void listEmployee(Employee[] base) {

        for (int i = 0; i < 10; i++) {
            String str = base[i].getFullName();
            System.out.println(str);

        }
    }

    public static void salaryIndexation(Employee[]base, int  indx) {
        for (int i = 0; i < base.length ; i++) {
            int salary = base[i].getSalary() + base[i].getSalary() * indx / 100;


        }
    }

    public static void sortedLowSalary(Employee[] base, int dividing) {
        System.out.println("\nСотрудники с ЗП ниже "+dividing);
        for (int i = 0; i < base.length; i++) {
            if (base[i].getSalary()<=dividing) {
                System.out.println(base[i].getId()+" "+ base[i].getFullName()+" "+base[i].getSalary());
            }
        }
    }

    public static void sortedHighSalary(Employee[] base, int dividing) {
        System.out.println("\nСотрудники с ЗП выше "+dividing);
        for (int i = 0; i < base.length; i++) {
            if (base[i].getSalary()>dividing) {
                System.out.println(base[i].getId()+" "+ base[i].getFullName()+" "+base[i].getSalary());
            }
        }

    }

}