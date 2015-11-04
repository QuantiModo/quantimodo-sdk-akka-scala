package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Update (
  /* id */
  id: Option[Int],
  /* user_id */
  userId: Int,
  /* connector_id */
  connectorId: Int,
  /* number_of_measurements */
  numberOfMeasurements: Int,
  /* success */
  success: Boolean,
  /* message */
  message: String,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


