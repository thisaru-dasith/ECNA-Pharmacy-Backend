package lk.thisaru.ecnapharmacybackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Column(name = "purchase_date", insertable = false, updatable = false)
    private LocalDateTime purchaseDate;

    @OneToMany(mappedBy = "purchase")
    private List<PurchaseItem> purchaseItems = new ArrayList<>();





}
