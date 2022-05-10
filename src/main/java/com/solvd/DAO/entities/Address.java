package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Address {
    private Integer id;

    private List<Faculty> faculties;

    private List<Department> departments;

    private List<PersonalDatum> personalData;

    public Address() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<PersonalDatum> getPersonalData() {
        return personalData;
    }

    public void setPersonalData(List<PersonalDatum> personalData) {
        this.personalData = personalData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(faculties, address.faculties) && Objects.equals(departments, address.departments) && Objects.equals(personalData, address.personalData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, faculties, departments, personalData);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", faculties=" + faculties +
                ", departments=" + departments +
                ", personalData=" + personalData +
                '}';
    }
}
