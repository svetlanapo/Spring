package lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("file")
public class Music implements File{
    @Value("beethoven")
    public String name;

    public Music() {
    }

    public Music(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playing() {
        System.out.println("Music is playing" + ": " + this.name);
    }

}



