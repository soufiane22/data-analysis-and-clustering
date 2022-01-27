package ma.fstt.Clustuering.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.fstt.Clustuering.entities.Client;
import ma.fstt.Clustuering.reposotories.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

import static java.lang.Boolean.TRUE;
import static org.springframework.data.domain.PageRequest.of;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ClientServiceImpl  implements ClientService{

    private final ClientRepository clientRepository;
    @Override
    public Client save(Client client) {
        log.info("saving client:{}",client.get_id());
        return clientRepository.save(client);
    }

    @Override
    public Collection<Client> list(int limit) {
        log.info("fetching all client ");

        return  clientRepository.findAll(of(0,limit)).toList();
    }

    @Override
    public List<Client> getALL() {

        return null;
    }

    @Override
    public Client get(String id) {
        log.info("fetching client by id: {} ",id);
        return clientRepository.findById(id).get();
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public Boolean delete(String id) {
        log.info("delete client by id: {} ",id);
         clientRepository.deleteById(id);
         return TRUE;
    }

   /* public List getGender(){
        Map<String, Integer> gender = new HashMap<String, Integer>();

    }

    */
}
