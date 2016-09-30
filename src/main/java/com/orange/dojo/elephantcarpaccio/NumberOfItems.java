package com.orange.dojo.elephantcarpaccio;

import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
class NumberOfItems {
  int val;
}
