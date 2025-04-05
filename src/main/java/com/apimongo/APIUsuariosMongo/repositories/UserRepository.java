package com.apimongo.APIUsuariosMongo.repositories;

import com.apimongo.APIUsuariosMongo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
