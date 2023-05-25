package digital.asset.management.domain;

import digital.asset.management.domain.*;
import digital.asset.management.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserCreated extends AbstractEvent {

    private String username;
    private String role;

    public UserCreated(User aggregate) {
        super(aggregate);
    }

    public UserCreated() {
        super();
    }
}
