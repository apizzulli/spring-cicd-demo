package com.dev.cicd.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DataApplicationTests {

	@Test
	void contextLoads() {
	}
	@SpringBootTest
class DataControllerTest {

    @Autowired
    DataController dataController;

    @Test
    void health() {
        assertEquals( "HEALTH CHECK GOOD!", dataController.healthCheck());
    }

    @Test
    void version() {
        assertEquals( "The actual version is 1.0.0", dataController.version());
    }

    @Test
    void nationsLength() {
        Integer nationsLength = dataController.getNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    void currenciesLength() {
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }

}

}
