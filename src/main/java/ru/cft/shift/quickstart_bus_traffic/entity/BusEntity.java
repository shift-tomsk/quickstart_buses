package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "bus")
public class BusEntity {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  @Column(name = "number")
  private String number;
  @ManyToOne(cascade = CascadeType.ALL)
  private BusModelEntity model;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<PassengerEntity> passengers;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BusModelEntity getModel() {
    return model;
  }

  public void setModel(BusModelEntity model) {
    this.model = model;
  }

  public Set<PassengerEntity> getPassengers() {
    return passengers;
  }

  public void setPassengers(Set<PassengerEntity> passengers) {
    this.passengers = passengers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BusEntity busEntity = (BusEntity) o;
    return Objects.equals(id, busEntity.id) &&
        Objects.equals(number, busEntity.number) &&
        Objects.equals(model, busEntity.model) &&
        Objects.equals(passengers, busEntity.passengers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, model, passengers);
  }

  @Override
  public String toString() {
    return "BusEntity{" +
        "id=" + id +
        ", number='" + number + '\'' +
        ", model=" + model +
        ", passengers=" + passengers +
        '}';
  }
}
