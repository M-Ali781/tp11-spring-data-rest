package ma.rest.spring;

import ma.rest.spring.entities.Client;
import ma.rest.spring.entities.Compte;
import ma.rest.spring.entities.TypeCompte;
import ma.rest.spring.repositories.ClientRepository;
import ma.rest.spring.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class MsBanqueApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsBanqueApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository,
                            ClientRepository clientRepository,
                            RepositoryRestConfiguration restConfiguration) {
        return args -> {
            // Exposer les IDs dans les reponses JSON
            restConfiguration.exposeIdsFor(Compte.class, Client.class);

            // Initialisation des clients
            Client c1 = clientRepository.save(new Client(null, "Amal", "amal@gmail.com"));
            Client c2 = clientRepository.save(new Client(null, "Ali", "ali@gmail.com"));

            // Initialisation des comptes lies aux clients
            compteRepository.save(new Compte(null, Math.round(Math.random() * 9000 * 100.0) / 100.0, new Date(), TypeCompte.EPARGNE, c1));
            compteRepository.save(new Compte(null, Math.round(Math.random() * 9000 * 100.0) / 100.0, new Date(), TypeCompte.COURANT, c1));
            compteRepository.save(new Compte(null, Math.round(Math.random() * 9000 * 100.0) / 100.0, new Date(), TypeCompte.EPARGNE, c2));
            compteRepository.save(new Compte(null, Math.round(Math.random() * 9000 * 100.0) / 100.0, new Date(), TypeCompte.COURANT, c2));

            System.out.println("=== Liste des comptes initialises ===");
            compteRepository.findAll().forEach(c -> {
                System.out.println("ID: " + c.getId() + " | Solde: " + c.getSolde() + " | Type: " + c.getType() + " | Client: " + (c.getClient() != null ? c.getClient().getNom() : "N/A"));
            });
        };
    }
}
