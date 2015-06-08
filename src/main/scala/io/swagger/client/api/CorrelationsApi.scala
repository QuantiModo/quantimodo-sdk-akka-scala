package io.swagger.client.api

import io.swagger.client.model.Correlation
import io.swagger.client.model.PostCorrelation
import io.swagger.client.model.JsonErrorResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object CorrelationsApi {

  /**
   * Get correlations
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param effect ORIGINAL variable name of the effect variable for which the user desires correlations
   * @param cause ORIGINAL variable name of the cause variable for which the user desires correlations
   */
  def correlationsGet(effect: Option[String] = None, cause: Option[String] = None): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/correlations", "application/json")
      .withQueryParam("effect", effect)
      .withQueryParam("cause", cause)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns the average correlations from all users for all public variables that contain the characters in the search query. Returns average of all users public variable correlations with a specified cause or effect.
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param search Name of the variable that you want to know the causes or effects of.
   * @param effectOrCause Specifies whether to return the effects or causes of the searched variable.
   */
  def publicCorrelationsSearchSearchGet(search: String, effectOrCause: String): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/public/correlations/search/{search}", "application/json")
      .withQueryParam("effectOrCause", effectOrCause)
      .withPathParam("search", search)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Add correlation or/and vote for it
   * 
   * Expected answers:
   *   code 200 :  (Successful Operation)
   *   code 400 : JsonErrorResponse (Bad request)
   *   code 401 :  (Not Authenticated)
   * 
   * @param body Provides correlation data
   */
  def v1CorrelationsPost(body: PostCorrelation): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://localhost/api", "/v1/correlations", "application/json")
      .withBody(body)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[JsonErrorResponse](400)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns average of all correlations and votes for all user cause variables for a given effect. If parameter \&quot;include_public\&quot; is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param organizationId Organization ID
   * @param userId User id
   * @param variableName Effect variable name
   * @param organizationToken Organization access token
   * @param includePublic Include bublic correlations, Can be \&quot;1\&quot; or empty.
   */
  def v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameCausesGet(organizationId: Int, userId: Int, variableName: String, organizationToken: String, includePublic: Option[String] = None): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/causes", "application/json")
      .withQueryParam("organization_token", organizationToken)
      .withQueryParam("include_public", includePublic)
      .withPathParam("organizationId", organizationId)
      .withPathParam("userId", userId)
      .withPathParam("variableName", variableName)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns average of all correlations and votes for all user cause variables for a given effect. If parameter \&quot;include_public\&quot; is used, it also returns public correlations. User correlation overwrites or supersedes public correlation.
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param organizationId Organization ID
   * @param userId User id
   * @param variableName Cause variable name
   * @param organizationToken Organization access token
   * @param includePublic Include bublic correlations, Can be \&quot;1\&quot; or empty.
   */
  def v1OrganizationsOrganizationIdUsersUserIdVariablesVariableNameEffectsGet(organizationId: Int, userId: Int, variableName: String, organizationToken: String, includePublic: Option[String] = None): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/v1/organizations/{organizationId}/users/{userId}/variables/{variableName}/effects", "application/json")
      .withQueryParam("organization_token", organizationToken)
      .withQueryParam("include_public", includePublic)
      .withPathParam("organizationId", organizationId)
      .withPathParam("userId", userId)
      .withPathParam("variableName", variableName)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns average of all correlations and votes for all user cause variables for a given effect
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param variableName Effect variable name
   */
  def v1VariablesVariableNameCausesGet(variableName: String): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/v1/variables/{variableName}/causes", "application/json")
      .withPathParam("variableName", variableName)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns average of all correlations and votes for all user effect variables for a given cause
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param variableName Cause variable name
   */
  def v1VariablesVariableNameEffectsGet(variableName: String): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/v1/variables/{variableName}/effects", "application/json")
      .withPathParam("variableName", variableName)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns average of all correlations and votes for all public cause variables for a given effect
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param variableName Effect variable name
   */
  def v1VariablesVariableNamePublicCausesGet(variableName: String): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/v1/variables/{variableName}/public/causes", "application/json")
      .withPathParam("variableName", variableName)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Returns average of all correlations and votes for all public cause variables for a given cause
   * 
   * Expected answers:
   *   code 200 : Seq[Correlation] (Successful Operation)
   *   code 401 :  (Not Authenticated)
   * 
   * @param variableName Cause variable name
   */
  def v1VariablesVariableNamePublicEffectsGet(variableName: String): ApiRequest[Seq[Correlation]] =
    ApiRequest[Seq[Correlation]](ApiMethods.GET, "https://localhost/api", "/v1/variables/{variableName}/public/effects", "application/json")
      .withPathParam("variableName", variableName)
      .withSuccessResponse[Seq[Correlation]](200)
      .withErrorResponse[Unit](401)
      


}

