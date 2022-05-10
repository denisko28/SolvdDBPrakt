package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Department {
    private Integer id;

    private Faculty faculty;

    private List<Specialty> specialties;

    public Department() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(List<Specialty> specialties) {
        this.specialties = specialties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id) && Objects.equals(faculty, that.faculty) && Objects.equals(specialties, that.specialties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, faculty, specialties);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", faculty=" + faculty +
                ", specialties=" + specialties +
                '}';
    }
}
