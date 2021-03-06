/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.dsl.internal;

import io.fabric8.kubernetes.api.model.DoneableSecret;
import io.fabric8.kubernetes.api.model.Secret;
import io.fabric8.kubernetes.api.model.SecretList;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.ClientResource;

public class SecretOperationsImpl extends HasMetadataOperation<KubernetesClient, Secret, SecretList, DoneableSecret, ClientResource<Secret, DoneableSecret>> {
  public SecretOperationsImpl(KubernetesClient client) {
    super(client,"secrets", null, null);
  }

  public SecretOperationsImpl(KubernetesClient client, String namespace, String name) {
    super(client,"secrets", namespace, name);
  }
}
