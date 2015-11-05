package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_11
import io.swagger.client.model.MeasurementPost
import java.io.File
import io.swagger.client.model.Inline_response_200_12
import io.swagger.client.model.Measurement
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object MeasurementApi {

  /**
   * Get all Measurements
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_11 (successful operation)
   * 
   * @param userId user_id
   * @param clientId client_id
   * @param connectorId connector_id
   * @param variableId variable_id
   * @param startTime start_time
   * @param value value
   * @param originalValue original_value
   * @param duration duration
   * @param note note
   * @param latitude latitude
   * @param longitude longitude
   * @param location location
   * @param createdAt created_at
   * @param updatedAt updated_at
   * @param error error
   * @param limit limit
   * @param offset offset
   * @param sort sort
   */
  def measurementsGet(userId: Option[Int] = None, clientId: Option[String] = None, connectorId: Option[Int] = None, variableId: Option[Int] = None, startTime: Option[Int] = None, value: Option[Double] = None, originalValue: Option[Double] = None, duration: Option[Int] = None, note: Option[String] = None, latitude: Option[Double] = None, longitude: Option[Double] = None, location: Option[String] = None, createdAt: Option[String] = None, updatedAt: Option[String] = None, error: Option[String] = None, limit: Option[Int] = None, offset: Option[Int] = None, sort: Option[String] = None): ApiRequest[Inline_response_200_11] =
    ApiRequest[Inline_response_200_11](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/measurements", "application/json")
      .withQueryParam("user_id", userId)
      .withQueryParam("client_id", clientId)
      .withQueryParam("connector_id", connectorId)
      .withQueryParam("variable_id", variableId)
      .withQueryParam("start_time", startTime)
      .withQueryParam("value", value)
      .withQueryParam("original_value", originalValue)
      .withQueryParam("duration", duration)
      .withQueryParam("note", note)
      .withQueryParam("latitude", latitude)
      .withQueryParam("longitude", longitude)
      .withQueryParam("location", location)
      .withQueryParam("created_at", createdAt)
      .withQueryParam("updated_at", updatedAt)
      .withQueryParam("error", error)
      .withQueryParam("limit", limit)
      .withQueryParam("offset", offset)
      .withQueryParam("sort", sort)
      .withSuccessResponse[Inline_response_200_11](200)
      
  /**
   * Store Measurement
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_11 (successful operation)
   * 
   * @param body Measurement that should be stored
   */
  def measurementsPost(body: Option[MeasurementPost] = None): ApiRequest[Inline_response_200_11] =
    ApiRequest[Inline_response_200_11](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/measurements", "application/json")
      .withBody(body)
      .withSuccessResponse[Inline_response_200_11](200)
      
  /**
   * Download a CSV containing all user measurements
   * 
   * Expected answers:
   *   code 200 : File (successful operation)
   */
  def measurementsCsvGet(): ApiRequest[File] =
    ApiRequest[File](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/measurements/csv", "application/json")
      .withSuccessResponse[File](200)
      
  /**
   * Use this endpoint to schedule a CSV export containing all user measurements to be emailed to the user within 24 hours.
   * 
   * Expected answers:
   *   code 200 : Int (successful operation)
   */
  def measurementsRequestCsvPost(): ApiRequest[Int] =
    ApiRequest[Int](ApiMethods.POST, "https://app.quantimo.do/api/v2", "/measurements/request_csv", "application/json")
      .withSuccessResponse[Int](200)
      
  /**
   * Get Measurement
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_12 (successful operation)
   * 
   * @param id id of Measurement
   */
  def measurementsIdGet(id: Int): ApiRequest[Inline_response_200_12] =
    ApiRequest[Inline_response_200_12](ApiMethods.GET, "https://app.quantimo.do/api/v2", "/measurements/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_12](200)
      
  /**
   * Update Measurement
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Measurement
   * @param body Measurement that should be updated
   */
  def measurementsIdPut(id: Int, body: Option[Measurement] = None): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.PUT, "https://app.quantimo.do/api/v2", "/measurements/{id}", "application/json")
      .withBody(body)
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      
  /**
   * Delete Measurement
   * 
   * Expected answers:
   *   code 200 : Inline_response_200_2 (successful operation)
   * 
   * @param id id of Measurement
   */
  def measurementsIdDelete(id: Int): ApiRequest[Inline_response_200_2] =
    ApiRequest[Inline_response_200_2](ApiMethods.DELETE, "https://app.quantimo.do/api/v2", "/measurements/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Inline_response_200_2](200)
      


}

