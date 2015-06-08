package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class UserTokenFailedResponse (
  /* Status code */
  code: Int,
  /* Message */
  message: String,
  success: Boolean)
   extends ApiModel


