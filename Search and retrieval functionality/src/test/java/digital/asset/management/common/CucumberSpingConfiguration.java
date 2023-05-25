package digital.asset.management.common;

import digital.asset.management.SearchAndRetrievalFunctionalityApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SearchAndRetrievalFunctionalityApplication.class })
public class CucumberSpingConfiguration {}
