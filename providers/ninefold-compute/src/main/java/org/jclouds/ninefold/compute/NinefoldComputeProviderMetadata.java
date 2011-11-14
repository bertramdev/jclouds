/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.ninefold.compute;

import com.google.common.collect.ImmutableSet;

import java.net.URI;
import java.util.Set;

import org.jclouds.providers.BaseProviderMetadata;

/**
 * Implementation of {@link org.jclouds.types.ProviderMetadata} for Ninefold
 * Compute.
 * 
 * @author Adrian Cole
 */
public class NinefoldComputeProviderMetadata extends BaseProviderMetadata {

   /**
    * {@inheritDoc}
    */
   @Override
   public String getId() {
      return "ninefold-compute";
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public String getType() {
      return COMPUTE_TYPE;
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public String getName() {
      return "Ninefold Compute";
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public String getIdentityName() {
      return "TODO";
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public String getCredentialName() {
      return "TODO";
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public URI getHomepage() {
      return URI.create("TODO");
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public URI getConsole() {
      return URI.create("TODO");
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public URI getApiDocumentation() {
      return URI.create("TODO");
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Set<String> getIso3166Codes() {
      return ImmutableSet.of("AU-NSW");
   }

   /**
    * {@inheritDoc}
    */
   @Override
   public Set<String> getLinkedServices() {
      return ImmutableSet.of(getId(), "ninefold-storage");
   }
}
