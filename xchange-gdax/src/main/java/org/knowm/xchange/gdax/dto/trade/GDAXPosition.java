package org.knowm.xchange.gdax.dto.trade;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GDAXPosition {
  @JsonProperty("type")
  private String type;
  @JsonProperty("size")
  private BigDecimal size;
  @JsonProperty("complement")
  private BigDecimal complement;
  @JsonProperty("max_size")
  private BigDecimal maxSize;

  public String getType() {
    return type;
  }

  public BigDecimal getSize() {
    return size;
  }

  public BigDecimal getComplement() {
    return complement;
  }

  public BigDecimal getMaxSize() {
    return maxSize;
  }

  @Override
  public String toString() {
    return "GDAXPosition{" +
        "type='" + type + '\'' +
        ", size=" + size +
        ", complement=" + complement +
        ", maxSize=" + maxSize +
        '}';
  }
}
