package ru.neoflex.openapi.dtos;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Loan application request
 */

@Schema(name = "LoanApplicationRequest", description = "Loan application request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-29T12:43:58.086982+03:00[Europe/Moscow]")
public class LoanApplicationRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  private java.math.BigDecimal amount;

  private Integer term;

  private String firstName;

  private String lastName;

  private String middleName;

  private String email;

  @ru.neoflex.application.util.validators.OverEighteenYearsOld @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class) @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
  private LocalDate birthdate = null;

  private String passportSeries;

  private String passportNumber;

  /**
   * Default constructor
   * @deprecated Use {@link LoanApplicationRequest#LoanApplicationRequest(java.math.BigDecimal, Integer, String, String, String, LocalDate, String, String)}
   */
  @Deprecated
  public LoanApplicationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LoanApplicationRequest(java.math.BigDecimal amount, Integer term, String firstName, String lastName, String email, LocalDate birthdate, String passportSeries, String passportNumber) {
    this.amount = amount;
    this.term = term;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.birthdate = birthdate;
    this.passportSeries = passportSeries;
    this.passportNumber = passportNumber;
  }

  public LoanApplicationRequest amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Loan amount
   * minimum: 10000.0
   * @return amount
  */
  @NotNull @Valid @DecimalMin("10000.0") 
  @Schema(name = "amount", example = "10000.0", description = "Loan amount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("amount")
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public LoanApplicationRequest term(Integer term) {
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

  public LoanApplicationRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
  */
  @NotNull @Pattern(regexp = "^[A-Za-z]{2,30}$", message="должно быть длиной от 2 до 30 латинских букв") 
  @Schema(name = "firstName", example = "Ivan", description = "First name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public LoanApplicationRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
  */
  @NotNull @Pattern(regexp = "^[A-Za-z]{2,30}$", message="должно быть длиной от 2 до 30 латинских букв") 
  @Schema(name = "lastName", example = "Ivanov", description = "Last name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LoanApplicationRequest middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name
   * @return middleName
  */
  @Pattern(regexp = "^[A-Za-z]{2,30}$", message="должно быть длиной от 2 до 30 латинских букв") 
  @Schema(name = "middleName", example = "Ivanovich", description = "Middle name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public LoanApplicationRequest email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email
   * @return email
  */
  @NotNull @Pattern(regexp = "^[\\w.]{2,50}@[\\w.]{2,20}$", message="должен быть введен корректный email") 
  @Schema(name = "email", example = "ivan@mail.ru", description = "Email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoanApplicationRequest birthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Get birthdate
   * @return birthdate
  */
  @NotNull @Valid 
  @Schema(name = "birthdate", example = "2000-01-01", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("birthdate")
  public LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public LoanApplicationRequest passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Passport series
   * @return passportSeries
  */
  @NotNull @Pattern(regexp = "^[0-9]{4}$", message="должно содержать 4 цифры") 
  @Schema(name = "passportSeries", example = "1234", description = "Passport series", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passportSeries")
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public LoanApplicationRequest passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Passport number
   * @return passportNumber
  */
  @NotNull @Pattern(regexp = "^[0-9]{6}$", message="должно содержать 6 цифр") 
  @Schema(name = "passportNumber", example = "123456", description = "Passport number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("passportNumber")
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanApplicationRequest loanApplicationRequest = (LoanApplicationRequest) o;
    return Objects.equals(this.amount, loanApplicationRequest.amount) &&
        Objects.equals(this.term, loanApplicationRequest.term) &&
        Objects.equals(this.firstName, loanApplicationRequest.firstName) &&
        Objects.equals(this.lastName, loanApplicationRequest.lastName) &&
        Objects.equals(this.middleName, loanApplicationRequest.middleName) &&
        Objects.equals(this.email, loanApplicationRequest.email) &&
        Objects.equals(this.birthdate, loanApplicationRequest.birthdate) &&
        Objects.equals(this.passportSeries, loanApplicationRequest.passportSeries) &&
        Objects.equals(this.passportNumber, loanApplicationRequest.passportNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, firstName, lastName, middleName, email, birthdate, passportSeries, passportNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanApplicationRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

