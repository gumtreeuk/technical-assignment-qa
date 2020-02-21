package com.gumtree.example03.model;

public class User {

    private final long id;
    private final String fullName;
    private final boolean isPrivate;

    public User(long id, String fullName, boolean canRepostForFree) {
        this.id = id;
        this.fullName = fullName;
        this.isPrivate = canRepostForFree;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isPrivate() {
        return isPrivate;
    }


    public static final class Builder {
        private long id;
        private String fullName;
        private boolean isPrivate;

        private Builder() {
        }

        public static Builder aUser() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder withIsPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder but() {
            return aUser().withId(id).withFullName(fullName).withIsPrivate(isPrivate);
        }

        public User build() {
            return new User(id, fullName, isPrivate);
        }
    }
}
