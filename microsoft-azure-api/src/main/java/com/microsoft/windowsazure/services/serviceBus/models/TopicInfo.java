/**
 * Copyright Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.serviceBus.models;

import java.util.Calendar;

import javax.ws.rs.core.MediaType;
import javax.xml.datatype.Duration;

import com.microsoft.windowsazure.services.serviceBus.implementation.AuthorizationRules;
import com.microsoft.windowsazure.services.serviceBus.implementation.Content;
import com.microsoft.windowsazure.services.serviceBus.implementation.EntityAvailabilityStatus;
import com.microsoft.windowsazure.services.serviceBus.implementation.EntityStatus;
import com.microsoft.windowsazure.services.serviceBus.implementation.Entry;
import com.microsoft.windowsazure.services.serviceBus.implementation.EntryModel;
import com.microsoft.windowsazure.services.serviceBus.implementation.MessageCountDetails;
import com.microsoft.windowsazure.services.serviceBus.implementation.PartitioningPolicy;
import com.microsoft.windowsazure.services.serviceBus.implementation.TopicDescription;

/**
 * Represents a topic.
 */
public class TopicInfo extends EntryModel<TopicDescription> {
    /**
     * Creates an instance of the <code>Topic</code> class.
     */
    public TopicInfo() {
        super(new Entry(), new TopicDescription());
        getEntry().setContent(new Content());
        getEntry().getContent().setType(MediaType.APPLICATION_XML);
        getEntry().getContent().setTopicDescription(getModel());
    }

    /**
     * Creates an instance of the <code>Topic</code> class using the specified entry.
     * 
     * @param entry
     *            An <code>Entry</code> object that represents the entry for the topic.
     */
    public TopicInfo(Entry entry) {
        super(entry, entry.getContent().getTopicDescription());
    }

    /**
     * Creates an instance of the <code>Topic</code> class using the specified name.
     * 
     * @param path
     *            A <code>String</code> object that represents the name for the topic.
     */
    public TopicInfo(String path) {
        this();
        setPath(path);
    }

    /**
     * Returns the name of the topic.
     * 
     * @return A <code>String</code> object that represents the name of the topic.
     */
    public String getPath() {
        return getEntry().getTitle();
    }

    /**
     * Sets the name of the topic.
     * 
     * @param value
     *            A <code>String</code> that represents the name of the topic.
     * 
     * @return A <code>Topic</code> object that represents the updated topic.
     */
    public TopicInfo setPath(String value) {
        getEntry().setTitle(value);
        return this;
    }

    /**
     * Returns the default message time-to-live (TTL).
     * 
     * @return A <code>Duration</code> object that represents the default message TTL.
     */
    public Duration getDefaultMessageTimeToLive() {
        return getModel().getDefaultMessageTimeToLive();
    }

    /**
     * Sets the default message time-to-live (TTL).
     * 
     * @param value
     *            A <code>Duration</code> object that represents the default message TTL.
     * 
     * @return A <code>Topic</code> object that represents the updated topic.
     */
    public TopicInfo setDefaultMessageTimeToLive(Duration value) {
        getModel().setDefaultMessageTimeToLive(value);
        return this;
    }

    /**
     * Returns the maximum size of the topic.
     * 
     * @return The maximum size, in megabytes, of the topic.
     */
    public Long getMaxSizeInMegabytes() {
        return getModel().getMaxSizeInMegabytes();
    }

    /**
     * Sets the maximum size of the topic.
     * 
     * @param value
     *            The maximum size, in megabytes, of the topic.
     * 
     * @return A <code>Topic</code> object that represents the updated topic.
     */
    public TopicInfo setMaxSizeInMegabytes(Long value) {
        getModel().setMaxSizeInMegabytes(value);
        return this;
    }

    /**
     * Indicates whether duplicate message detection is required.
     * 
     * @return <code>true</code> if duplicate message detection is required; otherwise, <code>false</code>.
     */
    public Boolean isRequiresDuplicateDetection() {
        return getModel().isRequiresDuplicateDetection();
    }

    /**
     * Specifies whether duplicate message detection is required.
     * 
     * @param value
     *            <code>true</code> if duplicate message detection is required; otherwise, <code>false</code>.
     * 
     * @return A <code>Topic</code> object that represents the updated topic.
     */
    public TopicInfo setRequiresDuplicateDetection(Boolean value) {
        getModel().setRequiresDuplicateDetection(value);
        return this;
    }

    /**
     * Returns the time span during which the service bus will detect message duplication.
     * 
     * @return A <code>Duration</code> object that represents the time span for
     *         detecting message duplication.
     */
    public Duration getDuplicateDetectionHistoryTimeWindow() {
        return getModel().getDuplicateDetectionHistoryTimeWindow();
    }

    /**
     * Sets the time span during which the service bus will detect message duplication.
     * 
     * @param value
     *            A <code>Duration</code> object that represents the time span for detecting message duplication.
     * 
     * @return A <code>Topic</code> object that represents the updated topic.
     */
    public TopicInfo setDuplicateDetectionHistoryTimeWindow(Duration value) {
        getModel().setDuplicateDetectionHistoryTimeWindow(value);
        return this;
    }

