package digital.asset.management.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UploadAssetCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String filePath;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String fileType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String filename;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer fileSize;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String createdBy;
}
