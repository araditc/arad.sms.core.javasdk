/*
 * Arad SMS Core Api V1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package arad.sms.core.javaclient.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * AradA2PMessage
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-31T13:23:41.190784500+03:30[GMT+03:30]")
public class AradA2PMessage {
  @SerializedName("sourceAddress")
  private String sourceAddress = null;

  @SerializedName("destinationAddress")
  private String destinationAddress = null;

  @SerializedName("messageText")
  private String messageText = null;

  @SerializedName("dataCoding")
  private DataCodings dataCoding = null;

  @SerializedName("validityPeriod")
  private OffsetDateTime validityPeriod = null;

  @SerializedName("targetUDH")
  private List<String> targetUDH = null;

  @SerializedName("serviceID")
  private String serviceID = null;

  @SerializedName("priority")
  private Priority priority = null;

  @SerializedName("messageClass")
  private MessageClass messageClass = null;

  @SerializedName("udh")
  private String udh = null;

  public AradA2PMessage sourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
    return this;
  }

   /**
   * Get sourceAddress
   * @return sourceAddress
  **/
  @Schema(description = "")
  public String getSourceAddress() {
    return sourceAddress;
  }

  public void setSourceAddress(String sourceAddress) {
    this.sourceAddress = sourceAddress;
  }

  public AradA2PMessage destinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
    return this;
  }

   /**
   * Get destinationAddress
   * @return destinationAddress
  **/
  @Schema(description = "")
  public String getDestinationAddress() {
    return destinationAddress;
  }

  public void setDestinationAddress(String destinationAddress) {
    this.destinationAddress = destinationAddress;
  }

  public AradA2PMessage messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

   /**
   * Get messageText
   * @return messageText
  **/
  @Schema(description = "")
  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public AradA2PMessage dataCoding(DataCodings dataCoding) {
    this.dataCoding = dataCoding;
    return this;
  }

   /**
   * Get dataCoding
   * @return dataCoding
  **/
  @Schema(description = "")
  public DataCodings getDataCoding() {
    return dataCoding;
  }

  public void setDataCoding(DataCodings dataCoding) {
    this.dataCoding = dataCoding;
  }

  public AradA2PMessage validityPeriod(OffsetDateTime validityPeriod) {
    this.validityPeriod = validityPeriod;
    return this;
  }

   /**
   * Get validityPeriod
   * @return validityPeriod
  **/
  @Schema(description = "")
  public OffsetDateTime getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(OffsetDateTime validityPeriod) {
    this.validityPeriod = validityPeriod;
  }

  public AradA2PMessage targetUDH(List<String> targetUDH) {
    this.targetUDH = targetUDH;
    return this;
  }

  public AradA2PMessage addTargetUDHItem(String targetUDHItem) {
    if (this.targetUDH == null) {
      this.targetUDH = new ArrayList<String>();
    }
    this.targetUDH.add(targetUDHItem);
    return this;
  }

   /**
   * Get targetUDH
   * @return targetUDH
  **/
  @Schema(description = "")
  public List<String> getTargetUDH() {
    return targetUDH;
  }

  public void setTargetUDH(List<String> targetUDH) {
    this.targetUDH = targetUDH;
  }

  public AradA2PMessage serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }

   /**
   * Get serviceID
   * @return serviceID
  **/
  @Schema(description = "")
  public String getServiceID() {
    return serviceID;
  }

  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  public AradA2PMessage priority(Priority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Priority getPriority() {
    return priority;
  }

  public void setPriority(Priority priority) {
    this.priority = priority;
  }

  public AradA2PMessage messageClass(MessageClass messageClass) {
    this.messageClass = messageClass;
    return this;
  }

   /**
   * Get messageClass
   * @return messageClass
  **/
  @Schema(description = "")
  public MessageClass getMessageClass() {
    return messageClass;
  }

  public void setMessageClass(MessageClass messageClass) {
    this.messageClass = messageClass;
  }

  public AradA2PMessage udh(String udh) {
    this.udh = udh;
    return this;
  }

   /**
   * Get udh
   * @return udh
  **/
  @Schema(description = "")
  public String getUdh() {
    return udh;
  }

  public void setUdh(String udh) {
    this.udh = udh;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AradA2PMessage aradA2PMessage = (AradA2PMessage) o;
    return Objects.equals(this.sourceAddress, aradA2PMessage.sourceAddress) &&
        Objects.equals(this.destinationAddress, aradA2PMessage.destinationAddress) &&
        Objects.equals(this.messageText, aradA2PMessage.messageText) &&
        Objects.equals(this.dataCoding, aradA2PMessage.dataCoding) &&
        Objects.equals(this.validityPeriod, aradA2PMessage.validityPeriod) &&
        Objects.equals(this.targetUDH, aradA2PMessage.targetUDH) &&
        Objects.equals(this.serviceID, aradA2PMessage.serviceID) &&
        Objects.equals(this.priority, aradA2PMessage.priority) &&
        Objects.equals(this.messageClass, aradA2PMessage.messageClass) &&
        Objects.equals(this.udh, aradA2PMessage.udh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceAddress, destinationAddress, messageText, dataCoding, validityPeriod, targetUDH, serviceID, priority, messageClass, udh);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AradA2PMessage {\n");
    
    sb.append("    sourceAddress: ").append(toIndentedString(sourceAddress)).append("\n");
    sb.append("    destinationAddress: ").append(toIndentedString(destinationAddress)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    dataCoding: ").append(toIndentedString(dataCoding)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
    sb.append("    targetUDH: ").append(toIndentedString(targetUDH)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    messageClass: ").append(toIndentedString(messageClass)).append("\n");
    sb.append("    udh: ").append(toIndentedString(udh)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
