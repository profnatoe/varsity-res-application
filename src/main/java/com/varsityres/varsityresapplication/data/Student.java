package com.varsityres.varsityresapplication.data;

import javax.persistence.*;

@Table(name="student", uniqueConstraints = {
        @UniqueConstraint(name ="student_email_unique", columnNames = "email")
})
@Entity(name="Student")
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", initialValue = 20220000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name = "id", nullable = false, updatable = false)
    private Long Id;

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "email", nullable = false, columnDefinition = "TEXT", unique = true)
    private String email;

    @Column(name = "is_under_graduate", nullable = false)
    private boolean isUndergraduate;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "level_of_study", nullable = false)
    private Integer levelOfStudy;

    public Student() {
    }

    public Student(String firstName, String lastName, String email, boolean isUndergraduate, Integer age, Integer levelOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isUndergraduate = isUndergraduate;
        this.age = age;
        this.levelOfStudy = levelOfStudy;
    }

    public Student(Long id, String firstName, String lastName, String email, boolean isUndergraduate, Integer age, Integer levelOfStudy) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isUndergraduate = isUndergraduate;
        this.age = age;
        this.levelOfStudy = levelOfStudy;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isUndergraduate() {
        return isUndergraduate;
    }

    public void setUndergraduate(boolean undergraduate) {
        isUndergraduate = undergraduate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLevelOfStudy() {
        return levelOfStudy;
    }

    public void setLevelOfStudy(Integer levelOfStudy) {
        this.levelOfStudy = levelOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isUndergraduate=" + isUndergraduate +
                ", age=" + age +
                ", levelOfStudy=" + levelOfStudy +
                '}';
    }
}
