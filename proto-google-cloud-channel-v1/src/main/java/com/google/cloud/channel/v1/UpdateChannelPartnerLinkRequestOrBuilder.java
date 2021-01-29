/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/channel/v1/service.proto

package com.google.cloud.channel.v1;

public interface UpdateChannelPartnerLinkRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.UpdateChannelPartnerLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the channel partner link to cancel.
   * The name takes the format: accounts/{account_id}/channelPartnerLinks/{id}
   * where {id} is the Cloud Identity ID of the partner.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the channel partner link to cancel.
   * The name takes the format: accounts/{account_id}/channelPartnerLinks/{id}
   * where {id} is the Cloud Identity ID of the partner.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The channel partner link to update. Only field
   * channel_partner_link.link_state is allowed to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channelPartnerLink field is set.
   */
  boolean hasChannelPartnerLink();
  /**
   *
   *
   * <pre>
   * Required. The channel partner link to update. Only field
   * channel_partner_link.link_state is allowed to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channelPartnerLink.
   */
  com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLink();
  /**
   *
   *
   * <pre>
   * Required. The channel partner link to update. Only field
   * channel_partner_link.link_state is allowed to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerLink channel_partner_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder getChannelPartnerLinkOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask that applies to the resource.
   * The only allowable value for update mask is
   * channel_partner_link.link_state.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask that applies to the resource.
   * The only allowable value for update mask is
   * channel_partner_link.link_state.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask that applies to the resource.
   * The only allowable value for update mask is
   * channel_partner_link.link_state.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}