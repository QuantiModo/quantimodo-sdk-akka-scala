package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ConnectApi {

  /**
   * Get embeddable connect javascript
   * 
   * Expected answers:
   *   code 200 :  (Embeddable connect javascript was returned)
   *   code 401 :  (User token is missing)
   *   code 403 :  (User token is incorrect)
   * 
   * @param `t` User token
   */
  def v1Connect.jsGet(`t`: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/v1/connect.js", "application/json")
      .withQueryParam("t", `t`)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      
  /**
   * Mobile connect page
   * 
   * Expected answers:
   *   code 200 :  (Mobile connect page was returned)
   *   code 401 :  (User token is missing)
   *   code 403 :  (User token is incorrect)
   * 
   * @param `t` User token
   */
  def v1ConnectMobileGet(`t`: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/v1/connect/mobile", "application/json")
      .withQueryParam("t", `t`)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](403)
      


}

