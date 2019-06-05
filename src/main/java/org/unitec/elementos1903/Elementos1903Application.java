package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner{

    @Autowired
    RepoCliente repoCliente;
    
	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
     //repoCliente.save(new Cliente(1,"Beatriz","verobetty1@hotmail.com"));
     //repoCliente.save(new Cliente(2,"Fernanda","mariferjim@hotmail.com"));
     
     //Buscar todos
    /* for(Cliente c: repoCliente.findAll()){
        System.out.println(c);
     }*/
     
    //Buscar por Id
    //System.out.println(repoCliente.findById(2));
    
    //Borrar por Id
    //repoCliente.deleteById(1);
    
    }

}
