package com.orange.dojo.elephantcarpaccio;

import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;

import static com.orange.dojo.elephantcarpaccio.Terminal.STATE_CODE_INPUT_STRING;
import static org.fest.assertions.Assertions.assertThat;

public class TerminalReadInputsTest {

  @Test
  public void the_terminal_reads_the_number_of_items_and_display_it() {
    // given
    Terminal terminal = new Terminal();
    int expectedNumberOfItems = 3;

    // when
    NumberOfItems numberOfItems = terminal.readNumberOfItems(
            new InputNumberReader(Terminal.NUMBER_OF_ITEMS_INPUT_STRING,
                    OptionalDouble.of(expectedNumberOfItems)));

    // then
    assertThat(numberOfItems).isEqualTo(new NumberOfItems(expectedNumberOfItems));
  }

  @Test
  public void the_terminal_reads_the_number_of_items_then_the_price_per_item_and_display_it() {
    // given
    Terminal terminal = new Terminal();
    int expectedNumberOfItems = 3;
    float expectedPricePerItem = 2.54f;

    // when
    NumberOfItems numberOfItems = terminal.readNumberOfItems(
            new InputNumberReader(Terminal.NUMBER_OF_ITEMS_INPUT_STRING,
                    OptionalDouble.of(expectedNumberOfItems)));
    PricePerItem pricePerItem = terminal.readPricePerItem(
            new InputNumberReader(Terminal.PRICE_PER_ITEM_INPUT_STRING,
                    OptionalDouble.of(expectedPricePerItem)));

    // then
    assertThat(numberOfItems).isEqualTo(new NumberOfItems(expectedNumberOfItems));
    assertThat(pricePerItem).isEqualTo(new PricePerItem(expectedPricePerItem));
  }

  @Test
  public void the_terminal_reads_the_state_2_letters_code_and_display_it() {
    // given
    Terminal terminal = new Terminal();
    String expectedStateCode = "UT";

    // when
    StateCode stateCode = terminal.readStateCode(
            new StringInputReader(STATE_CODE_INPUT_STRING, Optional.of(expectedStateCode)));

    // then
    assertThat(stateCode).isEqualTo(new StateCode(expectedStateCode));
  }
}
