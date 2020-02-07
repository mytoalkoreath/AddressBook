import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import SpringApp.Greeting;
import SpringApp.HandlingFormSubmissionApplication;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


@SpringBootTest(classes={HandlingFormSubmissionApplication.class})
@AutoConfigureMockMvc
public class TestingWebApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        Greeting g = new Greeting();
        g.setId("Book1");
        this.mockMvc.perform(post("/")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Book1"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("AddressBook Created!")));
        this.mockMvc.perform(post("/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Frank")
                .param("content", "123")
                .param("address", "1234 test ave"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("Frank")));
        this.mockMvc.perform(post("/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "George")
                .param("content", "123")
                .param("address", "1234 test ave"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("George")));
        this.mockMvc.perform(post("/delete")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Frank"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("George")));
        this.mockMvc.perform(post("/switch")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Book2"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("AddressBook Switched")));
        this.mockMvc.perform(post("/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Frank")
                .param("content", "123")
                .param("address", "1234 test ave"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("Frank")));
        this.mockMvc.perform(post("/delete")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "George"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("Frank")));
        this.mockMvc.perform(post("/switch")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Book1"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("AddressBook Switched")));
        this.mockMvc.perform(post("/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("Id", "Test")
                .param("content", "123")
                .param("address", "1234 test ave"))
                .andDo(print()).andExpect(status().isOk()).andExpect(content()
                .string(containsString("George")));





    }










}
