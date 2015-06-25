package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class VariableNew (
  /* User-defined variable display name. */
  name: String,
  /* Variable category like Mood, Sleep, Physical Activity, Treatment, Symptom, etc. */
  category: String,
  /* Abbreviated name of the default unit for the variable */
  unit: String,
  /* How to aggregate measurements over time. */
  combinationOperation: VariableNewEnums.CombinationOperation,
  /* Parent */
  parent: String)
   extends ApiModel

object VariableNewEnums {

  type CombinationOperation = CombinationOperation.Value
  
  object CombinationOperation extends Enumeration {
    val MEAN = Value("MEAN")
    val SUM = Value("SUM")
  }

  
}

