package lto.example.jpa.springioc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class User {

    @Id
    @Column
    private Integer id;

    @Column
    private String username;

    @Column
    private String email;

    Integer getId() {
        return id;
    }

    void setId(Integer id) {
        this.id = id;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }
}
