package com.yaomalang.eagleeye.licenses.controllers;

import com.yaomalang.eagleeye.licenses.models.License;
import com.yaomalang.eagleeye.licenses.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @Autowired
    private BaseService<License> licensingService;

//    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
//    public License getLicense(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId) {
//        return new License()
//                .withLicenseId(licenseId)
//                .withProductName("Teleco")
//                .withLicenseType("Seat")
//                .withOrganizationId(organizationId);
//    }

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public License getLicense(@PathVariable("organizationId") String organizationId, @PathVariable("licenseId") String licenseId) {
        return licensingService.findOneById(licenseId);
    }
}
