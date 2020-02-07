import static org.assertj.core.api.Assertions.assertThat;

import SpringApp.HandlingFormSubmissionApplication;
import org.junit.jupiter.api.Test;
import SpringApp.GreetingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes={HandlingFormSubmissionApplication.class})
public class SmokeTest {

    @Autowired
    private GreetingController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}