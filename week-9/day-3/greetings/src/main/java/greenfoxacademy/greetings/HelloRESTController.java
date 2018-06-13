package greenfoxacademy.greetings;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greet(@RequestParam(value = "name", required = false) String name) {
        Greeting greeting = new Greeting(1, "Hello " + name + "!!");
        greeting.getId();
        greeting.getContent();
        return greeting;
    }

}
