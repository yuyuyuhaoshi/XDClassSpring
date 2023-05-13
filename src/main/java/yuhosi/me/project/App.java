package yuhosi.me.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yuhosi.me.project.domain.Video;
import yuhosi.me.project.domain.VideoOrder;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Video video = (Video) applicationContext.getBean("video");
        System.out.println(video);

        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
        System.out.println(videoOrder.getTrade_number());
        System.out.println(videoOrder.getVideo().getName());
    }
}
