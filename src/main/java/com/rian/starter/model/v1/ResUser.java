package com.rian.starter.model.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;


@Entity
@Table(name="res_users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResUser {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_id")
    private String userId;

    @Column(name="password")
    private String password;

    @Column(name="user_name")
    private String userName;

    @Column(name="access_right")
    private String accessRight;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="merchant_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ResMerchant merchantId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="school_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private ResSchool school_id;

    @Column(name="is_password_changed")
    private Boolean isPasswordChanged;

}