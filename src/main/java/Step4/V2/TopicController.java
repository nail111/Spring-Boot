package Step4.V2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topic")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }
    @RequestMapping("/topic/{id}")
    public Topic getTopicId(@PathVariable String id) {
       return topicService.getTopicId(id);
    }
}