package ltd.idcu.demo;

import ltd.idcu.demo.computer.Room;
import ltd.idcu.demo.computer.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Room room = new Room(10);
        Student student = new Student("小明");
        student.intoRoom(room);
        student.outRoom(room);
        System.exit(-1);
    }

}
