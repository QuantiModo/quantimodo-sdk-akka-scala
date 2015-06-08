package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class User (
  /* User id */
  id: Int,
  /* Wordpress user id */
  wpId: Int,
  /* User display name */
  displayName: String,
  /* User login name */
  loginName: String,
  /* User email */
  email: String,
  /* User token */
  token: String,
  /* Is user administrator */
  administrator: Boolean)
   extends ApiModel


