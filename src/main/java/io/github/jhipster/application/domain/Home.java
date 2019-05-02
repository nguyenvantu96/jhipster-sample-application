package io.github.jhipster.application.domain;

import javax.persistence.*;


@Entity
@Table(name = "home2")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "address")
    private String address;

    @Column (name ="price")
    private Long price;

    public Home(String address) {
        this.address = address;
    }

    public Home() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
