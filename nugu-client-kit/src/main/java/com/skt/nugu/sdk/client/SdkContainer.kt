/**
 * Copyright (c) 2019 SK Telecom Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http:www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.skt.nugu.sdk.client

import com.skt.nugu.sdk.core.interfaces.attachment.AttachmentManagerInterface
import com.skt.nugu.sdk.core.interfaces.directive.DirectiveGroupProcessorInterface
import com.skt.nugu.sdk.core.interfaces.directive.DirectiveSequencerInterface
import com.skt.nugu.sdk.core.interfaces.connection.ConnectionManagerInterface
import com.skt.nugu.sdk.core.interfaces.context.ContextManagerInterface
import com.skt.nugu.sdk.core.interfaces.context.PlayStackManagerInterface
import com.skt.nugu.sdk.core.interfaces.dialog.DialogSessionManagerInterface
import com.skt.nugu.sdk.core.interfaces.focus.FocusManagerInterface
import com.skt.nugu.sdk.core.interfaces.inputprocessor.InputProcessorManagerInterface
import com.skt.nugu.sdk.core.interfaces.message.MessageSender
import com.skt.nugu.sdk.core.interfaces.playsynchronizer.PlaySynchronizerInterface

interface SdkContainer {
    fun getInputManagerProcessor(): InputProcessorManagerInterface
    fun getAudioFocusManager(): FocusManagerInterface
    fun getAudioPlayStackManager(): PlayStackManagerInterface
    fun getDisplayPlayStackManager(): PlayStackManagerInterface
    fun getAttachmentManager(): AttachmentManagerInterface
    fun getMessageSender(): MessageSender
    fun getConnectionManager(): ConnectionManagerInterface
    fun getContextManager(): ContextManagerInterface
    fun getDialogSessionManager(): DialogSessionManagerInterface
    fun getPlaySynchronizer(): PlaySynchronizerInterface
    fun getDirectiveSequencer(): DirectiveSequencerInterface
    fun getDirectiveGroupProcessor(): DirectiveGroupProcessorInterface
}