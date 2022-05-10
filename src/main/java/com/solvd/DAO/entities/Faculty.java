package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Faculty {
    private Integer id;

    private Address address;

    private String name;

    private List<Department> departments;

    public Faculty() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(id, faculty.id) && Objects.equals(address, faculty.address) && Objects.equals(name, faculty.name) && Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, name, departments);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", address=" + address +
                ", name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
