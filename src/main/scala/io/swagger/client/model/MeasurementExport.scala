package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class MeasurementExport (
  /* id */
  id: Option[Int],
  /* ID of User */
  userId: Option[Int],
  /* Status of Measurement Export */
  status: Option[String],
  /* Error message */
  errorMessage: Option[String],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


