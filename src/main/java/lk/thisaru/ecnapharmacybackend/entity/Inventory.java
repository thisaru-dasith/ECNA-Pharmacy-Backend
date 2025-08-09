package lk.thisaru.ecnapharmacybackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventories")
public class Inventory {

    @Id
    @Column(name = "inventory_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;
    @Column(name = "remaining_quantity")
    private Integer remainingQuantity;

    @OneToOne
    @JoinColumn(name = "drug_id")
    private Drug drug;

}
