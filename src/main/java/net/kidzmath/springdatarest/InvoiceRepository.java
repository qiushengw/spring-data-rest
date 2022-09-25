package net.kidzmath.springdatarest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "invoices", path = "invoices")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {
    List<Invoice> findAllByTransactionDtBetween(LocalDateTime startDt, LocalDateTime endDt);
}

