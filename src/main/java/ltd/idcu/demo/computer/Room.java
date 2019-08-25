package ltd.idcu.demo.computer;

public class Room {
    private Computer[] computers;

    public Room(int num) {
        computers = new Computer[num];
        for (int i = 0; i < computers.length ; i++) {
            computers[i] = new Computer((i+1) + "号机");
        }
    }

    public Computer[] getComputers(){
        return computers;
    }
}
