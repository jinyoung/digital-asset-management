package digital.asset.management.infra;

import digital.asset.management.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/assets")
@Transactional
public class AssetController {

    @Autowired
    AssetRepository assetRepository;

    @RequestMapping(
        value = "assets/{id}/deleteasset",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Asset deleteAsset(
        @PathVariable(value = "id") Integer id,
        @RequestBody DeleteAssetCommand deleteAssetCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /asset/deleteAsset  called #####");
        Optional<Asset> optionalAsset = assetRepository.findById(id);

        optionalAsset.orElseThrow(() -> new Exception("No Entity Found"));
        Asset asset = optionalAsset.get();
        asset.deleteAsset(deleteAssetCommand);

        assetRepository.save(asset);
        return asset;
    }
}
