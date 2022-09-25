package net.kidzmath.springdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "invoices", path = "invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {
    List<Invoice> findAllByTransactionDtBetween(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDt, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDt);

    List<Invoice> findByApiStatus(String apiStatus);

}

