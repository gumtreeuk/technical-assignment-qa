package com.gumtree.example03.model;

import java.time.LocalDate;

public class DbUser {

    private long id;
    private String firstname;
    private String surname;
    private LocalDate birthDate;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressLine4;
    private boolean isPrivate;

    public DbUser(long id, String firstname, String surname, LocalDate birthDate,
                  LocalDate dateCreated, LocalDate dateUpdated,
                  String addressLine1, String addressLine2, String addressLine3, String addressLine4,
                  boolean isPrivate) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.birthDate = birthDate;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.isPrivate = isPrivate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDate dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }


    public static final class Builder {
        private long id;
        private String firstname;
        private String surname;
        private LocalDate birthDate;
        private LocalDate dateCreated;
        private LocalDate dateUpdated;
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private boolean isPrivate;

        private Builder() {
        }

        public static Builder aDbUser() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder withDateCreated(LocalDate dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder withDateUpdated(LocalDate dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }

        public Builder withAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder withAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder withAddressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        public Builder withAddressLine4(String addressLine4) {
            this.addressLine4 = addressLine4;
            return this;
        }

        public Builder withIsPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder but() {
            return aDbUser().withId(id).withFirstname(firstname).withSurname(surname).withBirthDate(birthDate).withDateCreated(dateCreated).withDateUpdated(dateUpdated).withAddressLine1(addressLine1).withAddressLine2(addressLine2).withAddressLine3(addressLine3).withAddressLine4(addressLine4).withIsPrivate(isPrivate);
        }

        public DbUser build() {
            return new DbUser(id, firstname, surname, birthDate, dateCreated, dateUpdated, addressLine1, addressLine2, addressLine3, addressLine4, isPrivate);
        }
    }
}
