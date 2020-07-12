package Step4.V2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> list = new ArrayList<>(Arrays.asList(new Topic("5","AAAA"),new Topic("1","BBBB")));
    public List<Topic> getAllTopics() {
        return list;
    }
 public Topic getTopicId(String id) {
       return list.stream().filter(s -> s.getId().equals(id)).findFirst().get();
 }
}