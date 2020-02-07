import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface AddressRepo extends CrudRepository<AddressBook, Long> {


    AddressBook findById(long id);
}
