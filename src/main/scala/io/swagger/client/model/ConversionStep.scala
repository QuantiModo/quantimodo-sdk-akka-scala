package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class ConversionStep (
  /*  */
  operation: ConversionStepEnums.Operation,
  /*  */
  value: Double)
   extends ApiModel

object ConversionStepEnums {

  type Operation = Operation.Value
  
  object Operation extends Enumeration {
    val MULTIPLY = Value("MULTIPLY")
    val ADD = Value("ADD")
  }

  
}

