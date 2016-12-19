package com.niit.service;

import java.util.List;

import com.niit.model.Organization;

public interface OrganizationService {
    List<Organization> listOfOrganizations();
    void editOrganization(Organization organization);
    void addOrganization(Organization organization);
    void removeOrganization(int id);
    Organization getOrganization(int id);
}
