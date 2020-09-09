package lesson1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("video")
public class Video implements File {

    @Value("tarantino")
    public String name;

    public Video(){}

    public Video(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playing() {
        System.out.println("Video is playing" + ":" + name);
    }
}
