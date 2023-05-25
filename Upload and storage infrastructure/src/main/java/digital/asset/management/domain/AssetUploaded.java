package digital.asset.management.domain;

import digital.asset.management.domain.*;
import digital.asset.management.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AssetUploaded extends AbstractEvent {

    private String filename;
    private String createdBy;
    private Date createdOn;

    public AssetUploaded(Asset aggregate) {
        super(aggregate);
    }

    public AssetUploaded() {
        super();
    }
}
