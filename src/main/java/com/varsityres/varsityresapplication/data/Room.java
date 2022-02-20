package com.varsityres.varsityresapplication.data;

import javax.persistence.*;

@Table(name="room", uniqueConstraints = {
        @UniqueConstraint(name = "is_single_unique", columnNames = "is_single")
})
@Entity(name="Room")
public class Room {

    @Column(name="id", nullable = false, updatable = false)
    @SequenceGenerator(name="room_sequence", sequenceName = "room_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_sequence" )
    @Id
    private Long id;

    @Column(name="room_number", nullable = false, unique = true)
    private Integer roomNumber;

    @Column(name="is_single", nullable = false)
    private boolean isSingle;

    @Column(name="is_digital_lock", nullable = false)
    private boolean isDigitalLock;

    public Room() {
    }

    public Room(Integer roomNumber, Boolean isSingle, Boolean isDigitalLock) {
        this.roomNumber = roomNumber;
        this.isSingle = isSingle;
        this.isDigitalLock = isDigitalLock;
    }

    public Room(Long id, Integer roomNumber, Boolean isSingle, Boolean isDigitalLock) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.isSingle = isSingle;
        this.isDigitalLock = isDigitalLock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean getSingle() {
        return isSingle;
    }

    public void setSingle(Boolean single) {
        isSingle = single;
    }

    public Boolean getDigitalLock() {
        return isDigitalLock;
    }

    public void setDigitalLock(Boolean digitalLock) {
        isDigitalLock = digitalLock;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", isSingle=" + isSingle +
                ", isDigitalLock=" + isDigitalLock +
                '}';
    }
}
