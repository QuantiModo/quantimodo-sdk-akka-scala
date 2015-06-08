package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class JsonErrorResponse (
  /* Status: \"ok\" or \"error\" */
  status: String,
  /* Error message */
  message: Option[String])
   extends ApiModel


