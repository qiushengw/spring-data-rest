package net.kidzmath.springdatarest;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Invoice implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String financingDays;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "currency", column = @Column(name = "invoiceAmountCurrency")),
            @AttributeOverride( name = "value", column = @Column(name = "invoiceAmountValue")),
    })
    private Amount invoiceAmount;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "currency", column = @Column(name = "financingAmountCurrency")),
            @AttributeOverride( name = "value", column = @Column(name = "financingAmountValue")),
    })
    private Amount financingAmount;
    private String servicingFees;
    private LocalDateTime transactionDt;
    private String apiStatus;
    @ManyToOne
    @JoinColumn(name = "buyerId")
    private Customer buyer;
    @ManyToOne
    @JoinColumn(name = "sellerId")
    private Customer seller;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFinancingDays() {
        return financingDays;
    }

    public void setFinancingDays(String financingDays) {
        this.financingDays = financingDays;
    }

    public Amount getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Amount invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Amount getFinancingAmount() {
        return financingAmount;
    }

    public void setFinancingAmount(Amount financingAmount) {
        this.financingAmount = financingAmount;
    }

    public String getServicingFees() {
        return servicingFees;
    }

    public void setServicingFees(String servicingFees) {
        this.servicingFees = servicingFees;
    }


    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }

    public Customer getSeller() {
        return seller;
    }

    public void setSeller(Customer seller) {
        this.seller = seller;
    }

    public LocalDateTime getTransactionDt() {
        return transactionDt;
    }

    public void setTransactionDt(LocalDateTime transactionDt) {
        this.transactionDt = transactionDt;
    }



}
