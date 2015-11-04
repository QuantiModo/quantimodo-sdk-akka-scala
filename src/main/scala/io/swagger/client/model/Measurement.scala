package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Measurement (
  /* id */
  id: Option[Int],
  /* ID of user that owns this measurement */
  userId: Option[Int],
  /* client_id */
  clientId: Option[String],
  /* Connector ID */
  connectorId: Option[Int],
  /* ID of the variable for which we are creating the measurement records */
  variableId: Int,
  /* Application or device used to record the measurement values */
  sourceId: Int,
  /* Start Time for the measurement event in ISO 8601 */
  startTime: Int,
  /* Converted measurement value in requested unit */
  value: Float,
  /* Unit ID of measurement as requested in GET request */
  unitId: Int,
  /* Original value */
  originalValue: Option[Float],
  /* Unit ID of measurement as originally submitted */
  originalUnitId: Option[Int],
  /* duration of measurement in seconds */
  duration: Option[Int],
  /* Note of measurement */
  note: Option[String],
  /* latitude */
  latitude: Option[Float],
  /* longitude */
  longitude: Option[Float],
  /* location */
  location: Option[String],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime],
  /* error */
  error: Option[String])
   extends ApiModel


