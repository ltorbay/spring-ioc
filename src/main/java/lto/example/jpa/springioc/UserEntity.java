package lto.example.jpa.springioc;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
class UserEntity {

    @Id
    @Column
    private Integer id;

    @Column
    private String login;

    @Column
    private String email;

}
