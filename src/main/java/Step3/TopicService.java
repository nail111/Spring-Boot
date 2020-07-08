package Step3;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
   private List<Topic> top1 = Arrays.asList(
      new Topic("Nail","Tagiyev"),
      new Topic("Orxan","Hashimov")
    );
   public List<Topic> getTop1() {
       return top1;
   }
}