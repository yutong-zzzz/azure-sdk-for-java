// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for JitNetworkAccessPolicies ListByRegion. */
public final class JitNetworkAccessPoliciesListByRegionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/JitNetworkAccessPolicies/GetJitNetworkAccessPoliciesSubscriptionLocation_example.json
     */
    /**
     * Sample code: Get JIT network access policies on a subscription from a security data location.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getJITNetworkAccessPoliciesOnASubscriptionFromASecurityDataLocation(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.jitNetworkAccessPolicies().listByRegion("westeurope", com.azure.core.util.Context.NONE);
    }
}
