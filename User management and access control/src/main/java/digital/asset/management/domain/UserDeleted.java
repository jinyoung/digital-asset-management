package digital.asset.management.domain;

import digital.asset.management.domain.*;
import digital.asset.management.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserDeleted extends AbstractEvent {

    private Integer userId;

    public UserDeleted(User aggregate) {
        super(aggregate);
    }

    public UserDeleted() {
        super();
    }
}
