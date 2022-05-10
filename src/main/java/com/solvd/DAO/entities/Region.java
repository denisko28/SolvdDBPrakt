package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Region {
  private Integer id;

  private String name;

  private List<City> cities;

  public Region() { }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<City> getCities() {
    return cities;
  }

  public void setCities(List<City> cities) {
    this.cities = cities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Region region = (Region) o;
    return Objects.equals(id, region.id) && Objects.equals(name, region.name) && Objects.equals(cities, region.cities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cities);
  }

  @Override
  public String toString() {
    return "Region{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", cities=" + cities +
            '}';
  }
}
