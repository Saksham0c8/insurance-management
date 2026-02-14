package com.insurance.insurance_management.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private InsuranceType insuranceType;

    private BigDecimal premiumAmount;

    @Enumerated(EnumType.STRING)
    private PaymentFrequency paymentFrequency;

    private LocalDate policyStartDate;
    private LocalDate policyEndDate;

    // Link to customer (cannot be null)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Default constructor required by JPA
    protected Insurance() {}

    // Constructor including customer
    public Insurance(InsuranceType insuranceType,
                     BigDecimal premiumAmount,
                     PaymentFrequency paymentFrequency,
                     LocalDate policyStartDate,
                     LocalDate policyEndDate,
                     Customer customer) {
        this.insuranceType = insuranceType;
        this.premiumAmount = premiumAmount;
        this.paymentFrequency = paymentFrequency;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.customer = customer;  // ⚠ important
    }

    // ------------------- Getters and Setters -------------------
    public Long getId() {
        return id;
    }

    public InsuranceType getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(InsuranceType insuranceType) {
        this.insuranceType = insuranceType;
    }

    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(BigDecimal premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public PaymentFrequency getPaymentFrequency() {
        return paymentFrequency;
    }

    public void setPaymentFrequency(PaymentFrequency paymentFrequency) {
        this.paymentFrequency = paymentFrequency;
    }

    public LocalDate getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(LocalDate policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public LocalDate getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(LocalDate policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


