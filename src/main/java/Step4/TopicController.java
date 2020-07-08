package Step4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topicserv")
    public List<Topic> list() {
        return topicService.getTopic();
    }
@RequestMapping("topicserv/{id}")
       public Topic getTopicid(@PathVariable int id) {
           return topicService.getTopicid(id);
           }
       }