package ao.com.angotech.merchant.model;

import ao.com.angotech.merchant.enums.MerchantVerificationStatus;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "merchant_verification")
public class MerchantVerification {

    @Id
    private UUID merchantId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    @Enumerated(EnumType.STRING)
    private MerchantVerificationStatus status;

    private Instant verifiedAt;
    private UUID verifiedBy;

    @Column(columnDefinition = "TEXT")
    private String rejectionReason;

    public MerchantVerification() {
    }

    public UUID getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(UUID merchantId) {
        this.merchantId = merchantId;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public MerchantVerificationStatus getStatus() {
        return status;
    }

    public void setStatus(MerchantVerificationStatus status) {
        this.status = status;
    }

    public Instant getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(Instant verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    public UUID getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(UUID verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }
}
