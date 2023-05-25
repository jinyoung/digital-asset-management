package digital.asset.management.domain;

import digital.asset.management.UploadAndStorageInfrastructureApplication;
import digital.asset.management.domain.AssetUploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Asset_table")
@Data
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer assetId;

    private String filePath;

    private String fileType;

    private String filename;

    private Integer fileSize;

    private String createdBy;

    private Date createdOn;

    private String status;

    @PostPersist
    public void onPostPersist() {
        AssetUploaded assetUploaded = new AssetUploaded(this);
        assetUploaded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static AssetRepository repository() {
        AssetRepository assetRepository = UploadAndStorageInfrastructureApplication.applicationContext.getBean(
            AssetRepository.class
        );
        return assetRepository;
    }

    public void deleteAsset(DeleteAssetCommand deleteAssetCommand) {
        // implement
        AssetDeleted assetDeleted = new AssetDeleted(this);
        assetDeleted.publishAfterCommit();
    }
}
