public class Main {
    public static void main(String[] args) {
        var totalWorkingHours = 640;
        var workingHours = 8;
        var totalNumberOfEmployees = totalWorkingHours / workingHours;
            totalNumberOfEmployees = totalNumberOfEmployees + 94;
            totalWorkingHours = totalNumberOfEmployees * workingHours;

          System.out.println("Если в компании работает " + totalNumberOfEmployees + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками.");
    }
}