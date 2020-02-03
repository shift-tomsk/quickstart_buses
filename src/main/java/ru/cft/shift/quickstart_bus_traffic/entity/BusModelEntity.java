package ru.cft.shift.quickstart_bus_traffic.entity;

import javax.persistence.*;
import java.util.Objects;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "bus_model")
public class BusModelEntity {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "size")
  private Long size;
  @Column(name = "producer")
  private String producer;

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

  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BusModelEntity that = (BusModelEntity) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(size, that.size) &&
        Objects.equals(producer, that.producer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, size, producer);
  }

  @Override
  public String toString() {
    return "BusModelEntity{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", size=" + size +
        ", producer='" + producer + '\'' +
        '}';
  }
}
