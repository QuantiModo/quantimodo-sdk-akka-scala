package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class MeasurementPost (
  /* variable_id */
  variableId: Int,
  /* source_id */
  sourceId: Int,
  /* unit_id */
  unitId: Int,
  /* measurements */
  measurements: Seq[MeasurementValue])
   extends ApiModel


