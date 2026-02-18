package com.insurance.insurance_management.repository;

import com.insurance.insurance_management.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
