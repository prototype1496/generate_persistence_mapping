package com.example.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "idString", nullable = false, length = 50)
    private String idString;
    @Basic
    @Column(name = "userType", nullable = false, length = 20)
    private String userType;
    @Basic
    @Column(name = "titleId", nullable = false)
    private int titleId;
    @Basic
    @Column(name = "profilePictureId", nullable = true)
    private Integer profilePictureId;
    @Basic
    @Column(name = "gender", nullable = false, length = 50)
    private String gender;
    @Basic
    @Column(name = "lastLoginIp", nullable = true, length = 100)
    private String lastLoginIp;
    @Basic
    @Column(name = "firstName", nullable = false, length = -1)
    private String firstName;
    @Basic
    @Column(name = "lastName", nullable = false, length = -1)
    private String lastName;
    @Basic
    @Column(name = "otherName", nullable = true, length = -1)
    private String otherName;
    @Basic
    @Column(name = "dateOfBirth", nullable = false)
    private Date dateOfBirth;
    @Basic
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Basic
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Basic
    @Column(name = "emailAddress", nullable = true, length = 100)
    private String emailAddress;
    @Basic
    @Column(name = "passwordRegex", nullable = false, length = 100)
    private String passwordRegex;
    @Basic
    @Column(name = "numberOfFailedLoginAttempts", nullable = true)
    private Integer numberOfFailedLoginAttempts;
    @Basic
    @Column(name = "firstLogin", nullable = true)
    private Timestamp firstLogin;
    @Basic
    @Column(name = "lastLogin", nullable = true)
    private Timestamp lastLogin;
    @Basic
    @Column(name = "contactNo", nullable = false, length = 50)
    private String contactNo;
    @Basic
    @Column(name = "resetCode", nullable = true, length = 10)
    private String resetCode;
    @Basic
    @Column(name = "resetCodeExpiry", nullable = true)
    private Timestamp resetCodeExpiry;
    @Basic
    @Column(name = "status", nullable = false, length = 50)
    private String status;
    @Basic
    @Column(name = "active", nullable = false)
    private byte active;
    @Basic
    @Column(name = "createdBy", nullable = false)
    private long createdBy;
    @Basic
    @Column(name = "modifiedBy", nullable = false)
    private long modifiedBy;
    @Basic
    @Column(name = "dateCreated", nullable = false)
    private Timestamp dateCreated;
    @Basic
    @Column(name = "dateModified", nullable = false)
    private Timestamp dateModified;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public Integer getProfilePictureId() {
        return profilePictureId;
    }

    public void setProfilePictureId(Integer profilePictureId) {
        this.profilePictureId = profilePictureId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
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

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPasswordRegex() {
        return passwordRegex;
    }

    public void setPasswordRegex(String passwordRegex) {
        this.passwordRegex = passwordRegex;
    }

    public Integer getNumberOfFailedLoginAttempts() {
        return numberOfFailedLoginAttempts;
    }

    public void setNumberOfFailedLoginAttempts(Integer numberOfFailedLoginAttempts) {
        this.numberOfFailedLoginAttempts = numberOfFailedLoginAttempts;
    }

    public Timestamp getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Timestamp firstLogin) {
        this.firstLogin = firstLogin;
    }

    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getResetCode() {
        return resetCode;
    }

    public void setResetCode(String resetCode) {
        this.resetCode = resetCode;
    }

    public Timestamp getResetCodeExpiry() {
        return resetCodeExpiry;
    }

    public void setResetCodeExpiry(Timestamp resetCodeExpiry) {
        this.resetCodeExpiry = resetCodeExpiry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id && titleId == users.titleId && active == users.active && createdBy == users.createdBy && modifiedBy == users.modifiedBy && Objects.equals(idString, users.idString) && Objects.equals(userType, users.userType) && Objects.equals(profilePictureId, users.profilePictureId) && Objects.equals(gender, users.gender) && Objects.equals(lastLoginIp, users.lastLoginIp) && Objects.equals(firstName, users.firstName) && Objects.equals(lastName, users.lastName) && Objects.equals(otherName, users.otherName) && Objects.equals(dateOfBirth, users.dateOfBirth) && Objects.equals(username, users.username) && Objects.equals(password, users.password) && Objects.equals(emailAddress, users.emailAddress) && Objects.equals(passwordRegex, users.passwordRegex) && Objects.equals(numberOfFailedLoginAttempts, users.numberOfFailedLoginAttempts) && Objects.equals(firstLogin, users.firstLogin) && Objects.equals(lastLogin, users.lastLogin) && Objects.equals(contactNo, users.contactNo) && Objects.equals(resetCode, users.resetCode) && Objects.equals(resetCodeExpiry, users.resetCodeExpiry) && Objects.equals(status, users.status) && Objects.equals(dateCreated, users.dateCreated) && Objects.equals(dateModified, users.dateModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idString, userType, titleId, profilePictureId, gender, lastLoginIp, firstName, lastName, otherName, dateOfBirth, username, password, emailAddress, passwordRegex, numberOfFailedLoginAttempts, firstLogin, lastLogin, contactNo, resetCode, resetCodeExpiry, status, active, createdBy, modifiedBy, dateCreated, dateModified);
    }
}
