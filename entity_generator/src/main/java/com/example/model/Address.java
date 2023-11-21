package com.example.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "primaryAddress", nullable = false, length = -1)
    private String primaryAddress;
    @Basic
    @Column(name = "secondaryAddress", nullable = true, length = -1)
    private String secondaryAddress;
    @Basic
    @Column(name = "streetNo", nullable = true, length = 50)
    private String streetNo;
    @Basic
    @Column(name = "zipCode", nullable = true, length = 50)
    private String zipCode;
    @Basic
    @Column(name = "districtId", nullable = false)
    private int districtId;
    @Basic
    @Column(name = "identificationId", nullable = true, length = 50)
    private String identificationId;
    @Basic
    @Column(name = "dateCreated", nullable = false)
    private Timestamp dateCreated;
    @Basic
    @Column(name = "dateModified", nullable = false)
    private Timestamp dateModified;
    @Basic
    @Column(name = "createdBy", nullable = false)
    private long createdBy;
    @Basic
    @Column(name = "modifiedBy", nullable = false)
    private long modifiedBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getIdentificationId() {
        return identificationId;
    }

    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return id == address.id && districtId == address.districtId && createdBy == address.createdBy && modifiedBy == address.modifiedBy && Objects.equals(primaryAddress, address.primaryAddress) && Objects.equals(secondaryAddress, address.secondaryAddress) && Objects.equals(streetNo, address.streetNo) && Objects.equals(zipCode, address.zipCode) && Objects.equals(identificationId, address.identificationId) && Objects.equals(dateCreated, address.dateCreated) && Objects.equals(dateModified, address.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, primaryAddress, secondaryAddress, streetNo, zipCode, districtId, identificationId, dateCreated, dateModified, createdBy, modifiedBy);
    }
}
