package com.solvd.DAO.entities;

import java.util.List;
import java.util.Objects;

public class Group {
    private Integer id;

    private Specialty specialty;

    private List<Student> students;

    public Group() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) && Objects.equals(specialty, group.specialty) &&
                Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, specialty, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", specialty=" + specialty +
                ", students=" + students +
                '}';
    }
}
