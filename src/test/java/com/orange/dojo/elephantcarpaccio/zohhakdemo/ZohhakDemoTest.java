package com.orange.dojo.elephantcarpaccio.zohhakdemo;

import com.googlecode.zohhak.api.TestWith;
import com.googlecode.zohhak.api.runners.ZohhakRunner;
import org.junit.runner.RunWith;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(ZohhakRunner.class)
public class ZohhakDemoTest {

  @TestWith({
          "2, 1,   3",
          "3, 5,   8"
  })
  public void should_add_numbers(int addend1, int addend2, int result) {
    assertThat(addend1 + addend2).isEqualTo(result);
  }
}

