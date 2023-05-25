package digital.asset.management.infra;

import digital.asset.management.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AssetHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Asset>> {

    @Override
    public EntityModel<Asset> process(EntityModel<Asset> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/deleteasset")
                .withRel("deleteasset")
        );

        return model;
    }
}
