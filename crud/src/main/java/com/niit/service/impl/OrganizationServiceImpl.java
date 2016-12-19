package com.niit.service.impl;

import com.niit.dao.OrganizationDAO;
import com.niit.model.Organization;
import com.niit.service.OrganizationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationDAO organizationDAO;

    @Transactional(readOnly = true)
    public List<Organization> listOfOrganizations() {
        return organizationDAO.listOfOrganizations();
    }

    @Transactional
    public void editOrganization(Organization organization) {
        organizationDAO.editOrganization(organization);
    }

    @Transactional
    public void addOrganization(Organization organization) {
        organizationDAO.addOrganization(organization);
    }

    @Transactional
    public void removeOrganization(int id) {
        organizationDAO.removeOrganization(id);
    }

    @Transactional(readOnly = true)
    public Organization getOrganization(int id) {
        Organization organization = organizationDAO.getOrganization(id);
        return organization;
    }
}
