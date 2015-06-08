package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Unit (
  /* Unit name */
  name: String,
  /* Unit abbreviation */
  abbreviatedName: String,
  /* Unit category */
  category: UnitEnums.Category,
  /* Unit minimum value */
  minimum: Double,
  /* Unit maximum value */
  maximum: Double,
  /* Conversion steps list */
  conversionSteps: Seq[ConversionStep])
   extends ApiModel

object UnitEnums {

  type Category = Category.Value
  
  object Category extends Enumeration {
    val Distance = Value("Distance")
    val Duration = Value("Duration")
    val Energy = Value("Energy")
    val Frequency = Value("Frequency")
    val Miscellany = Value("Miscellany")
    val Pressure = Value("Pressure")
    val Proportion = Value("Proportion")
    val Rating = Value("Rating")
    val Temperature = Value("Temperature")
    val Volume = Value("Volume")
    val Weight = Value("Weight")
  }

  
}

