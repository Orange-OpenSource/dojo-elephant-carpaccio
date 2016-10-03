package com.orange.dojo.elephantcarpaccio;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.junit.runner.RunWith;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(ZohhakRunner.class)
public class DiscountsTest {

  @TestWith({"999, 0", "1001, 0.03", "4999, 0.03", "5001, 0.05", "6999, 0.05", "7001, 0.07", "9999, 0.07", "10001, 0.10", "49999, 0.10", "50001, 0.15"})
  public void we_get_the_discount_rate_depending_on_input_price(
          float price, float expectedRate) {
    // given
    Discounts discounts = new Discounts();

    // when
    float discountRate = discounts.discountRate(new RawPrice(price));

    // then
    assertThat(discountRate).isEqualTo(expectedRate);
  }
}
