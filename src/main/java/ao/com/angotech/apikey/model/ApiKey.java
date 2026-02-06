package ao.com.angotech.apikey.model;

import ao.com.angotech.apikey.enums.ApikeyEnvironment;
import ao.com.angotech.merchant.model.Merchant;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "api_keys")
public class ApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "merchat_id")
    private Merchant merchant;

    @Column(name = "key_prefix", nullable = false)
    private String KeyPrefix;

    @Column(name = "key_hash", nullable = false)
    private String keyHash;

    private String name;

    @Enumerated(EnumType.STRING)
    private ApikeyEnvironment environment;


    private Integer rateLimit = 1000;

    private boolean isActive = true;

    private Instant expiresAt;
    private Instant createdAt = Instant.now();
    private Instant revokedAt;

    public ApiKey() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public String getKeyPrefix() {
        return KeyPrefix;
    }

    public void setKeyPrefix(String keyPrefix) {
        KeyPrefix = keyPrefix;
    }

    public String getKeyHash() {
        return keyHash;
    }

    public void setKeyHash(String keyHash) {
        this.keyHash = keyHash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApikeyEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(ApikeyEnvironment environment) {
        this.environment = environment;
    }

    public Integer getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Integer rateLimit) {
        this.rateLimit = rateLimit;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Instant expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getRevokedAt() {
        return revokedAt;
    }

    public void setRevokedAt(Instant revokedAt) {
        this.revokedAt = revokedAt;
    }
}
