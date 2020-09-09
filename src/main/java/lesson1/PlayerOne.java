package lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("player")
@Scope("prototype")
public class PlayerOne implements Player {


    private File file;

    public PlayerOne(){

    }

    public PlayerOne(File file) {
        this.file = file;
    }

    @Value("true")
    boolean existence;

    @Autowired(required = false)
    @Qualifier("file")
    public void setFile(File file) {
        this.file = file;
    }

    public void deleteFile() {
        this.existence=false;
    }

    public boolean isExists() {
        return existence;
    }

    public void turnOn() {
        System.out.println("Play");
        if(!isExists()){
            System.out.println("file does not exists");
            return;
        }
        file.playing();
    }
}
