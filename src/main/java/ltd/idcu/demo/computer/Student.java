package ltd.idcu.demo.computer;

public class Student {
    private String name;

    public Student(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void openComputer(Computer computer){
        if (computer.opened()){
            computer.setUserName(getName());
        }
    }

    public void useComputer(Computer computer){
        computer.used();
    }

    public void closeComputer(Computer computer){
        if (computer.closed()){
            computer.setUserName(null);
        }

    }

    public void openAndUseComputer(Computer computer){
        openComputer(computer);
        useComputer(computer);
    }

    public void intoRoom(Room room){
        for (int i = 0; i < room.getComputers().length; i++) {
            if (room.getComputers()[i].isFree()){
                openAndUseComputer(room.getComputers()[i]);
                break;
            }
        }
    }

    public void outRoom(Room room){
        for (int i = 0; i < room.getComputers().length; i++) {
            if (room.getComputers()[i].getUserName() == getName()){
                closeComputer(room.getComputers()[i]);
            }
        }
    }
}
