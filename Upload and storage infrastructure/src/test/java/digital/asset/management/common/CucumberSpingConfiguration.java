package digital.asset.management.common;

import digital.asset.management.UploadAndStorageInfrastructureApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UploadAndStorageInfrastructureApplication.class })
public class CucumberSpingConfiguration {}
