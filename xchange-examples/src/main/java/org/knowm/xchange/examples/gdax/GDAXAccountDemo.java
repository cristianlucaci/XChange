package org.knowm.xchange.examples.gdax;

import java.io.IOException;
import java.util.Arrays;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeFactory;
import org.knowm.xchange.gdax.GDAXExchange;
import org.knowm.xchange.gdax.dto.account.GDAXAccount;
import org.knowm.xchange.gdax.service.GDAXAccountServiceRaw;
import org.knowm.xchange.service.account.AccountService;

public class GDAXAccountDemo {
  public static void main(String[] args) throws IOException {

    // Use the factory to get GDAX exchange API using default settings
    Exchange exchange = ExchangeFactory.INSTANCE.createExchange(GDAXExchange.class.getName());

    AccountService service = exchange.getAccountService();

    raw((GDAXAccountServiceRaw) service);

  }

  public static void raw(GDAXAccountServiceRaw service) throws IOException {

    GDAXAccount[] accountInfo = service.getGDAXAccountInfo();
    System.out.println(Arrays.toString(accountInfo));

    GDAXAccount margin = service.getGDAXAccountInfo("margin");
    System.out.println(margin);
  }
}
