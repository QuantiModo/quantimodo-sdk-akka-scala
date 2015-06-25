package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class ValueObject (
  /* Timestamp for the measurement event in epoch time (unixtime) */
  timestamp: Long,
  /* Measurement value */
  value: Double,
  /* Optional note to include with the measurement */
  note: Option[String])
   extends ApiModel


