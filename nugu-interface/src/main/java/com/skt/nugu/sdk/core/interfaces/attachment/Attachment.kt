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
package com.skt.nugu.sdk.core.interfaces.attachment

/**
 * The attachment interface
 */
interface Attachment {
    /**
     * Create a [Reader] which can read attachment
     * @return the reader
     */
    fun createReader(): Reader

    /**
     * Create a [Writer] which can write to attachment
     * @return the writer
     */
    fun createWriter(): Writer

    /**
     * Provides an interface for writing data into the attachment
     */
    interface Writer {
        /** Write bytes into the attachment
         * @param bytes the data to write
         */
        fun write(bytes: ByteArray)

        /**
         * Close the writer
         */
        fun close()

        /**
         * Check whether closed or not
         * @return true: closed, false: otherwise
         */
        fun isClosed(): Boolean
    }

    /**
     * Provides an interface for reading data from the attachment
     */
    interface Reader {
        /** Read bytes from attachment
         * @param bytes the byte array into which the data is read.
         * @param offsetInBytes the start offset in data
         * @param sizeInBytes the maximum number of bytes to read
         *
         * @return the total number of bytes which read, or or -1 if cannot read anymore because of various reason.
         */
        fun read(bytes: ByteArray, offsetInBytes: Int, sizeInBytes: Int): Int

        /**
         * Close the reader
         */
        fun close()

        /**
         * Check whether closed or not
         * @return true: closed, false: otherwise
         */
        fun isClosed(): Boolean
    }

    /**
     * @return true: if has created reader, false: otherwise
     */
    fun hasCreatedReader(): Boolean

    /**
     * @return true: if has created writer, false: otherwise
     */
    fun hasCreatedWriter(): Boolean
}