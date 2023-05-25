package digital.asset.management.infra;

import digital.asset.management.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<User>> {

    @Override
    public EntityModel<User> process(EntityModel<User> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "//users/{user_id}/role"
                )
                .withRel("/users/{user_id}/role")
        );

        return model;
    }
}
