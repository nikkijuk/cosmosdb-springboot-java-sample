package com.azure.spring.data.cosmostutorial;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ReactiveUserRepository extends ReactiveCosmosRepository<User, String> {

  Flux<User> findByFirstName(String firstName);
}
