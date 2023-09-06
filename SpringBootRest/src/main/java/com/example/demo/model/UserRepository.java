
package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	public User findByUsernameAndPassword(String uname,String password);
	//Select * from users where username=? ad password=?

}