package com.example;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by simonhamermesh on 3/28/16.
 */
@Transactional
public interface UserRepo extends CrudRepository<User,String> {

}
