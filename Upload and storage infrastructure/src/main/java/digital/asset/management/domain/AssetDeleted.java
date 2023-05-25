package digital.asset.management.domain;

import digital.asset.management.domain.*;
import digital.asset.management.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AssetDeleted extends AbstractEvent {

    private Integer assetId;

    public AssetDeleted(Asset aggregate) {
        super(aggregate);
    }

    public AssetDeleted() {
        super();
    }
}
