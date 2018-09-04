package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);


    public List<Company> findCompany(final String companyName) throws OrderProcessingException {
        String arg = "%" + companyName + "%";
        List<Company> resultOfSearch;
        LOGGER.info("Searching companies by name: " + arg);
        resultOfSearch = companyDao.findCompanyByFragment(arg);
        if (resultOfSearch.size() == 0) {
            LOGGER.error(OrderProcessingException.ERR_COMPANY_NOT_FOUND);
            throw new OrderProcessingException(OrderProcessingException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("Result of searching");
            resultOfSearch.forEach(company -> LOGGER.info("Company: " + company));
            return resultOfSearch;
        }
    }

    public List<Employee> findEmployee (final String employeeName) throws OrderProcessingException {
        String arg = "%" + employeeName + "%";
        List<Employee> resultOfSearch;
        LOGGER.info("Searching employees by last name: " + arg);
        resultOfSearch = employeeDao.findEmployeeByFragment(arg);
        if (resultOfSearch.size() == 0) {
            LOGGER.error(OrderProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            throw new OrderProcessingException(OrderProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("Result of searching");
            resultOfSearch.forEach(employee -> LOGGER.info("Employee: " + employee));
            return resultOfSearch;
        }

    }
}
