package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class VariableCategory (
  /* id */
  id: Option[Int],
  /* Name of the category */
  name: String,
  /* Value for replacing null measurements */
  fillingValue: Option[Float],
  /* Maximum recorded value of this category */
  maximumAllowedValue: Option[Float],
  /* Minimum recorded value of this category */
  minimumAllowedValue: Option[Float],
  /* How long the effect of a measurement in this variable lasts */
  durationOfAction: Option[Int],
  /* How long it takes for a measurement in this variable to take effect */
  onsetDelay: Option[Int],
  /* How to combine values of this variable (for instance, to see a summary of the values over a month) 0 for sum OR 1 for mean */
  combinationOperation: Option[String],
  /* updated */
  updated: Option[Int],
  /* A value of 1 indicates that this category is generally a cause in a causal relationship.  An example of a causeOnly category would be a category such as Work which would generally not be influenced by the behaviour of the user */
  causeOnly: Option[Boolean],
  /* Is category public */
  public: Option[Int],
  /* outcome */
  outcome: Option[Boolean],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime],
  /* Image URL */
  imageUrl: Option[String],
  /* ID of the default unit for the category */
  defaultUnitId: Option[Int])
   extends ApiModel


