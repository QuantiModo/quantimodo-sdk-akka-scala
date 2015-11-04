package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Unit (
  /* id */
  id: Option[Int],
  /* client_id */
  clientId: Option[String],
  /* Unit name */
  name: String,
  /* Unit abbreviation */
  abbreviatedName: String,
  /* Unit category ID */
  categoryId: Int,
  /* Unit minimum value */
  minimumValue: Option[Float],
  /* Unit maximum value */
  maximumValue: Option[Float],
  /* updated */
  updated: Option[Int],
  /* ID of default unit */
  defaultUnitId: Option[Int],
  /* Value multiplied to */
  multiply: Option[Float],
  /* Value which should be added to convert to default unit */
  add: Option[Float],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


