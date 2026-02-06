package ao.com.angotech.payment.enums;

public enum RefundStatus {

    PENDING,       // pedido criado
    PROCESSING,    // enviado ao PSP
    SUCCEEDED,     // reembolso concluído
    FAILED,        // falhou
    CANCELLED      // cancelado
}
