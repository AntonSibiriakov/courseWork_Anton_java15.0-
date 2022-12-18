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


        table();
        fullListEmployee(base);//1. Получить список всех сотрудников.

        totalSalary(base);//2. Посчитать сумму затрат на зарплаты.

        table();
        System.out.println(minSalary(base));//3.Найти сотрудника с минимальной заплатой

        System.out.println(maxSalary(base));//4/Найти сотрудника с максимальной зарплатой.

        int i = totalSalary(base)/ base.length; //5. Подсчитать среднее значение зарплат.
        System.out.println(i);

        listEmployee(base);//Получить Ф. И. О. всех сотрудников (вывести в консоль).
    }

    public static void table() {
        System.out.println("id        Ф.И.О                Отдел Зарплата ");
    }

    public static void fullListEmployee(Employee[] base) {//Цикл проходит по гетерам всех имен и печатает

        for (int i = 0; i < 10; i++) {
            String str = base[i].toString();
            System.out.println(str);
        }
    }
    public static int totalSalary(Employee[] base) {//Цикл проходит по гетерам всех зарплат и складывает
     int salary = 0;
        for (int i = 0; i < base.length; i++) {
            salary += base[i].getSalary();
        }
            return salary;
    }
    public static String minSalary(Employee[] base) {//Сотрудник с мин ЗП
        int min = base[0].getSalary();
        int id = 0;
        for (int i = 0; i < base.length; i++) {
            int aktual = base[i].getSalary();
            if (aktual < min) {
                min= aktual;
                id = i;
            }
        }
        return base[id].toString();
    }
    public static String maxSalary(Employee[] base) {
        int id = 0;
        int maxSalary = 0;
        for (int i = 0; i < base.length; i++) {
            int aktual = base[i].getSalary();
            if (aktual > maxSalary) {
                maxSalary=aktual;
                id = i;
            }
        }
        return base[id].toString();
    }
    public static void listEmployee(Employee[] base) {//Цикл проходит по гетерам всех имен и печатает

        for (int i = 0; i < 10; i++) {
            String str = base[i].getFullName();
            System.out.println(str);

        }
    }

}