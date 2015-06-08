package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class MeasurementRange (
  /* The timestamp of the earliest measurement for a user. */
  lowerLimit: Int,
  /* The timestamp of the most recent measurement for a user. */
  upperLimit: Option[Int])
   extends ApiModel


