package greenfoxacademy.greetings;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    Greeting greeting = new Greeting(1,"Hello world!!");

    @RequestMapping("/greeting")
    public Greeting greet(){
        greeting.getId();
        greeting.getContent();
        return greeting;
    }

}
