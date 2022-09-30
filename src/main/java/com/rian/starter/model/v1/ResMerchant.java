package com.rian.starter.model.v1;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="res_merchants")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResMerchant {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="merchant_name")
    private String merchantName;

    @Column(name="merchant_address")
    private String merchantAddress;

    @Column(name="merchant_profile")
    private String merchantProfile;

    @Column(name="kecamatan")
    private String kecamatan;

    @Column(name="owner")
    private String owner;

    @Column(name="no_telp")
    private String noTelp;

    @Column(name="no_rekening")
    private String noRekening;

    @Column(name="no_imei")
    private String noImei;

    @Column(name="data_katalog")
    private String dataKatalog;
}
