package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "passenger")
public class PassengerEntity {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "is_gatecrasher")
  private boolean isGatecrasher;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isGatecrasher() {
    return isGatecrasher;
  }

  public void setGatecrasher(boolean gatecrasher) {
    isGatecrasher = gatecrasher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PassengerEntity that = (PassengerEntity) o;
    return isGatecrasher == that.isGatecrasher &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isGatecrasher);
  }

  @Override
  public String toString() {
    return "PassengerEntity{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", isGatecrasher=" + isGatecrasher +
        '}';
  }
}
