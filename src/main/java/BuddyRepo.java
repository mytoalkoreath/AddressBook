import SpringApp.BuddyInfo;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface BuddyRepo extends CrudRepository<BuddyInfo, Long> {

    List<SpringApp.BuddyRepo> findByName(String Name);
    BuddyInfo findById(long id);
}