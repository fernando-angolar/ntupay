package ao.com.angotech.subscription.model;

import ao.com.angotech.customer.model.Customer;
import ao.com.angotech.merchant.model.Merchant;
import ao.com.angotech.plan.model.Plan;
import ao.com.angotech.subscription.enums.SubscriptionStatus;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "subscriptions")
public class Subscription {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "subscription_id", unique = true, nullable = false)
    private String subscriptionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchant_id", nullable = false)
    private Merchant merchant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id", nullable = false)
    private Plan plan;

    @Enumerated(EnumType.STRING)
    private SubscriptionStatus status;


    @Column(name = "currentPeriod_start")
    private Instant currentPeriodStart;

    @Column(name = "currentPeriod_end")
    private Instant currentPeriodEnd;

    @Column(name = "trial_start")
    private Instant trialStart;

    @Column(name = "trial_end")
    private Instant trialEnd;

    @Column(name = "billing_cycle_count")
    private Integer billingCycleCount = 0;

    @Column(name = "failed_payment_count")
    private Integer failedPaymentCount = 0;


    @Column(name = "last_payment_at")
    private Instant lastPaymentAt;

    @Column(name = "next_billing_date")
    private Instant nextBillingDate;

    @Column(name = "cancelled_at")
    private String cancelledAt;

    @Column(name = "cancellation_reason")
    private String cancellationReason;

    @Column(name = "cancel_at_period_end")
    private Boolean cancelAtPeriodEnd = false;

    @Column(name = "completed_at")
    private Instant completedAt;

    // snapshot financeiro
    @Column(name = "plan_amount_snapshot")
    private Integer planAmountSnapshot;


    @Column(name = "plan_currency_snapshot")
    private String planCurrencySnapshot;

    @Column(columnDefinition = "jsonb")
    private String metadata;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    public Subscription() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public SubscriptionStatus getStatus() {
        return status;
    }

    public void setStatus(SubscriptionStatus status) {
        this.status = status;
    }

    public Instant getCurrentPeriodStart() {
        return currentPeriodStart;
    }

    public void setCurrentPeriodStart(Instant currentPeriodStart) {
        this.currentPeriodStart = currentPeriodStart;
    }

    public Instant getCurrentPeriodEnd() {
        return currentPeriodEnd;
    }

    public void setCurrentPeriodEnd(Instant currentPeriodEnd) {
        this.currentPeriodEnd = currentPeriodEnd;
    }

    public Instant getTrialStart() {
        return trialStart;
    }

    public void setTrialStart(Instant trialStart) {
        this.trialStart = trialStart;
    }

    public Instant getTrialEnd() {
        return trialEnd;
    }

    public void setTrialEnd(Instant trialEnd) {
        this.trialEnd = trialEnd;
    }

    public Integer getBillingCycleCount() {
        return billingCycleCount;
    }

    public void setBillingCycleCount(Integer billingCycleCount) {
        this.billingCycleCount = billingCycleCount;
    }

    public Integer getFailedPaymentCount() {
        return failedPaymentCount;
    }

    public void setFailedPaymentCount(Integer failedPaymentCount) {
        this.failedPaymentCount = failedPaymentCount;
    }

    public Instant getLastPaymentAt() {
        return lastPaymentAt;
    }

    public void setLastPaymentAt(Instant lastPaymentAt) {
        this.lastPaymentAt = lastPaymentAt;
    }

    public Instant getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(Instant nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public String getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Boolean getCancelAtPeriodEnd() {
        return cancelAtPeriodEnd;
    }

    public void setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
        this.cancelAtPeriodEnd = cancelAtPeriodEnd;
    }

    public Instant getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Instant completedAt) {
        this.completedAt = completedAt;
    }

    public Integer getPlanAmountSnapshot() {
        return planAmountSnapshot;
    }

    public void setPlanAmountSnapshot(Integer planAmountSnapshot) {
        this.planAmountSnapshot = planAmountSnapshot;
    }

    public String getPlanCurrencySnapshot() {
        return planCurrencySnapshot;
    }

    public void setPlanCurrencySnapshot(String planCurrencySnapshot) {
        this.planCurrencySnapshot = planCurrencySnapshot;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
