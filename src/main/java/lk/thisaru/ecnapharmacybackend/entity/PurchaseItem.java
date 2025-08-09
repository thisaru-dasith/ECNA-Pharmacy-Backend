package lk.thisaru.ecnapharmacybackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "purchase_items")
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "item_id")
    private UUID purchaseItemId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Column(name = "expire_date")
    private LocalDate expireDate;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "drug_id")
    private Drug drug;

}
