package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Measurement (
  /* ORIGINAL Name of the variable for which we are creating the measurement records */
  variable: String,
  /* Application or device used to record the measurement values */
  source: String,
  /* Timestamp for the measurement event in epoch time */
  timestamp: Long,
  /* Converted measurement value in requested unit */
  value: Double,
  /* Unit of measurement as requested in GET request */
  unit: String,
  /* Measurement value in the unit as orignally submitted */
  storedValue: Option[Double],
  /* Unit of measurement as originally submitted */
  storedUnit: Option[String])
   extends ApiModel


