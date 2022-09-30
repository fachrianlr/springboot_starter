package com.rian.starter.model.v1;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="res_order")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResOrder implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="no_reff")
    private String noReff;

    @Column(name="no_va")
    private String noVa;

    @Column(name="total")
    private int total;

    @Column(name="status")
    private String status;

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

    @Column(name="draft_date")
    private Date draftDate;

    @Column(name="delivery_date")
    private Date deliveryDate;

    @Column(name="received_date")
    private Date receivedDate;

    @Column(name="finished_date")
    private Date finishedDate;

    @Column(name="reject_date")
    private Date rejectDate;

    @OneToMany(mappedBy = "orderId", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<ResOrderLine> orderLine;
}
