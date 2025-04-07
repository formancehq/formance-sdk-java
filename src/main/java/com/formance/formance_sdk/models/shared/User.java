/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class User {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private Optional<String> subject;

    @JsonCreator
    public User(
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("subject") Optional<String> subject) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(subject, "subject");
        this.email = email;
        this.id = id;
        this.subject = subject;
    }
    
    public User() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> subject() {
        return subject;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public User withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    public User withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public User withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public User withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public User withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = Optional.ofNullable(subject);
        return this;
    }

    public User withSubject(Optional<String> subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = subject;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User other = (User) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.subject, other.subject);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            id,
            subject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(User.class,
                "email", email,
                "id", id,
                "subject", subject);
    }
    
    public final static class Builder {
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> subject = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = Optional.ofNullable(subject);
            return this;
        }

        public Builder subject(Optional<String> subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = subject;
            return this;
        }
        
        public User build() {
            return new User(
                email,
                id,
                subject);
        }
    }
}
