// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The AcsSmsDeliveryReportReceivedEventData model. */
@Fluent
public final class AcsSmsDeliveryReportReceivedEventData extends AcsSmsEventBaseProperties {
    /*
     * Status of Delivery
     */
    @JsonProperty(value = "deliveryStatus")
    private String deliveryStatus;

    /*
     * Details about Delivery Status
     */
    @JsonProperty(value = "deliveryStatusDetails")
    private String deliveryStatusDetails;

    /*
     * List of details of delivery attempts made
     */
    @JsonProperty(value = "deliveryAttempts")
    private List<AcsSmsDeliveryAttemptProperties> deliveryAttempts;

    /*
     * The time at which the SMS delivery report was received
     */
    @JsonProperty(value = "receivedTimestamp")
    private OffsetDateTime receivedTimestamp;

    /**
     * Get the deliveryStatus property: Status of Delivery.
     *
     * @return the deliveryStatus value.
     */
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    /**
     * Set the deliveryStatus property: Status of Delivery.
     *
     * @param deliveryStatus the deliveryStatus value to set.
     * @return the AcsSmsDeliveryReportReceivedEventData object itself.
     */
    public AcsSmsDeliveryReportReceivedEventData setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }

    /**
     * Get the deliveryStatusDetails property: Details about Delivery Status.
     *
     * @return the deliveryStatusDetails value.
     */
    public String getDeliveryStatusDetails() {
        return this.deliveryStatusDetails;
    }

    /**
     * Set the deliveryStatusDetails property: Details about Delivery Status.
     *
     * @param deliveryStatusDetails the deliveryStatusDetails value to set.
     * @return the AcsSmsDeliveryReportReceivedEventData object itself.
     */
    public AcsSmsDeliveryReportReceivedEventData setDeliveryStatusDetails(String deliveryStatusDetails) {
        this.deliveryStatusDetails = deliveryStatusDetails;
        return this;
    }

    /**
     * Get the deliveryAttempts property: List of details of delivery attempts made.
     *
     * @return the deliveryAttempts value.
     */
    public List<AcsSmsDeliveryAttemptProperties> getDeliveryAttempts() {
        return this.deliveryAttempts;
    }

    /**
     * Set the deliveryAttempts property: List of details of delivery attempts made.
     *
     * @param deliveryAttempts the deliveryAttempts value to set.
     * @return the AcsSmsDeliveryReportReceivedEventData object itself.
     */
    public AcsSmsDeliveryReportReceivedEventData setDeliveryAttempts(
            List<AcsSmsDeliveryAttemptProperties> deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
        return this;
    }

    /**
     * Get the receivedTimestamp property: The time at which the SMS delivery report was received.
     *
     * @return the receivedTimestamp value.
     */
    public OffsetDateTime getReceivedTimestamp() {
        return this.receivedTimestamp;
    }

    /**
     * Set the receivedTimestamp property: The time at which the SMS delivery report was received.
     *
     * @param receivedTimestamp the receivedTimestamp value to set.
     * @return the AcsSmsDeliveryReportReceivedEventData object itself.
     */
    public AcsSmsDeliveryReportReceivedEventData setReceivedTimestamp(OffsetDateTime receivedTimestamp) {
        this.receivedTimestamp = receivedTimestamp;
        return this;
    }
}
