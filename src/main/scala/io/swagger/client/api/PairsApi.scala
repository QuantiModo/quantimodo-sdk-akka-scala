package io.swagger.client.api

import io.swagger.client.model.Pairs
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object PairsApi {

  /**
   * Pairs cause measurements with effect measurements grouped over the duration of action after the onset delay.
   * 
   * Expected answers:
   *   code 200 : Seq[Pairs] (Successful operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param cause Original variable name for the explanatory or independent variable
   * @param causeSource Name of data source that the cause measurements should come from
   * @param causeUnit Abbreviated name for the unit cause measurements to be returned in
   * @param delay Delay before onset of action (in seconds) from the cause variable settings.
   * @param duration Duration of action (in seconds) from the cause variable settings.
   * @param effect Original variable name for the outcome or dependent variable
   * @param effectSource Name of data source that the effectmeasurements should come from
   * @param effectUnit Abbreviated name for the unit effect measurements to be returned in
   * @param endTime The most recent date (in epoch time) for which we should return measurements
   * @param startTime The earliest date (in epoch time) for which we should return measurements
   */
  def pairsGet(cause: String, causeSource: Option[String] = None, causeUnit: Option[String] = None, delay: Option[String] = None, duration: Option[String] = None, effect: String, effectSource: Option[String] = None, effectUnit: Option[String] = None, endTime: Option[String] = None, startTime: Option[String] = None): ApiRequest[Seq[Pairs]] =
    ApiRequest[Seq[Pairs]](ApiMethods.GET, "https://localhost/api", "/pairs", "application/json")
      .withQueryParam("cause", cause)
      .withQueryParam("causeSource", causeSource)
      .withQueryParam("causeUnit", causeUnit)
      .withQueryParam("delay", delay)
      .withQueryParam("duration", duration)
      .withQueryParam("effect", effect)
      .withQueryParam("effectSource", effectSource)
      .withQueryParam("effectUnit", effectUnit)
      .withQueryParam("endTime", endTime)
      .withQueryParam("startTime", startTime)
      .withSuccessResponse[Seq[Pairs]](200)
      .withErrorResponse[Unit](401)
      


}

