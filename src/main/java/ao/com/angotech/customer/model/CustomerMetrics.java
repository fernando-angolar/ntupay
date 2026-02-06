package ao.com.angotech.customer.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "customer_metrics")
public class CustomerMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @MapsId
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private BigDecimal totalSpent = BigDecimal.ZERO;
    private Long totalTransactions = 0L;
    private Instant lastTransactionsAt;

    public CustomerMetrics() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(BigDecimal totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Long getTotalTransactions() {
        return totalTransactions;
    }

    public void setTotalTransactions(Long totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

    public Instant getLastTransactionsAt() {
        return lastTransactionsAt;
    }

    public void setLastTransactionsAt(Instant lastTransactionsAt) {
        this.lastTransactionsAt = lastTransactionsAt;
    }
}
