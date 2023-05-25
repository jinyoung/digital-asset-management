package digital.asset.management.domain;

import digital.asset.management.CollaborationAndWorkflowManagementApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Collaboration_table")
@Data
public class Collaboration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String team;

    public static CollaborationRepository repository() {
        CollaborationRepository collaborationRepository = CollaborationAndWorkflowManagementApplication.applicationContext.getBean(
            CollaborationRepository.class
        );
        return collaborationRepository;
    }
}
