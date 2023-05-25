package digital.asset.management.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateUserCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String username;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String password;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String role;
}
