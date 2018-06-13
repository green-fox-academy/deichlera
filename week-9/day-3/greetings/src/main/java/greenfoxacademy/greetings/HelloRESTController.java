package greenfoxacademy.greetings;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {


    AtomicLong id = new AtomicLong(0);
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greet(@RequestParam(value = "name", required = false) String name) {
        Greeting greeting = new Greeting(id, "Hello " + name + "!!");
        greeting.add();
        greeting.getId();
        greeting.getContent();
        return greeting;
    }

}
