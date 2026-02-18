package com.insurance.insurance_management.controller;

import com.insurance.insurance_management.service.InsuranceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.insurance_management.entity.Insurance;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/insurances")
public class InsuranceController {

    private final InsuranceService insuranceService;

    public InsuranceController(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }
    @PostMapping
    public Insurance createInsurance(@RequestBody Insurance insurance) {
        return insuranceService.createInsurance(insurance);
    }
    @GetMapping
    public List<Insurance> getAllInsurances() {
        return insuranceService.getAllInsurances();
    }
    @GetMapping("/{id}")
    public Insurance getInsuranceById(@PathVariable Long id) {
        return insuranceService.getInsuranceById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteInsurance(@PathVariable Long id) {
        insuranceService.deleteInsuranceById(id);
        return "Insurance deleted with id: " + id;
    }



}

