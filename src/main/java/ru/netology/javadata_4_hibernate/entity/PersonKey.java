package ru.netology.javadata_4_hibernate.entity;

import lombok.*;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable

public class PersonKey implements Serializable {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(nullable = false)
    private int age;
}