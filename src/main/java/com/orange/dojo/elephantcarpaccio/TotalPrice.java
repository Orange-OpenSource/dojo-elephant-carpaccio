package com.orange.dojo.elephantcarpaccio;

import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
class TotalPrice implements Price {
  float price;
}
