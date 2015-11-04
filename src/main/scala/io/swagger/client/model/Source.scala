package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Source (
  /* id */
  id: Option[Int],
  /* client_id */
  clientId: Option[String],
  /* Name of the application or device */
  name: String,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


