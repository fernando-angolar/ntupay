package ao.com.angotech.payment.enums;

public enum PaymentEventType {

    PAYMENT_CREATED,
    STATUS_CHANGED,
    ATTEMPT_STARTED,
    ATTEMPT_FAILED,
    PAYMENT_CONFIRMED,
    PAYMENT_CANCELLED,
    PAYMENT_EXPIRED,
    REFUND_CREATED,
    WEBHOOK_SENT
}
