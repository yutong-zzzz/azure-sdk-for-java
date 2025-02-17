// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.SecurityRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Response for ListSecurityRule API service call. Retrieves all security rules that belongs to a network security
 * group.
 */
@Fluent
public final class SecurityRuleListResult {
    /*
     * The security rules in a network security group.
     */
    @JsonProperty(value = "value")
    private List<SecurityRuleInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of SecurityRuleListResult class. */
    public SecurityRuleListResult() {
    }

    /**
     * Get the value property: The security rules in a network security group.
     *
     * @return the value value.
     */
    public List<SecurityRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The security rules in a network security group.
     *
     * @param value the value value to set.
     * @return the SecurityRuleListResult object itself.
     */
    public SecurityRuleListResult withValue(List<SecurityRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the SecurityRuleListResult object itself.
     */
    public SecurityRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
