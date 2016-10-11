package com.orange.dojo.examples.lombokvaluedemo;
/*
 * Copyright (C) 2016 Orange
 * Authors: Christophe Maldivi
 *
 * This software is the confidential and proprietary information of Orange.
 * You shall not disclose such confidential information and shall use it only
 * in accordance with the terms of the license agreement you entered into
 * with Orange.
 */

import lombok.Value;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * LOMBOK INSTALLATION: In order to use lombok with a fresh eclipse installation, you need to install Lombok first
 * Instructions: 
 *   1. Go to the lombak jar location and launch 'java -jar lombok-1.16.10.jar' (for lombok 1.16.10)
 *   2. Select your 'eclipse.exe' location and click on 'install'
 *   3. Launch eclipse then update project configuration of the needed project(s)
 */
public class LombokValueDemoTest {

  /**
   * https://projectlombok.org/features/Value.html
   *
   * @Value is the immutable variant of @Data; all fields are made private and
   *        final by default, and setters are not generated. The class itself is
   *        also made final by default, because immutability is not something
   *        that can be forced onto a subclass. Like @Data, useful toString(),
   *        equals() and hashCode() methods are also generated, each field gets
   *        a getter method, and a constructor that covers every argument
   *        (except final fields that are initialized in the field declaration)
   *        is also generated.
   */
  @Value
  class ValueObjectUser {
    String firstname;
    String lastname;
  }

  class User {
  }

  @Test
  public void two_value_objects_can_be_compared_directly_with_lombok_at_value() {
    // Given
    ValueObjectUser user1 = new ValueObjectUser("Jason", "Bourne");
    ValueObjectUser user2 = new ValueObjectUser("Jason", "Bourne");
    ValueObjectUser user3 = new ValueObjectUser("Pamela", "Landy");

    // When
    // Then
    assertThat(user1).isEqualTo(user2);
    assertThat(user1).isNotEqualTo(user3);
  }

  @Test
  public void two_objects_can_not_be_compared_directly() {
    // Given
    User user1 = new User();
    User user2 = new User();

    // When
    // Then
    assertThat(user1).isNotEqualTo(user2);
  }
}
