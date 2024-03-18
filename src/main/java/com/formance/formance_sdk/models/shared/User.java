/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formance.formance_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class User {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<? extends String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private Optional<? extends String> subject;

    public User(
            @JsonProperty("email") Optional<? extends String> email,
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("subject") Optional<? extends String> subject) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(subject, "subject");
        this.email = email;
        this.id = id;
        this.subject = subject;
    }

    public Optional<? extends String> email() {
        return email;
    }

    public Optional<? extends String> id() {
        return id;
    }

    public Optional<? extends String> subject() {
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

    public User withEmail(Optional<? extends String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public User withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public User withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public User withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = Optional.ofNullable(subject);
        return this;
    }

    public User withSubject(Optional<? extends String> subject) {
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
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.subject, other.subject);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends String> email = Optional.empty();
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends String> subject = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        public Builder email(Optional<? extends String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = Optional.ofNullable(subject);
            return this;
        }

        public Builder subject(Optional<? extends String> subject) {
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

