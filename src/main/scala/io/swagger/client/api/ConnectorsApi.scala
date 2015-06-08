package io.swagger.client.api

import io.swagger.client.model.Connector
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ConnectorsApi {

  /**
   * Returns a list of all available connectors. A connector pulls data from other data providers using their API or a screenscraper.
   * 
   * Expected answers:
   *   code 200 : Seq[Connector] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   */
  def connectorsListGet(): ApiRequest[Seq[Connector]] =
    ApiRequest[Seq[Connector]](ApiMethods.GET, "https://localhost/api", "/connectors/list", "application/json")
      .withSuccessResponse[Seq[Connector]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Attempt to obtain a token from the data provider, store it in the database. With this, the connector to continue to obtain new user data until the token is revoked.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Method not found. Could not execute the requested method.)
   *   code 500 :  (Error during update. Unsupported response from update().)
   * 
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   */
  def connectorsConnectorConnectGet(connector: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/connectors/{connector}/connect", "application/json")
      .withPathParam("connector", connector)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
      
  /**
   * Returns instructions that describe what parameters and endpoint to use to connect to the given data provider.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Method not found. Could not execute the requested method.)
   *   code 500 :  (Error during update. Unsupported response from update().)
   * 
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   */
  def connectorsConnectorConnectInstructionsGet(connector: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/connectors/{connector}/connectInstructions", "application/json")
      .withPathParam("connector", connector)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
      
  /**
   * The disconnect method deletes any stored tokens or connection information from the connectors database.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Method not found. Could not execute the requested method.)
   *   code 500 :  (Error during update. Unsupported response from update().)
   * 
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   */
  def connectorsConnectorDisconnectGet(connector: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/connectors/{connector}/disconnect", "application/json")
      .withPathParam("connector", connector)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
      
  /**
   * Returns information about the connector such as the connector id, whether or not is connected for this user (i.e. we have a token or credentials), and its update history for the user.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Method not found. Could not execute the requested method.)
   *   code 500 :  (Error during update. Please contact info@quantimo.do.)
   * 
   * @param connector Lowercase system name of the source application or device. Get a list of available connectors from the /connectors/list endpoint.
   */
  def connectorsConnectorInfoGet(connector: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/connectors/{connector}/info", "application/json")
      .withPathParam("connector", connector)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
      
  /**
   * The update method tells the QM Connector Framework to check with the data provider (such as Fitbit or MyFitnessPal) and retrieve any new measurements available.
   * 
   * Expected answers:
   *   code 401 :  (Not Authenticated)
   *   code 404 :  (Method not found. Could not execute the requested method.)
   *   code 500 :  (Error during update. Unsupported response from update().)
   * 
   * @param connector Lowercase system name of the source application or device
   */
  def connectorsConnectorUpdateGet(connector: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/connectors/{connector}/update", "application/json")
      .withPathParam("connector", connector)
      .withErrorResponse[Unit](401)
      .withErrorResponse[Unit](404)
      .withErrorResponse[Unit](500)
      


}

