package lto.example.jpa.springioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
@ActiveProfiles("test-h2")
class H2DatabaseTests {

    @Resource
    private UserRepository userRepository;

    @Resource
    private DataSource dataSource;

    @Test
    void testGetUser() {
        final User user = userRepository.findById(1).orElseThrow(AssertionFailedError::new);
        Assertions.assertEquals("ltorbay", user.getUsername());
    }

    @Test
    void validateDbUrl() throws Exception {
        Assertions.assertEquals("jdbc:h2:mem:testdb", dataSource.getConnection().getMetaData().getURL());
    }
}
