package com.laPasta.foodie.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "food_item")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private BigDecimal basePrice;

    @Enumerated(EnumType.STRING)
    private UnitType unit;

    private String variationName;

    private BigDecimal weightKg;

    private Integer quantity;

    private BigDecimal availableStock;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @CreationTimestamp
    private LocalDateTime createdAt;



    public enum UnitType {
        KG,
        QUANTITY,
        BOTH
    }
}
