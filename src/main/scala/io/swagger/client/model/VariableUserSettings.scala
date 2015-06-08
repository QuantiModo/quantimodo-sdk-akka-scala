package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class VariableUserSettings (
  /* User ID */
  user: Int,
  /* Variable DISPLAY name */
  variable: String,
  /* Estimated duration of time following the onset delay in which a stimulus produces a perceivable effect */
  durationOfAction: Int,
  /* fillingValue */
  fillingValue: Int,
  /* joinWith */
  joinWith: String,
  /* maximumValue */
  maximumValue: Float,
  /* minimumValue */
  minimumValue: Float,
  /* name */
  name: String,
  /* onsetDelay */
  onsetDelay: Int,
  /* unit */
  unit: String)
   extends ApiModel


