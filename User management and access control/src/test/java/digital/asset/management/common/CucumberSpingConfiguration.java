package digital.asset.management.common;

import digital.asset.management.UserManagementAndAccessControlApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserManagementAndAccessControlApplication.class })
public class CucumberSpingConfiguration {}
