package hostel;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int age; // Вік студента
    private String major; // Спеціальність студента
    private int yearOfStudy; // Курс студента
    private String email; // Електронна пошта студента
    private String phoneNumber; // Номер телефону студента


    public Student(String name, int age, String major, int yearOfStudy, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.yearOfStudy = yearOfStudy;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void infoAboutStudent() {
        System.out.println("Ім'я студента " + name + "\n" +
                "Вік студента " + age + "\n" +
                "Спеціальність студента " + major + "\n" +
                "Курс студента " + yearOfStudy + "\n" +
                "Електронна пошта студента " + email + "\n" +
                "Номер телефону студента " + phoneNumber);
    }

    public Hostel getHostel(Hostel hostel) {
        System.out.println("Гуртожиток в якому проживає студент: " + hostel);
        return hostel;
    }

    public void getInfoAboutRoom(Room room, HostelFloor hostelFloor) {
        System.out.println("Номер кімнати в якій проживає студент: " + room.getRoomNumber() + "\n" +
                "Номер поверху: " + hostelFloor.getFloorNumber());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}