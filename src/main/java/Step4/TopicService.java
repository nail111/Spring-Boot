package Step4;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> list1 = Arrays.asList(
      new Topic(0,"Nail"),
      new Topic(1,"Orxan"),
      new Topic(2,"Elmar")
    );
    public List<Topic> getTopic() {
        return list1;
    }
    public Topic getTopicid(int id) {
        return list1.get(id);
    }
}