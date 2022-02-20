package edu.st4rd.otus.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@Table("users")
@EqualsAndHashCode(exclude = "id")
public class User {

    @Id
    private final Long id;
    private final String username;
    private final String password;
    private final byte[] avatar;
    @Column("registration_date")
    private final LocalDate registrationDate;
    private final String bio;
}
