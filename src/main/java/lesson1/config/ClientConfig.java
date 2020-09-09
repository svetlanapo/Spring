package lesson1.config;

import lesson1.Player;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Player player = context.getBean("player", Player.class);
        player.turnOn();
        player.deleteFile();
        Player playerNew = context.getBean("player", Player.class);
        playerNew.turnOn();
    }
    }

