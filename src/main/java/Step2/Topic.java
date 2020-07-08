package Step2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Topic {
    @RequestMapping("/topic")
    public List<HaveTopics> TT() {
        return Arrays.asList(
                new HaveTopics("Nail","Tagiyev"),
                new HaveTopics("Orxan","Hashimov")
        );
    }
}
