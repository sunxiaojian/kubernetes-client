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
package io.fabric8.kubernetes.client;

import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscaler;
import io.fabric8.kubernetes.api.model.autoscaling.v2beta1.HorizontalPodAutoscalerList;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.kubernetes.client.extension.ClientAdapter;

public class V2beta1AutoscalingAPIGroupClient extends ClientAdapter<V2beta1AutoscalingAPIGroupClient>
    implements V2beta1AutoscalingAPIGroupDSL {

  @Override
  public MixedOperation<HorizontalPodAutoscaler, HorizontalPodAutoscalerList, Resource<HorizontalPodAutoscaler>> horizontalPodAutoscalers() {
    return resources(HorizontalPodAutoscaler.class, HorizontalPodAutoscalerList.class);
  }

  @Override
  public V2beta1AutoscalingAPIGroupClient newInstance() {
    return new V2beta1AutoscalingAPIGroupClient();
  }
}
