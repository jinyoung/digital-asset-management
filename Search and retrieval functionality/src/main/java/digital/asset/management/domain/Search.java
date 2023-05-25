package digital.asset.management.domain;

import digital.asset.management.SearchAndRetrievalFunctionalityApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Search_table")
@Data
public class Search {

    public static SearchRepository repository() {
        SearchRepository searchRepository = SearchAndRetrievalFunctionalityApplication.applicationContext.getBean(
            SearchRepository.class
        );
        return searchRepository;
    }
}
