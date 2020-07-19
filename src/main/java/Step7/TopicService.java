package Step7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
    public List<Topic> getAllTopics() {
       // return list;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }
    public Topic getTopicId(String id) {
       return topicRepository.findById(id).orElse(null);
    }
    public void updateTopic(String id,Topic topic) {
        topicRepository.save(topic);
    }
 public void deleteTopic(String id) {
        topicRepository.deleteById(id);
 }
}