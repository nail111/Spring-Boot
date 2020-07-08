package Step1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
    @RequestMapping("/hello")
    public String SHello() {
        return "Hello";
    }
}
