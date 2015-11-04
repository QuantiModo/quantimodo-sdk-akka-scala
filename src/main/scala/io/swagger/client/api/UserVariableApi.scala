package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_21
import io.swagger.client.model.Inline_response_200_22
import io.swagger.client.model.UserVariable
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UserVariableApi {

  /**
   * Get all UserVariables
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_21 (successful operation)
   * 
   * @param clientId client_id
   * @param variableId variable_id
   * @param defaultUnitId default_unit_id
   * @param minimumAllowedValue minimum_allowed_value
   * @param maximumAllowedValue maximum_allowed_value
   * @param fillingValue filling_value
   * @param joinWith join_with
   * @param onsetDelay onset_delay
   * @param durationOfAction duration_of_action
   * @param variableCategoryId variable_category_id
   * @param updated updated
   * @param public public
   * @param causeOnly cause_only
   * @param fillingType filling_type
   * @param numberOfMeasurements number_of_measurements
   * @param numberOfProcessedMeasurements number_of_processed_measurements
   * @param measurementsAtLastAnalysis measurements_at_last_analysis
   * @param lastUnitId last_unit_id
   * @param lastOriginalUnitId last_original_unit_id
   * @param lastOriginalValue last_original_value
   * @param lastValue last_value
   * @param lastSourceId last_source_id
   * @param numberOfCorrelations number_of_correlations
   * @param status status
   * @param errorMessage error_message
   * @param lastSuccessfulUpdateTime last_successful_update_time
   * @param standardDeviation standard_deviation
   * @param variance variance
   * @param minimumRecordedDailyValue minimum_recorded_daily_value
   * @param maximumRecordedDailyValue maximum_recorded_daily_value
   * @param mean mean
   * @param median median
   * @param mostCommonUnitId most_common_unit_id
   * @param mostCommonValue most_common_value
   * @param numberOfUniqueDailyValues number_of_unique_daily_values
   * @param numberOfChanges number_of_changes
   * @param skewness skewness
   * @param kurtosis kurtosis
   * @param latitude latitude
   * @param longitude longitude
   * @param location location
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param outcome outcome
   * @param sources sources
   * @param earliestSourceTime earliest_source_time
   * @param latestSourceTime latest_source_time
   * @param earliestMeasurementTime earliest_measurement_time
   * @param latestMeasurementTime latest_measurement_time
   * @param earliestFillingTime earliest_filling_time
   * @param latestFillingTime latest_filling_time
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def userVariablesGet(clientId: Option[String] = None, variableId: Option[Int] = None, defaultUnitId: Option[Int] = None, minimumAllowedValue: Option[Double] = None, maximumAllowedValue: Option[Double] = None, fillingValue: Option[Double] = None, joinWith: Option[Int] = None, onsetDelay: Option[Int] = None, durationOfAction: Option[Int] = None, variableCategoryId: Option[Int] = None, updated: Option[Int] = None, public: Option[Int] = None, causeOnly: Option[Boolean] = None, fillingType: Option[String] = None, numberOfMeasurements: Option[Int] = None, numberOfProcessedMeasurements: Option[Int] = None, measurementsAtLastAnalysis: Option[Int] = None, lastUnitId: Option[Int] = None, lastOriginalUnitId: Option[Int] = None, lastOriginalValue: Option[Int] = None, lastValue: Option[Double] = None, lastSourceId: Option[Int] = None, numberOfCorrelations: Option[Int] = None, status: Option[String] = None, errorMessage: Option[String] = None, lastSuccessfulUpdateTime: Option[String] = None, standardDeviation: Option[Double] = None, variance: Option[Double] = None, minimumRecordedDailyValue: Option[Double] = None, maximumRecordedDailyValue: Option[Double] = None, mean: Option[Double] = None, median: Option[Double] = None, mostCommonUnitId: Option[Int] = None, mostCommonValue: Option[Double] = None, numberOfUniqueDailyValues: Option[Double] = None, numberOfChanges: Option[Int] = None, skewness: Option[Double] = None, kurtosis: Option[Double] = None, latitude: Option[Double] = None, longitude: Option[Double] = None, location: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, outcome: Option[Boolean] = None, sources: Option[String] = None, earliestSourceTime: Option[Int] = None, latestSourceTime: Option[Int] = None, earliestMeasurementTime: Option[Int] = None, latestMeasurementTime: Option[Int] = None, earliestFillingTime: Option[Int] = None, latestFillingTime: Option[Int] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_21] =
    ApiRequest[Inline_response_200_21](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/userVariables", "application/json")
      .withQueryParam("client_id", clientId)
      .withQueryParam("variable_id", variableId)
      .withQueryParam("default_unit_id", defaultUnitId)
      .withQueryParam("minimum_allowed_value", minimumAllowedValue)
      .withQueryParam("maximum_allowed_value", maximumAllowedValue)
      .withQueryParam("filling_value", fillingValue)
      .withQueryParam("join_with", joinWith)
      .withQueryParam("onset_delay", onsetDelay)
      .withQueryParam("duration_of_action", durationOfAction)
      .withQueryParam("variable_category_id", variableCategoryId)
      .withQueryParam("updated", updated)
      .withQueryParam("public", public)
      .withQueryParam("cause_only", causeOnly)
      .withQueryParam("filling_type", fillingType)
      .withQueryParam("number_of_measurements", numberOfMeasurements)
      .withQueryParam("number_of_processed_measurements", numberOfProcessedMeasurements)
      .withQueryParam("measurements_at_last_analysis", measurementsAtLastAnalysis)
      .withQueryParam("last_unit_id", lastUnitId)
      .withQueryParam("last_original_unit_id", lastOriginalUnitId)
      .withQueryParam("last_original_value", lastOriginalValue)
      .withQueryParam("last_value", lastValue)
      .withQueryParam("last_source_id", lastSourceId)
      .withQueryParam("number_of_correlations", numberOfCorrelations)
      .withQueryParam("status", status)
      .withQueryParam("error_message", errorMessage)
      .withQueryParam("last_successful_update_time", lastSuccessfulUpdateTime)
      .withQueryParam("standard_deviation", standardDeviation)
      .withQueryParam("variance", variance)
      .withQueryParam("minimum_recorded_daily_value", minimumRecordedDailyValue)
      .withQueryParam("maximum_recorded_daily_value", maximumRecordedDailyValue)
      .withQueryParam("mean", mean)
      .withQueryParam("median", median)
      .withQueryParam("most_common_unit_id", mostCommonUnitId)
      .withQueryParam("most_common_value", mostCommonValue)
      .withQueryParam("number_of_unique_daily_values", numberOfUniqueDailyValues)
      .withQueryParam("number_of_changes", numberOfChanges)
      .withQueryParam("skewness", skewness)
      .withQueryParam("kurtosis", kurtosis)
      .withQueryParam("latitude", latitude)
      .withQueryParam("longitude", longitude)
      .withQueryParam("location", location)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("outcome", outcome)
      .withQueryParam("sources", sources)
      .withQueryParam("earliest_source_time", earliestSourceTime)
      .withQueryParam("latest_source_time", latestSourceTime)
      .withQueryParam("earliest_measurement_time", earliestMeasurementTime)
      .withQueryParam("latest_measurement_time", latestMeasurementTime)
      .withQueryParam("earliest_filling_time", earliestFillingTime)
      .withQueryParam("latest_filling_time", latestFillingTime)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_21](200)
      
  /**
   * Store UserVariable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_22 (successful operation)
   * 
   * @param body UserVariable that should be stored
   */
  def userVariablesPost(body: Option[UserVariable] = None): ApiRequest[Inline_response_200_22] =
    ApiRequest[Inline_response_200_22](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/userVariables", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_22](200)
      
  /**
   * Get UserVariable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_22 (successful operation)
   * 
   * @param id id of UserVariable
   */
  def userVariablesIdGet(id: Int): ApiRequest[Inline_response_200_22] =
    ApiRequest[Inline_response_200_22](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/userVariables/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_22](200)
      
  /**
   * Update UserVariable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of UserVariable
   * @param body UserVariable that should be updated
   */
  def userVariablesIdPut(id: Int, body: Option[UserVariable] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/userVariables/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete UserVariable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of UserVariable
   */
  def userVariablesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/userVariables/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

