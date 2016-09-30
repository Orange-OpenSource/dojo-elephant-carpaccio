package com.orange.dojo.elephantcarpaccio;

import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;

public class CalculatorTest {

  @Test
  public void the_total_price_is_computed_based_on_the_nb_of_items_and_their_price() {
    // given
    NumberOfItems numberOfItems = new NumberOfItems(2);
    PricePerItem pricePerItem = new PricePerItem(4.5f);
    Calculator calculator = new Calculator();

    // when
    RawPrice rawPrice = calculator.computeRawPrice(numberOfItems, pricePerItem);

    // then
    assertThat(rawPrice).isEqualTo(new RawPrice(9));
  }
}
