package com.orange.dojo.elephantcarpaccio;

import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;

public class TerminalReadInputsTest {

  @Test
  public void the_terminal_reads_the_number_of_items_and_display_it() {
    // given
    Terminal terminal = new Terminal();
    int testModeExpectedInputValue = 3;

    // when
    NumberOfItems numberOfItems = terminal.readNumberOfItems(
            new InputReader("Number of Items", testModeExpectedInputValue));

    // then
    assertThat(numberOfItems).isEqualTo(testModeExpectedInputValue);
  }
}
