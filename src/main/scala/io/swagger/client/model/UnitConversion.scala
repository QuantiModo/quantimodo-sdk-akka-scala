package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class UnitConversion (
  /* unit_id */
  unitId: Int,
  /* step in the conversion process */
  stepNumber: Boolean,
  /* 0 is add and 1 is multiply */
  operation: Boolean,
  /* number used in the operation */
  value: Float,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


