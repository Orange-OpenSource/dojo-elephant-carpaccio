package com.orange.dojo.elephantcarpaccio;

import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;

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

  @Test
  // FIXME IMPROVE WITH ZOHHAK
  public void the_total_price_includes_the_state_tax() {
    // given
    StateCode ut = new StateCode("UT");
    RawPrice rawPrice = calculator.computeRawPrice(numberOfItems, pricePerItem);

    // when
    TotalPrice totalPrice = calculator.computeTotalPrice(rawPrice, ut);

    // then
    assertThat(totalPrice).isEqualTo(new TotalPrice(9.616501f));
  }
}
