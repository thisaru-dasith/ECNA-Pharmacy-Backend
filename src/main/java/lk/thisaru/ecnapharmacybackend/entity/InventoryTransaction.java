package lk.thisaru.ecnapharmacybackend.entity;

import jakarta.persistence.*;
import lk.thisaru.ecnapharmacybackend.util.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory_transactions")
public class InventoryTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "transaction_type")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "source")
    private String source;
    @Column(name = "transaction_date", insertable = false, updatable = false)
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "drug_id")
    private Drug drug;

}
