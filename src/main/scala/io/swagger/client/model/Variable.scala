package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Variable (
  /* id */
  id: Option[Int],
  /* client_id */
  clientId: Option[String],
  /* parent_id */
  parentId: Option[Int],
  /* Name of the variable */
  name: String,
  /* Category of the variable */
  variableCategoryId: Int,
  /* ID of the default unit of measurement to use for this variable */
  defaultUnitId: Int,
  /* How to combine values of this variable (for instance, to see a summary of the values over a month) 0 for sum OR 1 for mean */
  combinationOperation: Option[String],
  /* filling_value */
  fillingValue: Option[Float],
  /* maximum_allowed_value */
  maximumAllowedValue: Option[Float],
  /* minimum_allowed_value */
  minimumAllowedValue: Option[Float],
  /* onset_delay */
  onsetDelay: Option[Int],
  /* duration_of_action */
  durationOfAction: Option[Int],
  /* public */
  public: Option[Int],
  /* cause_only */
  causeOnly: Option[Boolean],
  /* most_common_value */
  mostCommonValue: Option[Float],
  /* most_common_unit_id */
  mostCommonUnitId: Option[Int],
  /* standard_deviation */
  standardDeviation: Option[Float],
  /* variance */
  variance: Option[Float],
  /* mean */
  mean: Option[Float],
  /* median */
  median: Option[Float],
  /* number_of_measurements */
  numberOfMeasurements: Option[Float],
  /* number_of_unique_values */
  numberOfUniqueValues: Option[Float],
  /* skewness */
  skewness: Option[Float],
  /* kurtosis */
  kurtosis: Option[Float],
  /* status */
  status: Option[String],
  /* error_message */
  errorMessage: Option[String],
  /* last_successful_update_time */
  lastSuccessfulUpdateTime: Option[DateTime],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime],
  /* product_url */
  productUrl: Option[String],
  /* image_url */
  imageUrl: Option[String],
  /* price */
  price: Option[Float],
  /* number_of_user_variables */
  numberOfUserVariables: Option[Int],
  /* outcome */
  outcome: Option[Boolean],
  /* minimum_recorded_value */
  minimumRecordedValue: Option[Float],
  /* maximum_recorded_value */
  maximumRecordedValue: Option[Float])
   extends ApiModel


