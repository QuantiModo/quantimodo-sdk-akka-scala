package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Vote (
  /* id */
  id: Option[Int],
  /* client_id */
  clientId: String,
  /* ID of User */
  userId: Int,
  /* ID of cause variable */
  causeId: Int,
  /* ID of effect variable */
  effectId: Int,
  /* Value of Vote */
  value: Int,
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


