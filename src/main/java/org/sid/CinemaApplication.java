package org.sid;

import java.util.Random;
import java.util.stream.Stream;

import org.sid.dao.CinemaRepository;
import org.sid.dao.SalleRepository;
import org.sid.entities.Cinema;
import org.sid.entities.Role;
import org.sid.entities.Salle;
import org.sid.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {
	@Autowired
private CinemaRepository cinemaRepository;
	@Autowired
private SalleRepository salleRepository;
	public static void main(String[] args){
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Cinema c =new Cinema();
		//Stream.of("Mega Rama","UTC","rinama","dinzi").forEach(name->{
				//cinemaRepository.save(new Cinema(null,name,Math.random(),Math.random(),1+ new Random().nextInt(9)));
		//	cinemaRepository.save(c);
			
			
		//});
		//salleRepository.save(new Salle(null,"a",80,c));
		
	}
	
/*	@Bean
    CommandLineRunner start(AccountService accountService){
        return args->{
           
            accountService.save(new Role(null,"ADMIN"));
            accountService.save(new Role(null,"NON ADMIN"));
        
            
            Stream.of("admin").forEach(un->{
                accountService.saveUser(un,"12@34","12@34");
            });
            accountService.addRoleToUser("Mhemdi","admin");
           
          
           
            
        };
    }*/
	  @Bean
	    BCryptPasswordEncoder getBCPE(){
	        return new BCryptPasswordEncoder();
	    }

}
