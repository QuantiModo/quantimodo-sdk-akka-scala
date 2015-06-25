package io.swagger.client.api

import io.swagger.client.model.User
import io.swagger.client.model.UserTokenRequest
import io.swagger.client.model.UserTokenFailedResponse
import io.swagger.client.model.UserTokenSuccessfulResponse
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object UserApi {

  /**
   * Returns user info for the currently authenticated user.
   * 
   * Expected answers:
   *   code 200 : User (Successful operation)
   *   code 401 :  (Not Authenticated)
   */
  def userMeGet(): ApiRequest[User] =
    ApiRequest[User](ApiMethods.GET, "https://localhost/api", "/user/me", "application/json")
      .withSuccessResponse[User](200)
      .withErrorResponse[Unit](401)
      
  /**
   * Get user tokens for existing users, create new users
   * 
   * Expected answers:
   *   code 200 : UserTokenSuccessfulResponse (User has been found, token was returned)
   *   code 201 : UserTokenSuccessfulResponse (User has been created, token was returned)
   *   code 400 : UserTokenFailedResponse (Bad data)
   *   code 403 : UserTokenFailedResponse (Forbidden)
   * 
   * @param organizationId Organization ID
   * @param body Provides organization token and user ID
   */
  def v1OrganizationsOrganizationIdUsersPost(organizationId: Int, body: UserTokenRequest): ApiRequest[UserTokenSuccessfulResponse] =
    ApiRequest[UserTokenSuccessfulResponse](ApiMethods.POST, "https://localhost/api", "/v1/organizations/{organizationId}/users", "application/json")
      .withBody(body)
      .withPathParam("organizationId", organizationId)
      .withSuccessResponse[UserTokenSuccessfulResponse](200)
      .withErrorResponse[UserTokenSuccessfulResponse](201)
      .withErrorResponse[UserTokenFailedResponse](400)
      .withErrorResponse[UserTokenFailedResponse](403)
      


}

