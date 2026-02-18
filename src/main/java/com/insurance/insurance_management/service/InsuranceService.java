package com.insurance.insurance_management.service;

import com.insurance.insurance_management.entity.Insurance;

import java.util.List;

public interface InsuranceService {

    Insurance createInsurance(Insurance insurance);

    List<Insurance> getAllInsurances();

    Insurance getInsuranceById(Long id);

    void deleteInsuranceById(Long id);
}
