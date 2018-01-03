package org.knowm.xchange.gdax.dto.account;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GDAXAccount {
  private final String id;
  private final String currency;
  private final String profile_id;
  private final BigDecimal balance;
  private final BigDecimal hold;
  private final BigDecimal available;
  private final boolean marginEnabled;
  private final BigDecimal fundedAmount;
  private final BigDecimal defaultAmount;

  public GDAXAccount(@JsonProperty("id") String id, @JsonProperty("currency") String currency, @JsonProperty("profile_id") String profile_id,
      @JsonProperty("balance") BigDecimal balance, @JsonProperty("hold") BigDecimal hold, @JsonProperty("available") BigDecimal available,
      @JsonProperty("margin_enabled") boolean marginEnabled, @JsonProperty("funded_amount") BigDecimal fundedAmount,
      @JsonProperty("default_amount") BigDecimal defaultAmount) {
    this.id = id;
    this.currency = currency;
    this.profile_id = profile_id;
    this.balance = balance;
    this.hold = hold;
    this.available = available;
    this.marginEnabled = marginEnabled;
    this.fundedAmount = fundedAmount;
    this.defaultAmount = defaultAmount;
  }

  public String getId() {
    return id;
  }

  public String getCurrency() {
    return currency;
  }

  public String getProfileId() {
    return profile_id;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public BigDecimal getHold() {
    return hold;
  }

  public BigDecimal getAvailable() {
    return available;
  }

  public boolean isMarginEnabled() {
    return marginEnabled;
  }

  public BigDecimal getFundedAmount() {
    return fundedAmount;
  }

  public BigDecimal getDefaultAmount() {
    return defaultAmount;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("CoinbaseExAccount [id=");
    builder.append(id);
    builder.append(", currency=");
    builder.append(currency);
    builder.append(", profile_id=");
    builder.append(profile_id);
    builder.append(", balance=");
    builder.append(balance);
    builder.append(", hold=");
    builder.append(hold);
    builder.append(", available=");
    builder.append(available);
    builder.append(", marginEnabled=");
    builder.append(marginEnabled);
    builder.append(", fundedAmount=");
    builder.append(fundedAmount);
    builder.append(", defaultAmount=");
    builder.append(defaultAmount);
    builder.append("]");
    return builder.toString();
  }
}
