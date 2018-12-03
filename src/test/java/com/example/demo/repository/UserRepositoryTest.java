package com.example.demo.repository;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void saveTest() throws Exception {
		User user = new User();
		user.setName("Will");
		user.setAge(20);
		User result = userRepository.save(user);
//		log.info(result.toString());
		Assert.assertNotNull(user.getId());
	}

	@Test
	public void findOneTest() throws Exception {
		Optional<User> user = userRepository.findById(1l);
//		log.info(user.toString());
		Assert.assertNotNull(user);
		Assert.assertTrue(1l == user.get().getId());
	}
}
