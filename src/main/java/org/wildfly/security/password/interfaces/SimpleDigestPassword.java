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
 * A simple single digest based password.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public interface SimpleDigestPassword extends OneWayPassword {

    /**
     * The algorithm name "simple-digest-md2".
     */
    String ALGORITHM_SIMPLE_DIGEST_MD2 = "simple-digest-md2";

    /**
     * The algorithm name "simple-digest-md5".
     */
    String ALGORITHM_SIMPLE_DIGEST_MD5 = "simple-digest-md5";

    /**
     * The algorithm name "simple-digest-sha-1".
     */
    String ALGORITHM_SIMPLE_DIGEST_SHA_1 = "simple-digest-sha-1";

    /**
     * The algorithm name "simple-digest-sha-256".
     */
    String ALGORITHM_SIMPLE_DIGEST_SHA_256 = "simple-digest-sha-256";

    /**
     * The algorithm name "simple-digest-sha-384".
     */
    String ALGORITHM_SIMPLE_DIGEST_SHA_384 = "simple-digest-sha-384";

    /**
     * The algorithm name "simple-digest-sha-512".
     */
    String ALGORITHM_SIMPLE_DIGEST_SHA_512 = "simple-digest-sha-512";

    /**
     * Get the digest of this password.
     *
     * @return the digest
     */
    byte[] getDigest();
}
