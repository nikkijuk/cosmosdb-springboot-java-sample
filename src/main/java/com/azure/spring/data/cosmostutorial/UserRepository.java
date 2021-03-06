package com.azure.spring.data.cosmostutorial;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {

  Iterable<User> findByFirstName(String firstName);

  User findByIdAndLastName(String id, String lastName);
}
