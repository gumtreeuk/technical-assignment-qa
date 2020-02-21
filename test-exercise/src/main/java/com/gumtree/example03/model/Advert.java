package com.gumtree.example03.model;

public class Advert {
    private final long id;
    private final long userId;
    private final String description;
    private final boolean isExpired;

    public Advert(long id, long userId, String description, boolean isExpired) {
        this.id = id;
        this.userId = userId;
        this.description = description;
        this.isExpired = isExpired;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public String getDescription() {
        return description;
    }

    public boolean isExpired(){
        return isExpired;
    }

    public Builder getBuilder(){
        return Builder.anAdvert()
                .withId(id)
                .withUserId(userId)
                .withDescription(description)
                .withIsExpired(isExpired);
    }

    public static final class Builder {
        private long id;
        private long userId;
        private String description;
        private boolean isExpired;

        private Builder() {
        }

        public static Builder anAdvert() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withUserId(long userId) {
            this.userId = userId;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withIsExpired(boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }

        public Advert build() {
            return new Advert(id, userId, description, isExpired);
        }
    }
}
