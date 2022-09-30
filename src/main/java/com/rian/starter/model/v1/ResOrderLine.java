package com.rian.starter.model.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="res_order_line")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResOrderLine {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="no_reff", referencedColumnName = "no_reff")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private ResOrder orderId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_qty")
    private int productQty;

    @Column(name="sub_total")
    private int subTotal;

    @Column(name="no_va")
    private String no_va;

    @Column(name="keterangan")
    private String keterangan;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="merchant_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ResMerchant merchantId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="school_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ResSchool schoolId;

    @Column(name="order_date")
    private Date orderDate;
}
