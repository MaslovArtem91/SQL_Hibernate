package ru.netology.javadata_4_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@Entity

public class Person implements Serializable {
    @EmbeddedId
    private PersonKey personKey;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(name="city_of_living")
    private String cityOfLiving;


}
