package com.demo.customer.repository;
import java.util.Optional;

//package com.darden.demo.repository;
//
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.customer.model.CustomerDocument;

@Repository
public interface DemoCustomerRepository extends JpaRepository<CustomerDocument, String> {

	Optional<CustomerDocument> findByEmail(String email);

}
