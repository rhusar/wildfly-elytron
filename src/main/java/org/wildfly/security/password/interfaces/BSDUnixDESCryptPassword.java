/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.security.password.interfaces;

import org.wildfly.security.password.OneWayPassword;

/**
 * A BSD-style DES "crypt" password.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public interface BSDUnixDESCryptPassword extends OneWayPassword {

    /**
     * The algorithm name.
     */
    String ALGORITHM_BSD_CRYPT_DES = "bsd-crypt-des";

    /**
     * The constant size of the hash, in bytes.
     */
    int BSD_CRYPT_DES_HASH_SIZE = 8;

    /**
     * The constant size of the salt, in bytes.
     */
    int BSD_CRYPT_DES_SALT_SIZE = 3;

    /**
     * The default iteration count.
     */
    int DEFAULT_ITERATION_COUNT = 5001;

    /**
     * Get the iteration count of this password.
     *
     * @return the iteration count
     */
    int getIterationCount();

    /**
     * Get the salt segment of this password as an {@code int} value.
     *
     * @return the salt segment
     */
    int getSalt();

    /**
     * Get the hash segment of this password.
     *
     * @return the hash segment
     */
    byte[] getHash();
}
