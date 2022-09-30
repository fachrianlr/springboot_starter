package com.rian.starter.model.v1;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="res_schools")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResSchool {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="school_name")
    private String schoolName;

    @Column(name="school_address")
    private String schoolAddress;

    @Column(name="school_level")
    private String schoolLevel;

}
