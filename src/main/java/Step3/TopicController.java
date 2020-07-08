package Step3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topicservice")
    public List<Topic> list() {
        return topicService.getTop1();
    }
}