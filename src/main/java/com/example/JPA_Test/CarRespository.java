
package com.example.JPA_Test;
import org.springframework.data.repository.CrudRepository;

interface CarRepository extends CrudRepository<Car, Long> {
    com.example.JPA_Test.Car findByPlateNumber(String plateNumber);
}
