package ao.com.angotech.payment.enums;

public enum PaymentAttemptStatus {

    INITIATED,     // tentativa criada
    PROCESSING,    // enviada ao PSP
    REQUIRES_ACTION, // aguardando ação do cliente (ex: OTP)
    SUCCEEDED,     // pagamento confirmado
    FAILED,        // falhou
    CANCELLED,     // cancelado pelo utilizador
    EXPIRED        // tentativa expirou
}
