/*
 * Copyright 2019 Google LLC
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
// source: google/devtools/cloudtrace/v2/trace.proto

package com.google.devtools.cloudtrace.v2;

public interface StackTraceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v2.StackTrace)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Stack frames in this stack trace. A maximum of 128 frames are allowed.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.StackTrace.StackFrames stack_frames = 1;</code>
   */
  boolean hasStackFrames();
  /**
   *
   *
   * <pre>
   * Stack frames in this stack trace. A maximum of 128 frames are allowed.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.StackTrace.StackFrames stack_frames = 1;</code>
   */
  com.google.devtools.cloudtrace.v2.StackTrace.StackFrames getStackFrames();
  /**
   *
   *
   * <pre>
   * Stack frames in this stack trace. A maximum of 128 frames are allowed.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v2.StackTrace.StackFrames stack_frames = 1;</code>
   */
  com.google.devtools.cloudtrace.v2.StackTrace.StackFramesOrBuilder getStackFramesOrBuilder();

  /**
   *
   *
   * <pre>
   * The hash ID is used to conserve network bandwidth for duplicate
   * stack traces within a single trace.
   * Often multiple spans will have identical stack traces.
   * The first occurrence of a stack trace should contain both the
   * `stackFrame` content and a value in `stackTraceHashId`.
   * Subsequent spans within the same request can refer
   * to that stack trace by only setting `stackTraceHashId`.
   * </pre>
   *
   * <code>int64 stack_trace_hash_id = 2;</code>
   */
  long getStackTraceHashId();
}