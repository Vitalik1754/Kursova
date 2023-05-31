package hostel;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String roomForStudents;
    private String kitchen;
    private String bath;
    private int capacity;
    private int roomNumber;
    private boolean isOccupied;
    private List<Student> studentsInRoom;

    public Room(String roomForStudents, String kitchen, String bath, int capacity, int roomNumber, List<Student> studentsInRoom) {
        this.roomForStudents = roomForStudents;
        this.kitchen = kitchen;
        this.bath = bath;
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.studentsInRoom = studentsInRoom;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void infoAboutRoom(){
        System.out.println("Вмістимість кімнати: " + capacity + " особи");
    }

    public void addStudentInRoom(Student student) {
        if (studentsInRoom.contains(student)){
            System.out.println("Кімната зайнята, вільних місць не має!");
            isOccupied = true;

        } else if (studentsInRoom.isEmpty()){
            System.out.println("В кімнаті є вільні місця.");
            studentsInRoom.add(student);
            isOccupied = false;
        }
    }

    public void removeStudentFromRoom(Student student){
        if (student.getYearOfStudy() > 4){
            System.out.println("Студент завершив навчання, час зїжджати!");
            studentsInRoom.remove(student);
        } else if (student.getYearOfStudy() <= 4){
            System.out.println("Ще можна проживати у гуртожитку " + (4 - student.getYearOfStudy()) + " р.");
        }

    }

    public String getRoomForStudents() {
        return roomForStudents;
    }

    public void setRoomForStudents(String roomForStudents) {
        this.roomForStudents = roomForStudents;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBath() {
        return bath;
    }

    public void setBath(String bath) {
        this.bath = bath;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public List<Student> getStudentsInRoom() {
        return studentsInRoom;
    }

    public void setStudentsInRoom(List<Student> studentsInRoom) {
        this.studentsInRoom = studentsInRoom;
    }
}
