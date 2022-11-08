package com.sparta.webSpring;

import com.sparta.webSpring.domain.Course;
import com.sparta.webSpring.domain.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class webSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(webSpringApplication.class, args);
    }

    // Week02Application.java 의 main 함수 아래에 붙여주세요.
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        return (args) -> {
            Course course1 = new Course("웹개발의 봄 Spring", "남병관");
            repository.save(course1);

            List<Course> courseList = repository.findAll(); //단축키 컨트롤+알트+v
            for(int i=0; i<courseList.size(); i++){
                Course c = courseList.get(i);
                System.out.println(c.getTitle());
                System.out.println(c.getTutor());
            }
        };
    }
}
