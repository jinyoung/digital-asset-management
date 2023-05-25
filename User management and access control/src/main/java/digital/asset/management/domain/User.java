package digital.asset.management.domain;

import digital.asset.management.UserManagementAndAccessControlApplication;
import digital.asset.management.domain.UserCreated;
import digital.asset.management.domain.UserDeleted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "User_table")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String username;

    private String password;

    private String role;

    @PostPersist
    public void onPostPersist() {
        UserCreated userCreated = new UserCreated(this);
        userCreated.publishAfterCommit();

        UserDeleted userDeleted = new UserDeleted(this);
        userDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    @PreRemove
    public void onPreRemove() {}

    public static UserRepository repository() {
        UserRepository userRepository = UserManagementAndAccessControlApplication.applicationContext.getBean(
            UserRepository.class
        );
        return userRepository;
    }

    public void updateUserRole(UpdateUserRoleCommand updateUserRoleCommand) {
        UserRoleUpdated userRoleUpdated = new UserRoleUpdated(this);
        userRoleUpdated.publishAfterCommit();
    }
}
