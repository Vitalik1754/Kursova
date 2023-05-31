package hostel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Hostel{
    public static void main(String[] args) {
        Room room = new Room("Кімнати для студентів", "Кухня", "Ванна кімната",4,10,new ArrayList<>());
        HostelFloor hostelFloor1 = new HostelFloor("Кімнати для студентів", "Кухня", "Ванна кімната",1,10, new ArrayList<>(), 1, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>());
        HostelFloor hostelFloor2 = new HostelFloor("Кімнати для студентів", "Кухня", "Ванна кімната",2,20, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>());
        HostelFloor hostelFloor3 = new HostelFloor("Кімнати для студентів", "Кухня", "Ванна кімната",3,30, new ArrayList<>(), 3, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>());

        System.out.println("Інформація про кімнати і поверхи");
        room.addStudentInRoom(new Student("Віталій", 19, "Комп'ютерні науки", 2, "vitaliy@gmail.com", "+380685432121"));
        room.removeStudentFromRoom(new Student("Віталій", 19, "Комп'ютерні науки", 2, "vitaliy@gmail.com", "+380685432121"));
        room.infoAboutRoom();
        System.out.println("-----------------------------------------------------------------------------------------");
        hostelFloor1.floorNum();
        hostelFloor1.addRooms();
        hostelFloor1.getCountRooms();
        hostelFloor1.showRooms();
        hostelFloor1.getCountBath();
        System.out.println("Площа поверху: " + hostelFloor1.square());
        System.out.println();
        hostelFloor2.floorNum();
        hostelFloor2.addRooms();
        hostelFloor2.getCountRooms();
        hostelFloor2.showRooms();
        hostelFloor2.getCountBath();
        System.out.println("Площа поверху: " + hostelFloor2.square());
        System.out.println();
        hostelFloor3.floorNum();
        hostelFloor3.addRooms();
        hostelFloor3.getCountRooms();
        hostelFloor3.showRooms();
        hostelFloor3.getCountBath();
        System.out.println("Площа поверху: " + hostelFloor3.square());
        System.out.println("-----------------------------------------------------------------------------------------");
        Scanner scannerMain = new Scanner(System.in);
        System.out.println("Введіть, щоб ви хотіли отримати (Інформація про студента/ Подати заяву на проживання/ Знайти працівника)");
        String choice = scannerMain.nextLine();
        if (choice.equals("Інформація про студента")){
            Student student1 = new Student("Віталій Носаль", 19, "Комп'ютерні науки", 2, "vitaliy@gmail.com", "+380676532121");
            Student student2 = new Student("Степан Заблоцький", 17, "Комп'ютерні науки", 1, "step@gmail.com", "+380685432121");
            Student student3 = new Student("Роман Сачала", 21, "Кібербезпека", 4, "sachala@gmail.com", "+380690763213");
            Student student4 = new Student("Віктор Столяр", 18, "Комп'ютерна інженерія", 2, "stolyar@gmail.com", "+380690001231");
            Student student5 = new Student("Іван Смук", 20, "Комп'ютерні науки", 3, "vanya@gmail.com", "+380985430021");
            Student student6 = new Student("Андрій Рак", 21, "Кібербезпека", 3, "rak@gmail.com", "+380685936721");
            Student student7 = new Student("Василь Качмар", 18, "Комп'ютерна інженерія", 1, "kachmar@gmail.com", "+380675433333");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Чи не хотіли б ви дізнатися інформацію про студентів? Так/Ні");
            String confirm = scanner.nextLine();
            if (confirm.equals("Так")) {
                for (int i = 0; i < 7; i++) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введіть ім'я і прізвища студента про якого хочете дізнатися інформацію");
                    String student = sc.nextLine();
                    if (student.equals("Віталій Носаль")) {
                        student1.infoAboutStudent();
                        student1.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 1, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 10, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    } else if (student.equals("Степан Заблоцький")) {
                        student2.infoAboutStudent();
                        student2.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 5, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 5, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    } else if (student.equals("Роман Сачала")) {
                        student3.infoAboutStudent();
                        student3.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 4, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 4, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    } else if (student.equals("Віктор Столяр")) {
                        student4.infoAboutStudent();
                        student4.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 9, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 9, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    } else if (student.equals("Іван Смук")) {
                        student5.infoAboutStudent();
                        student5.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 10, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 10, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    } else if (student.equals("Андрій Рак")) {
                        student6.infoAboutStudent();
                        student6.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 7, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 7, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    } else if (student.equals("Василь Качмар")) {
                        student7.infoAboutStudent();
                        student7.getInfoAboutRoom(new Room("Кімнати для студентів", "Кухня", "Ванна кімната", 4, 10, new ArrayList<>()), new HostelFloor("Кімната для студентів", "Кухня", "Ванна кімната", 4, 10, new ArrayList<>(), 2, 2, 10, 20.0, 10.5, 2.5, new ArrayList<>()));
                    }
                }
            } else if (confirm.equals("Ні")) {
                System.out.println("Гарного дня!");
            }
        } else if (choice.equals("Подати заяву на проживання")) {
            ApplicationForResidence application = new ApplicationForResidence(new Student("Віталій Носаль", 19, "Комп'ютерні науки", 2, "vitaliy@gmail.com", "+380676532121"), LocalDate.now(), 4);
            application.newApplication();

        } else if(choice.equals("Знайти працівника")) {
            HostelEmployee employee = new HostelEmployee("380986533261", "380986434212", "3806754321781",new Room(5), new Room(1), new Room(2), new HostelFloor(5,1), new HostelFloor(1,1), new HostelFloor(2,1));
            employee.searchEmployee();
        }


    }

}
