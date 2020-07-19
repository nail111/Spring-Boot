package Step7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }
    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }
    @GetMapping("/topics/{id}")
    public Topic getTopicId(@PathVariable String id) {
       return topicService.getTopicId(id);
    }
    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
        topicService.updateTopic(id,topic);
    }
    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}