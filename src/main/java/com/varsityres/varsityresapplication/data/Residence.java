package com.varsityres.varsityresapplication.data;

import javax.persistence.*;
import java.util.List;

@Table(name="residence", uniqueConstraints = {
        @UniqueConstraint(name="residence_name_unique", columnNames = "name")
})
@Entity(name = "Residence")
public class Residence {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="name", unique = true, updatable = true, columnDefinition = "TEXT")
    private String name;

    @Column(name="capacity", updatable = true)
    private Integer capacity;

    @OneToMany
    private List<Room> rooms;

    public Residence() {
    }

    public Residence(String name, Integer capacity, List<Room> rooms) {
        this.name = name;
        this.capacity = capacity;
        this.rooms = rooms;
    }

    public Residence(Long id, String name, Integer capacity, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.rooms = rooms;
    }

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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", rooms=" + rooms +
                '}';
    }
}
