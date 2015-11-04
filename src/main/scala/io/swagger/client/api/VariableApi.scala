package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_27
import io.swagger.client.model.Variable
import io.swagger.client.model.Inline_response_200_28
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object VariableApi {

  /**
   * Get all Variables
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_27 (successful operation)
   * 
   * @param id id
   * @param clientId client_id
   * @param parentId parent_id
   * @param name name
   * @param variableCategoryId variable_category_id
   * @param defaultUnitId default_unit_id
   * @param combinationOperation combination_operation
   * @param fillingValue filling_value
   * @param maximumAllowedValue maximum_allowed_value
   * @param minimumAllowedValue minimum_allowed_value
   * @param onsetDelay onset_delay
   * @param durationOfAction duration_of_action
   * @param public public
   * @param causeOnly cause_only
   * @param mostCommonValue most_common_value
   * @param mostCommonUnitId most_common_unit_id
   * @param standardDeviation standard_deviation
   * @param variance variance
   * @param mean mean
   * @param median median
   * @param numberOfMeasurements number_of_measurements
   * @param numberOfUniqueValues number_of_unique_values
   * @param skewness skewness
   * @param kurtosis kurtosis
   * @param latitude latitude
   * @param longitude longitude
   * @param location location
   * @param status status
   * @param errorMessage error_message
   * @param lastSuccessfulUpdateTime last_successful_update_time
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param productUrl product_url
   * @param imageUrl image_url
   * @param price price
   * @param numberOfUserVariables number_of_user_variables
   * @param outcome outcome
   * @param minimumRecordedValue minimum_recorded_value
   * @param maximumRecordedValue maximum_recorded_value
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def variablesGet(id: Option[Int] = None, clientId: Option[String] = None, parentId: Option[Int] = None, name: Option[String] = None, variableCategoryId: Option[Int] = None, defaultUnitId: Option[Int] = None, combinationOperation: Option[String] = None, fillingValue: Option[Double] = None, maximumAllowedValue: Option[Double] = None, minimumAllowedValue: Option[Double] = None, onsetDelay: Option[Int] = None, durationOfAction: Option[Int] = None, public: Option[Int] = None, causeOnly: Option[Boolean] = None, mostCommonValue: Option[Double] = None, mostCommonUnitId: Option[Int] = None, standardDeviation: Option[Double] = None, variance: Option[Double] = None, mean: Option[Double] = None, median: Option[Double] = None, numberOfMeasurements: Option[Double] = None, numberOfUniqueValues: Option[Double] = None, skewness: Option[Double] = None, kurtosis: Option[Double] = None, latitude: Option[Double] = None, longitude: Option[Double] = None, location: Option[String] = None, status: Option[String] = None, errorMessage: Option[String] = None, lastSuccessfulUpdateTime: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, productUrl: Option[String] = None, imageUrl: Option[String] = None, price: Option[Double] = None, numberOfUserVariables: Option[Int] = None, outcome: Option[Boolean] = None, minimumRecordedValue: Option[Double] = None, maximumRecordedValue: Option[Double] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_27] =
    ApiRequest[Inline_response_200_27](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/variables", "application/json")
      .withQueryParam("id", id)
      .withQueryParam("client_id", clientId)
      .withQueryParam("parent_id", parentId)
      .withQueryParam("name", name)
      .withQueryParam("variable_category_id", variableCategoryId)
      .withQueryParam("default_unit_id", defaultUnitId)
      .withQueryParam("combination_operation", combinationOperation)
      .withQueryParam("filling_value", fillingValue)
      .withQueryParam("maximum_allowed_value", maximumAllowedValue)
      .withQueryParam("minimum_allowed_value", minimumAllowedValue)
      .withQueryParam("onset_delay", onsetDelay)
      .withQueryParam("duration_of_action", durationOfAction)
      .withQueryParam("public", public)
      .withQueryParam("cause_only", causeOnly)
      .withQueryParam("most_common_value", mostCommonValue)
      .withQueryParam("most_common_unit_id", mostCommonUnitId)
      .withQueryParam("standard_deviation", standardDeviation)
      .withQueryParam("variance", variance)
      .withQueryParam("mean", mean)
      .withQueryParam("median", median)
      .withQueryParam("number_of_measurements", numberOfMeasurements)
      .withQueryParam("number_of_unique_values", numberOfUniqueValues)
      .withQueryParam("skewness", skewness)
      .withQueryParam("kurtosis", kurtosis)
      .withQueryParam("latitude", latitude)
      .withQueryParam("longitude", longitude)
      .withQueryParam("location", location)
      .withQueryParam("status", status)
      .withQueryParam("error_message", errorMessage)
      .withQueryParam("last_successful_update_time", lastSuccessfulUpdateTime)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("product_url", productUrl)
      .withQueryParam("image_url", imageUrl)
      .withQueryParam("price", price)
      .withQueryParam("number_of_user_variables", numberOfUserVariables)
      .withQueryParam("outcome", outcome)
      .withQueryParam("minimum_recorded_value", minimumRecordedValue)
      .withQueryParam("maximum_recorded_value", maximumRecordedValue)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_27](200)
      
  /**
   * Store Variable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_28 (successful operation)
   * 
   * @param body Variable that should be stored
   */
  def variablesPost(body: Option[Variable] = None): ApiRequest[Inline_response_200_28] =
    ApiRequest[Inline_response_200_28](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/variables", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_28](200)
      
  /**
   * Get Variable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_28 (successful operation)
   * 
   * @param id id of Variable
   */
  def variablesIdGet(id: Int): ApiRequest[Inline_response_200_28] =
    ApiRequest[Inline_response_200_28](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/variables/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_28](200)
      
  /**
   * Update Variable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Variable
   * @param body Variable that should be updated
   */
  def variablesIdPut(id: Int, body: Option[Variable] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/variables/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Variable
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Variable
   */
  def variablesIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/variables/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

