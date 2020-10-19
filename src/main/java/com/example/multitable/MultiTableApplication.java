package com.example.multitable;

//import com.example.multitable.service.user.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiTableApplication {
//    @Autowired
//    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(MultiTableApplication.class, args);
    }

//    public MultiTableApplication (UserService userService){
//        this.userService = userService;
//    }
//
//    @Override
//    @SuppressWarnings("squid:S106")
//    public void run(String... args) throws Exception {
//        System.out.println(new ObjectMapper().writeValueAsString(this.userService.findAll()));
////        System.out.println(this.userService.getUserWithAccount(1L));
////        System.out.println(this.userService.getUserWithCompany(1L));
//    }
}
