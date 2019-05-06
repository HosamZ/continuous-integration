package at.nacs.continuousintergration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class HalloWorldTest {

  @Autowired
  TestRestTemplate testRestTemplate;

  String url = "/";

  @Test
  void get() {
    String actual = testRestTemplate.getForObject(url, String.class);

    String expected = "HALLO WORLD";

    Assertions.assertEquals(expected, actual);
  }
}