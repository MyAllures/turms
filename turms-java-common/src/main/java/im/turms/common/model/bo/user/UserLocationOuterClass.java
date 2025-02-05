/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/user_location.proto

package im.turms.common.model.bo.user;

public final class UserLocationOuterClass {
  private UserLocationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_im_turms_proto_UserLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_im_turms_proto_UserLocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036model/user/user_location.proto\022\016im.tur" +
      "ms.proto\"\227\001\n\014UserLocation\022\020\n\010latitude\030\001 " +
      "\001(\002\022\021\n\tlongitude\030\002 \001(\002\022\021\n\004name\030\003 \001(\tH\000\210\001" +
      "\001\022\024\n\007address\030\004 \001(\tH\001\210\001\001\022\026\n\ttimestamp\030\005 \001" +
      "(\003H\002\210\001\001B\007\n\005_nameB\n\n\010_addressB\014\n\n_timesta" +
      "mpB$\n\035im.turms.common.model.bo.userP\001\272\002\000" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_im_turms_proto_UserLocation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_im_turms_proto_UserLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_im_turms_proto_UserLocation_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", "Name", "Address", "Timestamp", "Name", "Address", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
