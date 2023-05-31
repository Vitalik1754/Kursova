package hostel;

import java.util.Scanner;

public class HostelEmployee{
    private String position; // Посада працівника
    private String phone1;
    private String phone2;
    private String phone3;
    private Room room1;
    private Room room2;
    private Room room3;
    private HostelFloor hostelFloor1;
    private HostelFloor hostelFloor2;
    private HostelFloor hostelFloor3;

    public HostelEmployee(String phone1, String phone2, String phone3, Room room1, Room room2, Room room3, HostelFloor hostelFloor1, HostelFloor hostelFloor2, HostelFloor hostelFloor3) {
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.room1 = room1;
        this.room2 = room2;
        this.room3 = room3;
        this.hostelFloor1 = hostelFloor1;
        this.hostelFloor2 = hostelFloor2;
        this.hostelFloor3 = hostelFloor3;
    }

    public void searchEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Кого вам потрібно знайти? (Комендант/Вахтер/Прибиральник)");
        position = sc.nextLine();
        if (position.equals("Комендант")){
            System.out.println("Комендант перебуває у кімнаті #" + room1.getRoomNumber() + " на " + hostelFloor1.getFloorNumber() + " поверсі");
            System.out.println("Або просто зателефонуйте за номером " + phone1);
        } else if (position.equals("Вахтер")) {
            System.out.println("Вахтер перебуває у кімнаті #" + room2.getRoomNumber() + " на " + hostelFloor2.getFloorNumber() + " поверсі");
            System.out.println("Або просто зателефонуйте за номером " + phone2);
        } else if (position.equals("Прибиральник")){
            System.out.println("Прибиральник перебуває у кімнаті #" + room3.getRoomNumber() + " на " + hostelFloor3.getFloorNumber() + " поверсі");
            System.out.println("Або просто зателефонуйте за номером " + phone3);
        }

    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getPhone3() {
        return phone3;
    }

}
