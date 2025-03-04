/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.formance.formance_sdk.models.shared;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

public class GetVersionsResponse {

    @JsonProperty("env")
    private String env;

    @JsonProperty("region")
    private String region;

    @JsonProperty("versions")
    private List<Version> versions;

    @JsonCreator
    public GetVersionsResponse(
            @JsonProperty("env") String env,
            @JsonProperty("region") String region,
            @JsonProperty("versions") List<Version> versions) {
        Utils.checkNotNull(env, "env");
        Utils.checkNotNull(region, "region");
        Utils.checkNotNull(versions, "versions");
        this.env = env;
        this.region = region;
        this.versions = versions;
    }

    @JsonIgnore
    public String env() {
        return env;
    }

    @JsonIgnore
    public String region() {
        return region;
    }

    @JsonIgnore
    public List<Version> versions() {
        return versions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetVersionsResponse withEnv(String env) {
        Utils.checkNotNull(env, "env");
        this.env = env;
        return this;
    }

    public GetVersionsResponse withRegion(String region) {
        Utils.checkNotNull(region, "region");
        this.region = region;
        return this;
    }

    public GetVersionsResponse withVersions(List<Version> versions) {
        Utils.checkNotNull(versions, "versions");
        this.versions = versions;
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
        GetVersionsResponse other = (GetVersionsResponse) o;
        return 
            Objects.deepEquals(this.env, other.env) &&
            Objects.deepEquals(this.region, other.region) &&
            Objects.deepEquals(this.versions, other.versions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            env,
            region,
            versions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetVersionsResponse.class,
                "env", env,
                "region", region,
                "versions", versions);
    }
    
    public final static class Builder {
 
        private String env;
 
        private String region;
 
        private List<Version> versions;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder env(String env) {
            Utils.checkNotNull(env, "env");
            this.env = env;
            return this;
        }

        public Builder region(String region) {
            Utils.checkNotNull(region, "region");
            this.region = region;
            return this;
        }

        public Builder versions(List<Version> versions) {
            Utils.checkNotNull(versions, "versions");
            this.versions = versions;
            return this;
        }
        
        public GetVersionsResponse build() {
            return new GetVersionsResponse(
                env,
                region,
                versions);
        }
    }
}

