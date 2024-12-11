package com.makers.makersbnb_coach_support_code;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(properties = "spring.flyway.clean-disabled=false")
class MakersbnbCoachSupportCodeApplicationTests {

	@Autowired
	private Flyway flyway;

	@BeforeEach
    void setUpDatabase() {
		flyway.clean();
		flyway.migrate();
	}

	@AfterEach
	void cleanUpDatabase() {
		flyway.clean();
	}

    @Test
	void contextLoads() {
	}

}
