package org.knowm.xchange.gdax.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GDAXMarginCall {
  @JsonProperty("active")
  private Boolean active;
  @JsonProperty("price")
  private BigDecimal price;
  @JsonProperty("side")
  private String side;
  @JsonProperty("size")
  private BigDecimal size;
  @JsonProperty("funds")
  private BigDecimal funds;

  public Boolean isActive() {
    return active;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public String getSide() {
    return side;
  }

  public BigDecimal getSize() {
    return size;
  }

  public BigDecimal getFunds() {
    return funds;
  }

  @Override
  public String toString() {
    return "GDAXMarginCall{" +
        "active=" + active +
        ", price=" + price +
        ", side='" + side + '\'' +
        ", size=" + size +
        ", funds=" + funds +
        '}';
  }
}
