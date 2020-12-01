package com.hibernate.tut;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name = "STUDENT_ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private int addId;
    @Column(length = 50,name = "STREET")
    private String street;
    @Column(name = "is_Open")
    private boolean isOpen;
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Transient
    private double x;
    @Lob
    private byte[] image;

    public Address() {
    }

    public Address(int addId, String street, boolean isOpen, Date addedDate, byte[] image) {
        this.addId = addId;
        this.street = street;
        this.isOpen = isOpen;
        this.addedDate = addedDate;
        this.image = image;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address [addId=" + addId + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image)
                + ", isOpen=" + isOpen + ", street=" + street + ", x=" + x + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Address(int addId, String street, boolean isOpen, Date addedDate, double x, byte[] image) {
        this.addId = addId;
        this.street = street;
        this.isOpen = isOpen;
        this.addedDate = addedDate;
        this.x = x;
        this.image = image;
    }
    
}
