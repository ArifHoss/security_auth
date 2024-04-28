package com.spring.security_auth.model.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "authorities")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
