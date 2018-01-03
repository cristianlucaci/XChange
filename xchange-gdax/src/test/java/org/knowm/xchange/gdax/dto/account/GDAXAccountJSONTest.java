package org.knowm.xchange.gdax.dto.account;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GDAXAccountJSONTest {

  @Test
  public void unmarshalTest() throws IOException {

    // Read in the JSON from the example resources
    InputStream is = GDAXAccountJSONTest.class.getResourceAsStream("/account/example-account.json");

    ObjectMapper mapper = new ObjectMapper();
    GDAXAccount account = mapper.readValue(is, GDAXAccount.class);

    // Verify that the example data was unmarshalled correctly
    assertThat(account.getCurrency()).isEqualTo("USD");
    assertThat(account.getId()).isEqualTo("e316cb9a-0808-4fd7-8914-97829c1925de");
    assertThat(account.getBalance()).isEqualTo(new BigDecimal("80.2301373066930000"));
    assertThat(account.getAvailable()).isEqualTo(new BigDecimal("79.2266348066930000"));
    assertThat(account.getHold()).isEqualTo(new BigDecimal("1.0035025000000000"));
    assertThat(account.getProfileId()).isEqualTo("75da88c5-05bf-4f54-bc85-5c775bd68254");
    assertThat(account.isMarginEnabled()).isEqualTo(false);
    assertThat(account.getFundedAmount()).isNull();
    assertThat(account.getDefaultAmount()).isNull();

  }
}