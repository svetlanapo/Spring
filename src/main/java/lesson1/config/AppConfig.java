
package lesson1.config;

import lesson1.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("lesson1")
public class AppConfig {
    @Bean(name = "player")
    public Player player(File file) {
        return new PlayerOne(file);
    }

/****************************************/
  /*  @Bean(name="video")
    public File file() {
        return new Video() ;
    }*/

 /*   @Bean(name="player")
    public Player player(File file){
        Player player = new PlayerOne();
        player.setFile(file);
        return player;
    }*/

  /*@Bean(name="video")
    public File file(String name) {
        File file = new Video(name);
        return file;
    }*/
}


