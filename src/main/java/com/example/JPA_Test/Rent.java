package com.example.JPA_Test;



import javax.persistence.*;

@Entity
public class Rent {
    private long id;
    private com.example.JPA_Test.Car car;



    public Rent() {

        super();
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    public com.example.JPA_Test.Car getCar() {
        return car;
    }

    public void setCar(com.example.JPA_Test.Car car) {
        this.car = car;
    }

}

