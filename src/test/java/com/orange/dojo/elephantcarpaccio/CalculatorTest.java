package com.orange.dojo.elephantcarpaccio;

import com.googlecode.zohhak.api.Coercion;
import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(ZohhakRunner.class)
public class CalculatorTest {

  NumberOfItems numberOfItems = new NumberOfItems(2);
  PricePerItem pricePerItem = new PricePerItem(4.5f);
  Calculator calculator = new Calculator();

  @Test
  public void the_total_price_is_computed_based_on_the_nb_of_items_and_their_price() {
    // given
    // when
    RawPrice rawPrice = calculator.computeRawPrice(numberOfItems, pricePerItem);

    // then
    assertThat(rawPrice).isEqualTo(new RawPrice(9));
  }

  @Coercion
  public float buildTotalPriceFrom(String stringTotalPrice) {
    return Float.parseFloat(stringTotalPrice);
  }

  @TestWith({"UT, 9.616501", "NV, 9.72", "TX, 9.5625", "AL, 9.36", "CA, 9.7425"})
  public void the_total_price_includes_the_state_tax(String stateLetters, float expectedTotalPrice) {
    // given
    StateCode ut = new StateCode(stateLetters);
    RawPrice rawPrice = calculator.computeRawPrice(numberOfItems, pricePerItem);

    // when
    TotalPrice totalPrice = calculator.computeTotalPrice(rawPrice, ut);

    // then
    assertThat(totalPrice).isEqualTo(new TotalPrice(expectedTotalPrice));
  }

  @Test
  public void we_can_apply_a_discount_on_the_raw_price() {
    // given
    RawPrice rawPrice = new RawPrice(100);
    Calculator calculator = new Calculator();

    // when
    DiscountPrice discountPrice = calculator.computePriceWithDiscount(rawPrice);

    // then
    assertThat(discountPrice).isEqualTo(new DiscountPrice(90));
  }
}