    /**
     * Indicates whether batch operations are enabled.
     * 
     * @return <code>true</code> if batch operations are enabled; otherwise, <code>false</code>.
     */
    public Boolean isEnableBatchedOperations() {
        return getModel().isEnableBatchedOperations();
    }

    /**
     * Specifies whether batch operations are enabled.
     * 
     * @param value
     *            <code>true</code> if batch operations are enabled; otherwise, <code>false</code>.
     * 
     * @return A <code>Topic</code> object that represents the updated topic.
     */
    public TopicInfo setEnableBatchedOperations(Boolean value) {
        getModel().setEnableBatchedOperations(value);
        return this;
    }

    /**
     * Returns the size of the topic.
     * 
     * @return The size, in bytes, of the topic.
     */
    public Long getSizeInBytes() {
        return getModel().getSizeInBytes();
    }

    public TopicInfo setSizeInBytes(Long sizeInBytes) {
        getModel().setSizeInBytes(sizeInBytes);
        return this;
    }

    public TopicInfo setAuthorization(AuthorizationRules authorizationRules) {
        getModel().setAuthorizationRules(authorizationRules);
        return this;
    }

    public AuthorizationRules getAuthorization() {
        return getModel().getAuthorizationRules();
    }

    public TopicInfo setFilteringMessageBeforePublishing(Boolean filteringMessageBeforePublishing) {
        getModel().setFilteringMessagesBeforePublishing(filteringMessageBeforePublishing);
        return this;
    }

    public Boolean isFilteringMessageBeforePublishing() {
        return getModel().isFilteringMessagesBeforePublishing();
    }

    public TopicInfo setAnonymousAccessible(Boolean anonymousAccessible) {
        getModel().setIsAnonymousAcessible(anonymousAccessible);
        return this;
    }

    public Boolean isAnonymousAccessible() {
        return getModel().isIsAnonymousAcessible();
    }

    public TopicInfo setStatus(EntityStatus status) {
        getModel().setStatus(status);
        return this;
    }

    public EntityStatus getStatus() {
        return getModel().getStatus();
    }

    public TopicInfo setForwardTo(String forwardTo) {
        getModel().setForwardTo(forwardTo);
        return this;
    }

    public String getForwardTo() {
        return getModel().getForwardTo();
    }

    public TopicInfo setCreatedAt(Calendar createdAt) {
        getModel().setCreatedAt(createdAt);
        return this;
    }

    public Calendar getCreatedAt() {
        return getModel().getCreatedAt();
    }

    public TopicInfo setUpdatedAt(Calendar updatedAt) {
        getModel().setUpdatedAt(updatedAt);
        return this;
    }

    public Calendar getUpdatedAt() {
        return getModel().getCreatedAt();
    }

    public TopicInfo setAccessedAt(Calendar accessedAt) {
        getModel().setAccessedAt(accessedAt);
        return this;
    }

    public Calendar getAccessedAt() {
        return getModel().getAccessedAt();
    }

    public TopicInfo setUserMetadata(String userMetadata) {
        getModel().setUserMetadata(userMetadata);
        return this;
    }

    public String getUserMetadata() {
        return getModel().getUserMetadata();
    }

    public TopicInfo setSupportOrdering(Boolean supportOrdering) {
        getModel().setSupportOrdering(supportOrdering);
        return this;
    }

    public Boolean isSupportOrdering() {
        return getModel().isSupportOrdering();
    }

    public TopicInfo setSubscriptionCount(Integer subscriptionCount) {
        getModel().setSubscriptionCount(subscriptionCount);
        return this;
    }

    public Integer getSubscriptionCount() {
        return getModel().getSubscriptionCount();
    }

    public TopicInfo setCountDetails(MessageCountDetails countDetails) {
        getModel().setCountDetail(countDetails);
        return this;
    }

    public MessageCountDetails getCountDetails() {
        return getModel().getCountDetail();
    }

    public TopicInfo setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        getModel().setAutoDeleteOnIdle(autoDeleteOnIdle);
        return this;
    }

    public Duration getAutoDeleteOnIdle() {
        return getModel().getAutoDeleteOnIdle();
    }

    public TopicInfo setPartitioningPolicy(PartitioningPolicy partitioningPolicy) {
        getModel().setPartitioningPolicy(partitioningPolicy);
        return this;
    }

    public PartitioningPolicy getPartitioningPolicy() {
        return getModel().getPartitioningPolicy();
    }

    public TopicInfo setEntityAvailabilityStatus(EntityAvailabilityStatus entityAvailabilityStatus) {
        getModel().setEntityAvailabilityStatus(entityAvailabilityStatus);
        return this;
    }

    public EntityAvailabilityStatus getEntityAvailabilityStatus() {
        return getModel().getEntityAvailabilityStatus();
    }
}
