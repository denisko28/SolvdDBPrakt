package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class City {
  private Integer id;

  private List<Address> addresses;

  public City() { }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    City city = (City) o;
    return Objects.equals(id, city.id) && Objects.equals(addresses, city.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addresses);
  }

  @Override
  public String toString() {
    return "City{" +
            "id=" + id +
            ", addresses=" + addresses +
            '}';
  }
}
