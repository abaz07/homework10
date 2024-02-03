public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //Задача 2
        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //Задача 3
        System.out.println("Задача 3");
        fullName = "Иванов Семён Семёнович";
        String fullName1 = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);
    }
}