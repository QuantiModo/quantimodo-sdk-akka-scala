package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class VariableUserSource (
  /* ID of User */
  userId: Option[Int],
  /* ID of variable */
  variableId: Int,
  /* ID of source */
  sourceId: Int,
  /* Time that this measurement occurred Uses epoch minute (epoch time divided by 60) */
  timestamp: Int,
  /* Earliest measurement time */
  earliestMeasurementTime: Int,
  /* Latest measurement time */
  latestMeasurementTime: Int,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


