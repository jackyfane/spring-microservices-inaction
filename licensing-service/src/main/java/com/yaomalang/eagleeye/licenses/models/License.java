package com.yaomalang.eagleeye.licenses.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "licenses")
public class License {

    @Id
    private String licenseId;
    private String prodName;
    private String licenseType;
    private String organizationId;

    public License withLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    public License withProductName(String prodName) {
        this.prodName = prodName;
        return this;
    }

    public License withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    public License withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
}
