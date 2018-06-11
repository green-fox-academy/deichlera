package hu.greenfoxacademy.springstart;

import hu.greenfoxacademy.springstart.controllers.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringstartApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
    }

    @RestController
    public class Controller {

        @ResponseBody

        @RequestMapping("/hello")
        public String hello(){
            return "Hello world!";
        }

        @RequestMapping("/greeting")
        public Greeting greeting(){
            Greeting greeting=new Greeting(1, "Hello world!");
            return greeting;
        }


    }
}
