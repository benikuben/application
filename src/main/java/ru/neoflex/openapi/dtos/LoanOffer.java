package ru.neoflex.openapi.dtos;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Loan offer
 */

@Schema(name = "LoanOffer", description = "Loan offer")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T12:43:58.086982+03:00[Europe/Moscow]")
public class LoanOffer implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long applicationId;

  private java.math.BigDecimal requestedAmount;

  private java.math.BigDecimal totalAmount;

  private Integer term;

  private java.math.BigDecimal monthlyPayment;

  private java.math.BigDecimal rate;

  private Boolean isInsuranceEnabled;

  private Boolean isSalaryClient;

  /**
   * Default constructor
   * @deprecated Use {@link LoanOffer#LoanOffer(Long, java.math.BigDecimal, java.math.BigDecimal, Integer, java.math.BigDecimal, java.math.BigDecimal, Boolean, Boolean)}
   */
  @Deprecated
  public LoanOffer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoanOffer(Long applicationId, java.math.BigDecimal requestedAmount, java.math.BigDecimal totalAmount, Integer term, java.math.BigDecimal monthlyPayment, java.math.BigDecimal rate, Boolean isInsuranceEnabled, Boolean isSalaryClient) {
    this.applicationId = applicationId;
    this.requestedAmount = requestedAmount;
    this.totalAmount = totalAmount;
    this.term = term;
    this.monthlyPayment = monthlyPayment;
    this.rate = rate;
    this.isInsuranceEnabled = isInsuranceEnabled;
    this.isSalaryClient = isSalaryClient;
  }

  public LoanOffer applicationId(Long applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Id of application
   * minimum: 1
   * @return applicationId
  */
  @NotNull @Min(1L) 
  @Schema(name = "applicationId", example = "1", description = "Id of application", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applicationId")
  public Long getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Long applicationId) {
    this.applicationId = applicationId;
  }

  public LoanOffer requestedAmount(java.math.BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
    return this;
  }

  /**
   * Requested loan amount
   * minimum: 10000.0
   * @return requestedAmount
  */
  @NotNull @Valid @DecimalMin("10000.0") 
  @Schema(name = "requestedAmount", example = "10000.0", description = "Requested loan amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedAmount")
  public java.math.BigDecimal getRequestedAmount() {
    return requestedAmount;
  }

  public void setRequestedAmount(java.math.BigDecimal requestedAmount) {
    this.requestedAmount = requestedAmount;
  }

  public LoanOffer totalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Total loan amount
   * minimum: 10000.0
   * @return totalAmount
  */
  @NotNull @Valid @DecimalMin("10000.0") 
  @Schema(name = "totalAmount", example = "10150.0", description = "Total loan amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalAmount")
  public java.math.BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(java.math.BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public LoanOffer term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Loan term
   * minimum: 6
   * @return term
  */
  @NotNull @Min(6) 
  @Schema(name = "term", example = "6", description = "Loan term", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("term")
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public LoanOffer monthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Monthly payment
   * @return monthlyPayment
  */
  @NotNull @Valid 
  @Schema(name = "monthlyPayment", example = "1756.38", description = "Monthly payment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("monthlyPayment")
  public java.math.BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public LoanOffer rate(java.math.BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate
   * @return rate
  */
  @NotNull @Valid 
  @Schema(name = "rate", example = "13", description = "Rate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public java.math.BigDecimal getRate() {
    return rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public LoanOffer isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Is insurance enabled
   * @return isInsuranceEnabled
  */
  @NotNull 
  @Schema(name = "isInsuranceEnabled", example = "true", description = "Is insurance enabled", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isInsuranceEnabled")
  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public LoanOffer isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Is salary client
   * @return isSalaryClient
  */
  @NotNull 
  @Schema(name = "isSalaryClient", example = "true", description = "Is salary client", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isSalaryClient")
  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanOffer loanOffer = (LoanOffer) o;
    return Objects.equals(this.applicationId, loanOffer.applicationId) &&
        Objects.equals(this.requestedAmount, loanOffer.requestedAmount) &&
        Objects.equals(this.totalAmount, loanOffer.totalAmount) &&
        Objects.equals(this.term, loanOffer.term) &&
        Objects.equals(this.monthlyPayment, loanOffer.monthlyPayment) &&
        Objects.equals(this.rate, loanOffer.rate) &&
        Objects.equals(this.isInsuranceEnabled, loanOffer.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, loanOffer.isSalaryClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, requestedAmount, totalAmount, term, monthlyPayment, rate, isInsuranceEnabled, isSalaryClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanOffer {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    requestedAmount: ").append(toIndentedString(requestedAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

