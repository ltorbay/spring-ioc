package lto.example.jpa.springioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringIocApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	void testUpdatingUser() {
		final UserEntity user = userRepository.getOne(1);
		Assertions.assertNotNull(user.get);
	}
}
