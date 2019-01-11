package fr.dauphine.entities;



import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Table
@Entity("accounts")
@Getter
@Setter

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountEntity implements Serializable {

    @Id
    @Column(name = "iban_id")
    private String iban;


    @Column(name = "balance")
    private Long balance;

}
