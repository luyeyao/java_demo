package ltd.idcu.demo.computer;

public class Computer {
    private String name;
    private int state = 0;
    private String userName;

    public Computer(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean closed(){
        if (getState() != 0){
            setState(0);
            System.out.println(getName() + "被关机");
            return true;
        }
        return false;
    }

    public boolean opened(){
        if (getState() == 0){
            setState(1);
            System.out.println(getName() + "被开机");
            return true;
        }
        return false;
    }

    public boolean used(){
        if (getState() == 1){
            setState(2);
            System.out.println(getName() + "被使用");
            return true;
        }
        return false;
    }

    public boolean isFree(){
        return getState() == 0;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
