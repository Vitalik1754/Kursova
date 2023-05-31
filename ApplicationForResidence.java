package hostel;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationForResidence extends HostelRules{

    private String pib;
    private String newMayor;
    private int year;
    private long phone;
    private int newDuration;
    private Student exampleStudent;
    private LocalDate dataApplication;
    private int duration;

    public ApplicationForResidence(Student exampleStudent, LocalDate dataApplication, int duration) {
        this.exampleStudent = exampleStudent;
        this.dataApplication = dataApplication;
        this.duration = duration;
    }

    public void exampleApplication(){
        System.out.println("Приклад заявки на проживання в гуртожитку");
        System.out.println("Ім'я та прізвище " + exampleStudent.getName() + "." + "\n" +
                "Спеціальність " + exampleStudent.getMajor() + "." + "\n" +
                "Рік навчання " + exampleStudent.getYearOfStudy() + "." + "\n" +
                "Номер телефону " + exampleStudent.getPhoneNumber() + "." + "\n" +
                "Термін угоди " + duration);

    }

    public void showNewApplication(){
        System.out.println("Ваша заява: ");
        System.out.println("Ім'я та прізвище " + pib + "." + "\n" +
                "Спеціальність " + newMayor + "." + "\n" +
                "Рік навчання " + year + "." + "\n" +
                "Номер телефону " + phone + "." + "\n" +
                "Термін угоди " + newDuration);

    }

    public void newApplication() {
        showRules();
        System.out.println("Погоджуєтеся з правилами гуртожитка? Погоджуюсь/ Не погоджуюсь");
        Scanner s = new Scanner(System.in);
        String rules = s.nextLine();
        if (rules.equals("Погоджуюсь")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Бажаєте заповнити заяву? Так/Ні");
            String confirm = scanner.nextLine();
            if (confirm.equals("Так")) {
                Scanner scanner1 = new Scanner(System.in);
                exampleApplication();
                System.out.println("Введіть ім'я та прізвище");
                pib = scanner1.nextLine();
                System.out.println("Введіть cпеціальність");
                newMayor = scanner1.nextLine();
                System.out.println("Введіть рік навчання");
                year = scanner1.nextInt();
                System.out.println("Введіть номер телефону");
                phone = scanner1.nextLong();
                System.out.println("Введіть бажаний термін угоди");
                newDuration = scanner1.nextInt();
                showNewApplication();
                Scanner sc = new Scanner(System.in);
                System.out.println("Підтвердіть дані(+/-)");
                String c = sc.nextLine();
                if (c.equals("+")) {
                    System.out.println("Дякуємо! Ваша заява прийнята на опрацювання");
                } else if (c.equals("-")) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Введіть дані знову");
                    exampleApplication();
                    System.out.println("Введіть ім'я та прізвище");
                    pib = scanner2.nextLine();
                    System.out.println("Введіть cпеціальність");
                    newMayor = scanner2.nextLine();
                    System.out.println("Введіть рік навчання");
                    year = scanner2.nextInt();
                    System.out.println("Введіть номер телефону");
                    phone = scanner2.nextLong();
                    System.out.println("Введіть бажаний термін угоди");
                    newDuration = scanner2.nextInt();
                    showNewApplication();
                }

            } else if (confirm.equals("Ні")) {
                System.out.println("Гарного дня!");
            }

        } else if(rules.equals("Не погоджуюсь")){
            System.out.println("Гарного дня!");
        }
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getNewMayor() {
        return newMayor;
    }

    public void setNewMayor(String newMayor) {
        this.newMayor = newMayor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public int getNewDuration() {
        return newDuration;
    }

    public void setNewDuration(int newDuration) {
        this.newDuration = newDuration;
    }

    public Student getExampleStudent() {
        return exampleStudent;
    }

    public void setExampleStudent(Student exampleStudent) {
        this.exampleStudent = exampleStudent;
    }

    public LocalDate getDataApplication() {
        return dataApplication;
    }

    public void setDataApplication(LocalDate dataApplication) {
        this.dataApplication = dataApplication;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
