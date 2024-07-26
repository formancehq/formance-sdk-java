/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class CreateClientRequest {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends java.util.Map<String, java.lang.Object>> metadata;

    @JsonProperty("name")
    private String name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postLogoutRedirectUris")
    private Optional<? extends java.util.List<String>> postLogoutRedirectUris;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public")
    private Optional<? extends Boolean> public_;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirectUris")
    private Optional<? extends java.util.List<String>> redirectUris;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scopes")
    private Optional<? extends java.util.List<String>> scopes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trusted")
    private Optional<? extends Boolean> trusted;

    @JsonCreator
    public CreateClientRequest(
            @JsonProperty("description") Optional<? extends String> description,
            @JsonProperty("metadata") Optional<? extends java.util.Map<String, java.lang.Object>> metadata,
            @JsonProperty("name") String name,
            @JsonProperty("postLogoutRedirectUris") Optional<? extends java.util.List<String>> postLogoutRedirectUris,
            @JsonProperty("public") Optional<? extends Boolean> public_,
            @JsonProperty("redirectUris") Optional<? extends java.util.List<String>> redirectUris,
            @JsonProperty("scopes") Optional<? extends java.util.List<String>> scopes,
            @JsonProperty("trusted") Optional<? extends Boolean> trusted) {
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(postLogoutRedirectUris, "postLogoutRedirectUris");
        Utils.checkNotNull(public_, "public_");
        Utils.checkNotNull(redirectUris, "redirectUris");
        Utils.checkNotNull(scopes, "scopes");
        Utils.checkNotNull(trusted, "trusted");
        this.description = description;
        this.metadata = metadata;
        this.name = name;
        this.postLogoutRedirectUris = postLogoutRedirectUris;
        this.public_ = public_;
        this.redirectUris = redirectUris;
        this.scopes = scopes;
        this.trusted = trusted;
    }
    
    public CreateClientRequest(
            String name) {
        this(Optional.empty(), Optional.empty(), name, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> description() {
        return (Optional<String>) description;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.Map<String, java.lang.Object>> metadata() {
        return (Optional<java.util.Map<String, java.lang.Object>>) metadata;
    }

    @JsonIgnore
    public String name() {
        return name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> postLogoutRedirectUris() {
        return (Optional<java.util.List<String>>) postLogoutRedirectUris;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> public_() {
        return (Optional<Boolean>) public_;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> redirectUris() {
        return (Optional<java.util.List<String>>) redirectUris;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<String>> scopes() {
        return (Optional<java.util.List<String>>) scopes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> trusted() {
        return (Optional<Boolean>) trusted;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreateClientRequest withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public CreateClientRequest withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    public CreateClientRequest withMetadata(java.util.Map<String, java.lang.Object> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    public CreateClientRequest withMetadata(Optional<? extends java.util.Map<String, java.lang.Object>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    public CreateClientRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public CreateClientRequest withPostLogoutRedirectUris(java.util.List<String> postLogoutRedirectUris) {
        Utils.checkNotNull(postLogoutRedirectUris, "postLogoutRedirectUris");
        this.postLogoutRedirectUris = Optional.ofNullable(postLogoutRedirectUris);
        return this;
    }

    public CreateClientRequest withPostLogoutRedirectUris(Optional<? extends java.util.List<String>> postLogoutRedirectUris) {
        Utils.checkNotNull(postLogoutRedirectUris, "postLogoutRedirectUris");
        this.postLogoutRedirectUris = postLogoutRedirectUris;
        return this;
    }

    public CreateClientRequest withPublic(boolean public_) {
        Utils.checkNotNull(public_, "public_");
        this.public_ = Optional.ofNullable(public_);
        return this;
    }

    public CreateClientRequest withPublic(Optional<? extends Boolean> public_) {
        Utils.checkNotNull(public_, "public_");
        this.public_ = public_;
        return this;
    }

    public CreateClientRequest withRedirectUris(java.util.List<String> redirectUris) {
        Utils.checkNotNull(redirectUris, "redirectUris");
        this.redirectUris = Optional.ofNullable(redirectUris);
        return this;
    }

    public CreateClientRequest withRedirectUris(Optional<? extends java.util.List<String>> redirectUris) {
        Utils.checkNotNull(redirectUris, "redirectUris");
        this.redirectUris = redirectUris;
        return this;
    }

    public CreateClientRequest withScopes(java.util.List<String> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = Optional.ofNullable(scopes);
        return this;
    }

    public CreateClientRequest withScopes(Optional<? extends java.util.List<String>> scopes) {
        Utils.checkNotNull(scopes, "scopes");
        this.scopes = scopes;
        return this;
    }

    public CreateClientRequest withTrusted(boolean trusted) {
        Utils.checkNotNull(trusted, "trusted");
        this.trusted = Optional.ofNullable(trusted);
        return this;
    }

    public CreateClientRequest withTrusted(Optional<? extends Boolean> trusted) {
        Utils.checkNotNull(trusted, "trusted");
        this.trusted = trusted;
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
        CreateClientRequest other = (CreateClientRequest) o;
        return 
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.postLogoutRedirectUris, other.postLogoutRedirectUris) &&
            java.util.Objects.deepEquals(this.public_, other.public_) &&
            java.util.Objects.deepEquals(this.redirectUris, other.redirectUris) &&
            java.util.Objects.deepEquals(this.scopes, other.scopes) &&
            java.util.Objects.deepEquals(this.trusted, other.trusted);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            description,
            metadata,
            name,
            postLogoutRedirectUris,
            public_,
            redirectUris,
            scopes,
            trusted);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateClientRequest.class,
                "description", description,
                "metadata", metadata,
                "name", name,
                "postLogoutRedirectUris", postLogoutRedirectUris,
                "public_", public_,
                "redirectUris", redirectUris,
                "scopes", scopes,
                "trusted", trusted);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> description = Optional.empty();
 
        private Optional<? extends java.util.Map<String, java.lang.Object>> metadata = Optional.empty();
 
        private String name;
 
        private Optional<? extends java.util.List<String>> postLogoutRedirectUris = Optional.empty();
 
        private Optional<? extends Boolean> public_ = Optional.empty();
 
        private Optional<? extends java.util.List<String>> redirectUris = Optional.empty();
 
        private Optional<? extends java.util.List<String>> scopes = Optional.empty();
 
        private Optional<? extends Boolean> trusted = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        public Builder metadata(java.util.Map<String, java.lang.Object> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        public Builder metadata(Optional<? extends java.util.Map<String, java.lang.Object>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder postLogoutRedirectUris(java.util.List<String> postLogoutRedirectUris) {
            Utils.checkNotNull(postLogoutRedirectUris, "postLogoutRedirectUris");
            this.postLogoutRedirectUris = Optional.ofNullable(postLogoutRedirectUris);
            return this;
        }

        public Builder postLogoutRedirectUris(Optional<? extends java.util.List<String>> postLogoutRedirectUris) {
            Utils.checkNotNull(postLogoutRedirectUris, "postLogoutRedirectUris");
            this.postLogoutRedirectUris = postLogoutRedirectUris;
            return this;
        }

        public Builder public_(boolean public_) {
            Utils.checkNotNull(public_, "public_");
            this.public_ = Optional.ofNullable(public_);
            return this;
        }

        public Builder public_(Optional<? extends Boolean> public_) {
            Utils.checkNotNull(public_, "public_");
            this.public_ = public_;
            return this;
        }

        public Builder redirectUris(java.util.List<String> redirectUris) {
            Utils.checkNotNull(redirectUris, "redirectUris");
            this.redirectUris = Optional.ofNullable(redirectUris);
            return this;
        }

        public Builder redirectUris(Optional<? extends java.util.List<String>> redirectUris) {
            Utils.checkNotNull(redirectUris, "redirectUris");
            this.redirectUris = redirectUris;
            return this;
        }

        public Builder scopes(java.util.List<String> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = Optional.ofNullable(scopes);
            return this;
        }

        public Builder scopes(Optional<? extends java.util.List<String>> scopes) {
            Utils.checkNotNull(scopes, "scopes");
            this.scopes = scopes;
            return this;
        }

        public Builder trusted(boolean trusted) {
            Utils.checkNotNull(trusted, "trusted");
            this.trusted = Optional.ofNullable(trusted);
            return this;
        }

        public Builder trusted(Optional<? extends Boolean> trusted) {
            Utils.checkNotNull(trusted, "trusted");
            this.trusted = trusted;
            return this;
        }
        
        public CreateClientRequest build() {
            return new CreateClientRequest(
                description,
                metadata,
                name,
                postLogoutRedirectUris,
                public_,
                redirectUris,
                scopes,
                trusted);
        }
    }
}

