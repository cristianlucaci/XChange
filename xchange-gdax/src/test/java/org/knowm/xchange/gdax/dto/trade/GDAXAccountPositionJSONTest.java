package org.knowm.xchange.gdax.dto.trade;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Map;

import org.junit.Test;
import org.knowm.xchange.gdax.dto.account.GDAXAccount;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GDAXAccountPositionJSONTest {

  @Test
  public void unmarshalTest() throws IOException {

    // Read in the JSON from the example resources
    InputStream is = GDAXAccountPositionJSONTest.class.getResourceAsStream("/trade/example-position.json");

    ObjectMapper mapper = new ObjectMapper();
    GDAXAccountPosition account = mapper.readValue(is, GDAXAccountPosition.class);

    // Verify that the example data was unmarshalled correctly
    assertThat(account.getStatus()).isEqualTo("active");
    assertThat(account.getUserId()).isEqualTo("521c20b3d4ab09621f000011");
    assertThat(account.getProfileId()).isEqualTo("d881e5a6-58eb-47cd-b8e2-8d9f2e3ec6f6");
    assertThat(account.getProductId()).isEqualTo("BTC-USD");

    GDAXFunding funding = account.getFunding();
    assertThat(funding.getMaxFundingValue()).isEqualTo(new BigDecimal(10000));
    assertThat(funding.getFundingValue()).isEqualTo(new BigDecimal("622.48199522418175"));
    GDAXFundingRecord oldestOutstanding = funding.getOldestOutstanding();
    assertThat(oldestOutstanding.getId()).isEqualTo("280c0a56-f2fa-4d3b-a199-92df76fff5cd");
    assertThat(oldestOutstanding.getOrderId()).isEqualTo("280c0a56-f2fa-4d3b-a199-92df76fff5cd");
    assertThat(oldestOutstanding.getCreatedAt()).isEqualTo("2017-03-18T00:34:34.270484Z");
    assertThat(oldestOutstanding.getCurrency()).isEqualTo("USD");
    assertThat(oldestOutstanding.getAccountId()).isEqualTo("202af5e9-1ac0-4888-bdf5-15599ae207e2");
    assertThat(oldestOutstanding.getAmount()).isEqualTo(new BigDecimal("545.2400000000000000"));

    Map<String, GDAXAccount> accounts = account.getAccounts();
    assertThat(accounts.size()).isEqualTo(2);
    GDAXAccount usdAccount = accounts.get("USD");
    assertThat(usdAccount.getId()).isEqualTo("202af5e9-1ac0-4888-bdf5-15599ae207e2");
    assertThat(usdAccount.getBalance()).isEqualTo(new BigDecimal("0.0000000000000000"));
    assertThat(usdAccount.getHold()).isEqualTo(new BigDecimal("0.0000000000000000"));
    assertThat(usdAccount.getFundedAmount()).isEqualTo(new BigDecimal("622.4819952241817500"));
    assertThat(usdAccount.getDefaultAmount()).isEqualTo(BigDecimal.ZERO);

    GDAXAccount btcAccount = accounts.get("BTC");
    assertThat(btcAccount.getId()).isEqualTo("1f690a52-d557-41b5-b834-e39eb10d7df0");
    assertThat(btcAccount.getBalance()).isEqualTo(new BigDecimal("4.7051564815292853"));
    assertThat(btcAccount.getHold()).isEqualTo(new BigDecimal("0.6000000000000000"));
    assertThat(btcAccount.getFundedAmount()).isEqualTo(new BigDecimal("0.0000000000000000"));
    assertThat(btcAccount.getDefaultAmount()).isEqualTo(BigDecimal.ZERO);

    GDAXMarginCall marginCall = account.getMarginCall();
    assertThat(marginCall.getSide()).isEqualTo("sell");
    assertThat(marginCall.isActive()).isEqualTo(true);
    assertThat(marginCall.getPrice()).isEqualTo(new BigDecimal("175.96000000"));
    assertThat(marginCall.getSize()).isEqualTo(new BigDecimal("4.70515648"));
    assertThat(marginCall.getFunds()).isEqualTo(new BigDecimal("624.04210048"));

    GDAXPosition position = account.getPosition();
    assertThat(position.getType()).isEqualTo("long");
    assertThat(position.getComplement()).isEqualTo(new BigDecimal("-641.91999958602800000000000000"));
    assertThat(position.getSize()).isEqualTo(new BigDecimal("0.59968368"));
    assertThat(position.getMaxSize()).isEqualTo(new BigDecimal("1.49000000"));

  }
}