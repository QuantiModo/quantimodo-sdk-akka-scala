package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class UserTokenSuccessfulResponse (
  /* Status code */
  code: Int,
  /* Message */
  message: String,
  user: UserTokenSuccessfulResponseInnerUserField)
   extends ApiModel


