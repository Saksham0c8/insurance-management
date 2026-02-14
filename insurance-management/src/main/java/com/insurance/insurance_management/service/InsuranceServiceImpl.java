package com.insurance.insurance_management.service;

import com.insurance.insurance_management.entity.Insurance;
import com.insurance.insurance_management.repository.InsuranceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    private final InsuranceRepository insuranceRepository;

    public InsuranceServiceImpl(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    @Override
    public Insurance createInsurance(Insurance insurance) {
        return insuranceRepository.save(insurance);
    }

    @Override
    public List<Insurance> getAllInsurances() {
        return insuranceRepository.findAll();
    }

    @Override
    public Insurance getInsuranceById(Long id) {
        return insuranceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Insurance not found with id: " + id));
    }

    @Override
    public void deleteInsuranceById(Long id) {
        insuranceRepository.deleteById(id);
    }
}
