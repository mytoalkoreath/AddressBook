package SpringApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
public class AccessingDataJpaApplication {
//
//    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(AccessingDataJpaApplication.class);
//    }
//
//    @Bean
//    public CommandLineRunner demo( SpringApp.AddressRepo repository) {
//        return (args) -> {
//            // save a few BuddyInfos
//            AddressBook a = new AddressBook();
//            AddressBook b = new AddressBook();
//            a.addBuddy(new SpringApp.BuddyInfo("Jack", "1234"));
//            a.addBuddy(new SpringApp.BuddyInfo("Chloe", "1111"));
//            b.addBuddy(new SpringApp.BuddyInfo("Kim", "1111"));
//            b.addBuddy(new SpringApp.BuddyInfo("David", "1111"));
//            b.addBuddy(new SpringApp.BuddyInfo("Michelle", "1111"));
//            repository.save(a);
//            repository.save(b);
//
//            // fetch all BuddyInfos
//            log.info("BuddyInfos found with findAll():");
//            log.info("-------------------------------");
//            for (AddressBook h : repository.findAll()) {
//                log.info(h.toString());
//            }
//            log.info("");
//
//            // fetch an individual BuddyInfo by ID
//            AddressBook k = repository.findById(1L);
//            log.info("AddressBook found with findById(1L):");
//            log.info("--------------------------------");
//            log.info(k.toString());
//            log.info("");
//
//            // fetch BuddyInfos by last name
//            //log.info("BuddyInfo found with findByName('Name'):");
//           // log.info("--------------------------------------------");
//            //repository.findByName("Jack").forEach(Jack -> {
//            //    log.info(Jack.toString());
//            //});
//            // for (BuddyInfo bauer : repository.findByLastName("Bauer")) {
//            //  log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//    }

}
