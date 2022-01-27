package ma.fstt.Clustuering.reposotories;


import ma.fstt.Clustuering.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends MongoRepository<Client,String> {

    List<Client> findClientsBySex(String s);
    int countClientsBySex( String s);
    int countClientsBySmoker( String s);
}
