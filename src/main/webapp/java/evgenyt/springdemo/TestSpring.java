package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean creation with annotations
 */

public class TestSpring {
    public static void main(String[] args) {
        // In xml file component-scan tag filled with package to search bean classes
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        // RockMusic class is marked as @Component and been rockMusic created by Spring
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
