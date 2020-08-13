package com.jedis.repo;

import org.springframework.data.repository.CrudRepository;
import com.jedis.model.User;

public interface UserRepository extends CrudRepository<String, User> {
}