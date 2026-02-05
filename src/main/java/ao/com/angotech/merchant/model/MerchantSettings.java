package ao.com.angotech.merchant.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "merchant_settings")
public class MerchantSettings {

    @Id
    private UUID merchantId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    private String successUrl;
    private String cancelUrl;
    private String customDomain;

    private String primaryColor = "#10b981";
    private String secondaryColor = "#1e293b";

    public MerchantSettings() {
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

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public String getCustomDomain() {
        return customDomain;
    }

    public void setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }
}
