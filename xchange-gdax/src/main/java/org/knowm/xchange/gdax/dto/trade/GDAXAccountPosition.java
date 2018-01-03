package org.knowm.xchange.gdax.dto.trade;

import java.util.Map;

import org.knowm.xchange.gdax.dto.account.GDAXAccount;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An overview of your profile.
 */
public class GDAXAccountPosition {

  @JsonProperty("status")
  private String status;
  @JsonProperty("funding")
  private GDAXFunding funding;
  @JsonProperty("accounts")
  private Map<String, GDAXAccount> accounts;
  @JsonProperty("margin_call")
  private GDAXMarginCall marginCall;
  @JsonProperty("user_id")
  private String userId;
  @JsonProperty("profile_id")
  private String profileId;
  @JsonProperty("product_id")
  private String productId;
  @JsonProperty("position")
  private GDAXPosition position;

  public String getStatus() {
    return status;
  }

  public GDAXFunding getFunding() {
    return funding;
  }

  public Map<String, GDAXAccount> getAccounts() {
    return accounts;
  }

  public GDAXMarginCall getMarginCall() {
    return marginCall;
  }

  public String getUserId() {
    return userId;
  }

  public String getProfileId() {
    return profileId;
  }

  public String getProductId() {
    return productId;
  }

  public GDAXPosition getPosition() {
    return position;
  }

  @Override
  public String toString() {
    return "GDAXAccountPosition{" +
        "status='" + status + '\'' +
        ", funding=" + funding +
        ", accounts=" + accounts +
        ", marginCall=" + marginCall +
        ", userId='" + userId + '\'' +
        ", profileId='" + profileId + '\'' +
        ", productId='" + productId + '\'' +
        ", position=" + position +
        '}';
  }
}
