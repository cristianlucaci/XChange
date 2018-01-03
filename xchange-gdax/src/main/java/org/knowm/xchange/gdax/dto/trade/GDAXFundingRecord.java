package org.knowm.xchange.gdax.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GDAXFundingRecord {
  @JsonProperty("id")
  private String id;
  @JsonProperty("order_id")
  private String orderId;
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("currency")
  private String currency;
  @JsonProperty("account_id")
  private String accountId;
  @JsonProperty("amount")
  private BigDecimal amount;

  public String getId() {
    return id;
  }

  public String getOrderId() {
    return orderId;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public String getCurrency() {
    return currency;
  }

  public String getAccountId() {
    return accountId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "GDAXFundingRecord{" +
        "id='" + id + '\'' +
        ", orderId='" + orderId + '\'' +
        ", createdAt='" + createdAt + '\'' +
        ", currency='" + currency + '\'' +
        ", accountId='" + accountId + '\'' +
        ", amount=" + amount +
        '}';
  }
}
