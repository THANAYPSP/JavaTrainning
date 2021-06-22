package com.example.hellorest.employee;

import com.example.hellorest.MyRandom.MyRandom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    //MockBean การทำการจำลองในโลก Sring boot ทำงานร่วมกับ Mockito ได้
    @MockBean
    private MyRandom random;


    @Test
    public void callApiWithPathVariable() {
        when(random.nextInt(10)).thenReturn(5);
        EmployeeResponese expected = new EmployeeResponese(123, "Thana5", "Yok");
        EmployeeResponese response
                = restTemplate.getForObject("/employee/123", EmployeeResponese.class);
        assertEquals(123, response.getId());
        assertEquals("Thana5", response.getFname());
        assertEquals("Yok", response.getLname());
        assertEquals(expected,response);
    }

    @Test
    public void callApiWithRequestParameter() {
        EmployeeResponese response
                = restTemplate.getForObject("/employee?id=999", EmployeeResponese.class);
        assertEquals(999, response.getId());
        assertEquals("Thana2", response.getFname());
        assertEquals("Yok2", response.getLname());
    }

    @Test
    public void postApiTest() {
        EmployeeRequest request = new EmployeeRequest("Thana", "Yok");
        EmployeeResponese response
                = restTemplate.postForObject("/employee", request, EmployeeResponese.class);
        assertEquals(999, response.getId());
        assertEquals("Thana", response.getFname());
        assertEquals("Yok", response.getLname());
    }
}
