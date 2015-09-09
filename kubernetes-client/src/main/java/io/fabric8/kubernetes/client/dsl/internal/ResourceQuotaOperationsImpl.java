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

import io.fabric8.kubernetes.api.model.DoneableResourceQuota;
import io.fabric8.kubernetes.api.model.ResourceQuota;
import io.fabric8.kubernetes.api.model.ResourceQuotaList;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.dsl.ClientResource;

public class ResourceQuotaOperationsImpl extends HasMetadataOperation<KubernetesClient, ResourceQuota, ResourceQuotaList, DoneableResourceQuota,
  ClientResource<ResourceQuota, DoneableResourceQuota>> {

  public ResourceQuotaOperationsImpl(KubernetesClient client) {
    this(client, null, null, true, null);

  }

  public ResourceQuotaOperationsImpl(KubernetesClient client, String namespace, String name, Boolean cascading, ResourceQuota item) {
    super(client, "resourcequotas", namespace, name, cascading, item);
  }
}
