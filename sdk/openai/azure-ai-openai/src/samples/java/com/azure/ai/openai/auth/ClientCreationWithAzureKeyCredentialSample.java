// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.openai.auth;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.Completions;
import com.azure.ai.openai.models.CompletionsOptions;
import com.azure.core.credential.AzureKeyCredential;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample demonstrates how to create a client with `AzureKeyCredential`.
 */
public class ClientCreationWithAzureKeyCredentialSample {
    /**
     * Runs the sample algorithm and demonstrates how to create a client with `AzureKeyCredential`.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        String endpoint = "{azure-open-ai-endpoint}";
        String azureOpenaiKey = "{azure-open-ai-key}";

        OpenAIClientBuilder builder = new OpenAIClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(azureOpenaiKey));

        OpenAIClient client = builder.buildClient();

        List<String> prompt = new ArrayList<>();
        prompt.add("Why did the eagles not carry Frodo Baggins to Mordor?");
        String deploymentOrModelId = "{azure-open-ai-deployment-model-id}";
        Completions completions = client.getCompletions(deploymentOrModelId, new CompletionsOptions(prompt));
        System.out.printf("Model ID=%s is created at %d.%n", completions.getId(), completions.getCreated());
    }
}
