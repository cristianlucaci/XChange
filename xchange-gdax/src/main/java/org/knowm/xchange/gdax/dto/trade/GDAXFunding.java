package org.knowm.xchange.gdax.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GDAXFunding {
  @JsonProperty("max_funding_value")
  private BigDecimal maxFundingValue;
  @JsonProperty("funding_value")
  private BigDecimal fundingValue;
  /**
   * oldest_outstanding is the oldest funding record you have outstanding. This is important as funding can only remain outstanding
   * for 27 days and 22 hours before being automatically closed and settled. It is recommended that you manually settle or claim the funding before it expires.
   */
  @JsonProperty("oldest_outstanding")
  private GDAXFundingRecord oldestOutstanding;

  public BigDecimal getMaxFundingValue() {
    return maxFundingValue;
  }

  public BigDecimal getFundingValue() {
    return fundingValue;
  }

  public GDAXFundingRecord getOldestOutstanding() {
    return oldestOutstanding;
  }

  @Override
  public String toString() {
    return "GDAXFunding{" +
        "maxFundingValue=" + maxFundingValue +
        ", fundingValue=" + fundingValue +
        ", oldestOutstanding=" + oldestOutstanding +
        '}';
  }
}
