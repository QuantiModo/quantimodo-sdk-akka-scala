package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime


case class Connector (
  /* Connector ID number */
  id: Option[Int],
  /* Connector lowercase system name */
  name: String,
  /* Connector pretty display name */
  displayName: String,
  /* URL to the image of the connector logo */
  image: String,
  /* URL to a site where one can get this device or application */
  getItUrl: String,
  /* Short description */
  shortDescription: String,
  /* Long description */
  longDescription: String,
  /* enabled */
  enabled: Boolean,
  /* oauth */
  oauth: Boolean)
   extends ApiModel


