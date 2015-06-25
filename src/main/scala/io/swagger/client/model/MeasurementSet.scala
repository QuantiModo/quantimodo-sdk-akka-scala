package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class MeasurementSet (
  /* Array of timestamps, values, and optional notes */
  measurements: Seq[ValueObject],
  /* ORIGINAL name of the variable for which we are creating the measurement records */
  name: String,
  /* Name of the application or device used to record the measurement values */
  source: String,
  /* Variable category name */
  category: Option[String],
  /* Way to aggregate measurements over time. Options are \"MEAN\" or \"SUM\" */
  combinationOperation: Option[MeasurementSetEnums.CombinationOperation],
  /* Unit of measurement */
  unit: String)
   extends ApiModel

object MeasurementSetEnums {

  type CombinationOperation = CombinationOperation.Value
  
  object CombinationOperation extends Enumeration {
    val MEAN = Value("MEAN")
    val SUM = Value("SUM")
  }

  
}

