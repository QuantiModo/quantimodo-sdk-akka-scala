package io.swagger.client.api

import io.swagger.client.model.MeasurementSource
import io.swagger.client.model.Measurement
import io.swagger.client.model.MeasurementSet
import io.swagger.client.model.MeasurementRange
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object MeasurementsApi {

  /**
   * Returns a list of all the apps from which measurement data is obtained.
   * 
   * Expected answers:
   *   code 200 : MeasurementSource (Successful operation)
   *   code 401 :  (Not Authenticated)
   */
  def measurementSourcesGet(): ApiRequest[MeasurementSource] =
    ApiRequest[MeasurementSource](ApiMethods.GET, "https://localhost/api", "/measurementSources", "application/json")
      .withSuccessResponse[MeasurementSource](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Add a life-tracking app or device to the QuantiModo list of data sources.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   * 
   * @param name An array of names of data sources you want to add.
   */
  def measurementSourcesPost(name: MeasurementSource): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://localhost/api", "/measurementSources", "application/json")
      .withBody(name)
      .withErrorResponse[Unit](401)
      
  /**
   * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.
   * 
   * Expected answers:
   *   code 200 : Measurement (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param variableName Name of the variable you want measurements for
   * @param unit The unit your want the measurements in
   * @param startTime The lower limit of measurements returned (Epoch)
   * @param endTime The upper limit of measurements returned (Epoch)
   * @param groupingWidth The time (in seconds) over which measurements are grouped together
   * @param groupingTimezone The time (in seconds) over which measurements are grouped together
   */
  def measurementsGet(variableName: String, unit: Option[String] = None, startTime: Option[String] = None, endTime: Option[String] = None, groupingWidth: Option[Int] = None, groupingTimezone: Option[String] = None): ApiRequest[Measurement] =
    ApiRequest[Measurement](ApiMethods.GET, "https://localhost/api", "/measurements", "application/json")
      .withQueryParam("variableName", variableName)
      .withQueryParam("unit", unit)
      .withQueryParam("startTime", startTime)
      .withQueryParam("endTime", endTime)
      .withQueryParam("groupingWidth", groupingWidth)
      .withQueryParam("groupingTimezone", groupingTimezone)
      .withSuccessResponse[Measurement](200)
      .withErrorResponse[Unit](401)
      
  /**
   * You can submit or update multiple measurements in a \&quot;measurements\&quot; sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.  The request body should look something like [{\&quot;measurements\&quot;:[{\&quot;timestamp\&quot;:1406419860,\&quot;value\&quot;:\&quot;1\&quot;,\&quot;note\&quot;:\&quot;I am a note about back pain.\&quot;},{\&quot;timestamp\&quot;:1406519865,\&quot;value\&quot;:\&quot;3\&quot;,\&quot;note\&quot;:\&quot;I am another note about back pain.\&quot;}],\&quot;name\&quot;:\&quot;Back Pain\&quot;,\&quot;source\&quot;:\&quot;QuantiModo\&quot;,\&quot;category\&quot;:\&quot;Symptoms\&quot;,\&quot;combinationOperation\&quot;:\&quot;MEAN\&quot;,\&quot;unit\&quot;:\&quot;/5\&quot;}]
   * 
   * Expected answers:
   *   code 200 :  (Measurements successfully stored)
   *   code 401 :  (Not Authenticated)
   * 
   * @param measurements An array of measurements you want to insert.
   */
  def measurementsV2Post(measurements: MeasurementSet): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://localhost/api", "/measurements/v2", "application/json")
      .withBody(measurements)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Get Unix time-stamp (epoch time) of the user&#39;s first and last measurements taken.
   * 
   * Expected answers:
   *   code 200 : MeasurementRange (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param sources Enter source name to limit to specific source (varchar)
   * @param user If not specified, uses currently logged in user (bigint)
   */
  def measurementsRangeGet(sources: Option[String] = None, user: Option[Int] = None): ApiRequest[MeasurementRange] =
    ApiRequest[MeasurementRange](ApiMethods.GET, "https://localhost/api", "/measurementsRange", "application/json")
      .withQueryParam("sources", sources)
      .withQueryParam("user", user)
      .withSuccessResponse[MeasurementRange](200)
      .withErrorResponse[Unit](401)
      


}

