package App.back.ac.LiveStatus;

import org.springframework.data.repository.CrudRepository;

public interface AcStatusMongoDAO extends CrudRepository<AcStatusMongoModel , AcStatusMongoModelKey> {

}
