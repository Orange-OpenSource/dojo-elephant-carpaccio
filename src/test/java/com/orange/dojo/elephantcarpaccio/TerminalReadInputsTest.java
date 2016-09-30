package com.orange.dojo.elephantcarpaccio;

import com.sun.xml.internal.xsom.impl.Ref;
import org.junit.Test;

import java.util.OptionalDouble;

import static org.fest.assertions.Assertions.assertThat;

public class TerminalReadInputsTest {

  @Test
  public void the_terminal_reads_the_number_of_items_and_display_it() {
    // given
    Terminal terminal = new Terminal();
    int testModeExpectedInputValue = 3;

    // when
    NumberOfItems numberOfItems = terminal.readNumberOfItems(
            new InputReader(Terminal.NUMBER_OF_ITEMS_INPUT_STRING, OptionalDouble.of(testModeExpectedInputValue)));

    // then
    assertThat(numberOfItems).isEqualTo(new NumberOfItems(testModeExpectedInputValue));
  }

  @Test
  public void the_terminal_reads_the_number_of_items_then_the_price_per_item_and_display_it() {
    // given
    Terminal terminal = new Terminal();
    int expectedNumberOfItems = 3;
    float expectedPricePerItem = 2.54f;

    // when
    NumberOfItems numberOfItems = terminal.readNumberOfItems(
            new InputReader(Terminal.NUMBER_OF_ITEMS_INPUT_STRING, OptionalDouble.of(expectedNumberOfItems)));
    PricePerItem pricePerItem = terminal.readPricePerItem(
            new InputReader(Terminal.PRICE_PER_ITEM_INPUT_STRING, OptionalDouble.of(expectedPricePerItem)));

    // then
    assertThat(numberOfItems).isEqualTo(new NumberOfItems(expectedNumberOfItems));
    assertThat(pricePerItem).isEqualTo(new PricePerItem(expectedPricePerItem));
  }
}
