package Step5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> list = new ArrayList<Topic>(Arrays.asList(new Topic("0","Nail")));
    public List<Topic> getAllTopics() {
        return list;
    }
public void addTopic(Topic topic) {
        list.add(topic);
}
}