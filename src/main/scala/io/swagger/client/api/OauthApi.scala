package io.swagger.client.api

import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object OauthApi {

  /**
   * Client provides authorization token obtained from /api/oauth2/authorize to this endpoint and receives an access token. Access token can then be used to query different API endpoints of QuantiModo.
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param clientId Client id
   * @param clientSecret Client secret
   * @param grantType Grant Type can be &#39;authorization_code&#39; or &#39;refresh_token&#39;
   * @param responseType Response type
   * @param scope Scope
   * @param redirectUri Redirect uri
   * @param state State
   * @param realm Realm
   */
  def oauth2AccesstokenGet(clientId: String, clientSecret: String, grantType: String, responseType: Option[String] = None, scope: Option[String] = None, redirectUri: Option[String] = None, state: Option[String] = None, realm: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/oauth2/accesstoken", "application/json")
      .withQueryParam("client_id", clientId)
      .withQueryParam("client_secret", clientSecret)
      .withQueryParam("grant_type", grantType)
      .withQueryParam("response_type", responseType)
      .withQueryParam("scope", scope)
      .withQueryParam("redirect_uri", redirectUri)
      .withQueryParam("state", state)
      .withQueryParam("realm", realm)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Ask the user if they want to allow a client applications to submit or obtain data from their QM account. It will redirect the user to the url provided by the client application with the code as a query parameter or error in case of an error.
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param clientId This is the unique ID that QuantiModo uses to identify your application. Obtain a client id by emailing info@quantimo.do.
   * @param clientSecret This is the secret for your obtained clietn_id. QuantiModo uses this to validate that only your application uses the client_id.
   * @param responseType If the value is code, launches a Basic flow, requiring a POST to the token endpoint to obtain the tokens. If the value is token id_token or id_token token, launches an Implicit flow, requiring the use of Javascript at the redirect URI to retrieve tokens from the URI #fragment.
   * @param scope Scopes include basic, readmeasurements, and writemeasurements. The \&quot;basic\&quot; scope allows you to read user info (displayname, email, etc). The \&quot;readmeasurements\&quot; scope allows one to read a user&#39;s data. The \&quot;writemeasurements\&quot; scope allows you to write user data. Separate multiple scopes by a space.
   * @param redirectUri The redirect URI is the URL within your client application that will receive the OAuth2 credentials.
   * @param state An opaque string that is round-tripped in the protocol; that is to say, it is returned as a URI parameter in the Basic flow, and in the URI
   * @param realm Name of the realm representing the users of your distributed applications and services. A \&quot;realm\&quot; attribute MAY be included to indicate the scope of protection.
   */
  def oauth2AuthorizeGet(clientId: String, clientSecret: String, responseType: String, scope: String, redirectUri: Option[String] = None, state: Option[String] = None, realm: Option[String] = None): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://localhost/api", "/oauth2/authorize", "application/json")
      .withQueryParam("client_id", clientId)
      .withQueryParam("client_secret", clientSecret)
      .withQueryParam("response_type", responseType)
      .withQueryParam("scope", scope)
      .withQueryParam("redirect_uri", redirectUri)
      .withQueryParam("state", state)
      .withQueryParam("realm", realm)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](401)
      


}

