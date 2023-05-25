package digital.asset.management.domain;

import digital.asset.management.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "assets", path = "assets")
public interface AssetRepository
    extends PagingAndSortingRepository<Asset, Integer> {}
