package digital.asset.management.common;

import digital.asset.management.CollaborationAndWorkflowManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(
    classes = { CollaborationAndWorkflowManagementApplication.class }
)
public class CucumberSpingConfiguration {}
