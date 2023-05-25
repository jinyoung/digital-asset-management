package digital.asset.management.domain;

import digital.asset.management.domain.*;
import digital.asset.management.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserRoleUpdated extends AbstractEvent {

    private Integer userId;
    private String role;

    public UserRoleUpdated(User aggregate) {
        super(aggregate);
    }

    public UserRoleUpdated() {
        super();
    }
}
