package ma.fstt.Clustuering;

import ma.fstt.Clustuering.entities.Client;
import ma.fstt.Clustuering.reposotories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class ClusteringApplication implements CommandLineRunner {

	private ClientRepository clientRepository;


	@Autowired
	public void Application(ClientRepository clientRepository){
		this.clientRepository= clientRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClusteringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client("","test3","test","test",12,3,2,33,1444);
		Client c2 = new Client("11","test2","test2","test2",24,3,2,33,1444);
		System.out.println("******************");

	   //clientRepository.save(c1);
		 int nbrMale = clientRepository.countClientsBySex("Male");
		int nbrFemale = clientRepository.countClientsBySex("Female");
		 //System.out.println("***** le nombre des femmes est =====>"+nbrMale);

		//List<Client> list = clientRepository.findClientsBySex("Yes");

		System.out.println("***** le nombre des hommes est =====>"+nbrMale);
		System.out.println("le nombre des femmes est ====>"+nbrFemale);
		/*for(Client c : list){
			System.out.println(c.toString());
		}
		*/

	}
}
