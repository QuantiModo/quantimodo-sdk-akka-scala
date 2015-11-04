package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Connection (
  /* id */
  id: Option[Int],
  /* user_id */
  userId: Option[Int],
  /* connector_id */
  connectorId: Int,
  /* connect_status */
  connectStatus: Option[String],
  /* connect_error */
  connectError: Option[String],
  /* update_requested_at */
  updateRequestedAt: Option[DateTime],
  /* update_status */
  updateStatus: Option[String],
  /* update_error */
  updateError: Option[String],
  /* last_successful_updated_at */
  lastSuccessfulUpdatedAt: Option[DateTime],
  /* created_at */
  createdAt: Option[DateTime],
  /* updated_at */
  updatedAt: Option[DateTime])
   extends ApiModel


