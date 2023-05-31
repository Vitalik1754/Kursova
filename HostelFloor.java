package hostel;


import java.util.ArrayList;
import java.util.List;

public class HostelFloor extends Room{

    private int floorNumber;
    private int quantityBath;
    private int quantityRooms;
    private double length;
    private double width;
    private double height;
    private List<String> rooms;

    public HostelFloor(String roomForStudents, String kitchen, String bath, int capacity, int roomNumber, List<Student> studentsInRoom, int floorNumber, int quantityBath, int quantityRooms, double length, double width, double height, List<String> rooms) {
        super(roomForStudents, kitchen, bath, capacity, roomNumber, studentsInRoom);
        this.floorNumber = floorNumber;
        this.quantityBath = quantityBath;
        this.quantityRooms = quantityRooms;
        this.length = length;
        this.width = width;
        this.height = height;
        this.rooms = rooms;
    }

    public HostelFloor(int roomNumber, int floorNumber) {
        super(roomNumber);
        this.floorNumber = floorNumber;
    }

    public int floorNum(){
        System.out.println("Номер поверху: " + floorNumber);
        return floorNumber;
    }

    public void addRooms(){
        rooms.add(super.getRoomForStudents());
        rooms.add(super.getKitchen());
        rooms.add(super.getBath());

        System.out.println("Список кімнат сформовано.");
    }

    public int getCountRooms(){
        System.out.println("Кількість кімнат на поверсі: " + quantityRooms);
        return quantityRooms;
    }

    public void showRooms(){
        System.out.println("Список кімнат:");
        for (String r: rooms){
            System.out.println("- " + r + ";");
        }
    }

    public void getCountBath(){
        System.out.println("Кількість ванн на поверсі: " + quantityBath);
    }

    public double square(){
        return length*width*height;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getQuantityBath() {
        return quantityBath;
    }

    public void setQuantityBath(int quantityBath) {
        this.quantityBath = quantityBath;
    }

    public int getQuantityRooms() {
        return quantityRooms;
    }

    public void setQuantityRooms(int quantityRooms) {
        this.quantityRooms = quantityRooms;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }
}
