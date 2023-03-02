package com.galacticat.galacticat;

import com.galacticat.galacticat.service.CatstronauteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GalacticatApplication {

    @Autowired
    CatstronauteDAO dao;
    public static void main(String[] args) {
        SpringApplication.run(GalacticatApplication.class, args);
    }

    //@Override
    //public void run(String... args) throws Exception {
        //Catstronaute catstronaute = new Catstronaute("Habitant 0", 123, "Sergent", "www.img.com");
        //Catstronaute savedContact = dao.save(catstronaute);
        //System.out.println(savedContact);
    //}
}
