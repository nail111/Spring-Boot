package Step6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> list = new ArrayList<>(Arrays.asList(new Topic("0","nail"),new Topic("99","AAAA")));
    public List<Topic> getAllTopics() {
        return list;
    }
    public Topic getTopicId(String id) {
        return list.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topic topic) {
        list.add(topic);
    }
    public void updateTopic(String id,Topic topic) {
      for(int i=0;i<list.size();i++) {
          Topic t = list.get(i);
          if(t.getId().equals(id)) {
              list.get(i).setName(topic.getName());
              list.get(i).setId(topic.getId());
          }
      }
    }
    public void deleteTopic(String id) {
       for(int i=0;i<list.size();i++) {
           Topic t = list.get(i);
           if(t.getId().equals(id)) {
               list.remove(t);
           }
       }
    }
}