public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstname = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstname + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();

        System.out.println("Задание 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + fullName);
        System.out.println();

        System.out.println("Задание 3");
        firstname = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName + " " + firstname + " " + middleName;
        fullName = fullName.replace('ё','е');
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}