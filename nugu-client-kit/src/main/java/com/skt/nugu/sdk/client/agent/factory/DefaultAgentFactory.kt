/**
 * Copyright (c) 2020 SK Telecom Co., Ltd. All rights reserved.
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
package com.skt.nugu.sdk.client.agent.factory

import com.skt.nugu.sdk.agent.*
import com.skt.nugu.sdk.client.SdkContainer
import com.skt.nugu.sdk.agent.system.AbstractSystemAgent

object DefaultAgentFactory {
    val SYSTEM = object : SystemAgentFactory {
        /**
         * Create an instance of Impl
         * initializing is performed at default initializer
         */
        override fun create(container: SdkContainer): AbstractSystemAgent = with(container) {
            DefaultSystemAgent(
                getMessageSender(),
                getConnectionManager(),
                getContextManager()
            ).apply {
                getDirectiveSequencer().addDirectiveHandler(this)
            }
        }
    }
}