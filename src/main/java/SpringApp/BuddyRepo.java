package SpringApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "buddies", path = "buddies")
public interface BuddyRepo extends PagingAndSortingRepository<BuddyInfo, Long> {

    BuddyInfo findByName(String Name);
    BuddyInfo findById(long id);
}