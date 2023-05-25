package digital.asset.management.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DeleteUserCommand {

    private Integer userId;
}
