package com.example.restfulservices.bootstrap;

import com.example.restfulservices.domain.Customer;
import com.example.restfulservices.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer c1 = new Customer();
        c1.setFirstName("Michael");
        c1.setLastName("Jordan");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Jasmine");
        c2.setLastName("Edwards");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Aaamy");
        c3.setLastName("Winehouse");
        customerRepository.save(c3);

        System.out.println("Customers saved: " + customerRepository.count());


    }
}
