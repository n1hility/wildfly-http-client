/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2017 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.httpclient.transaction;

import org.wildfly.httpclient.common.ContentType;
import io.undertow.util.HttpString;

/**
 * @author Stuart Douglas
 */
interface TransactionConstants {

    String EXCEPTION = "application/x-wf-jbmar-exception;version=1";
    String XID_VERSION_1 = "application/x-wf-jbmar-xid;version=1";
    String XID = "application/x-wf-jbmar-xid";
    String NEW_TRANSACTION_ACCEPT = "application/x-wf-jbmar-exception;version=1,application/x-wf-jbmar-new-txn;version=1";
    String RECOVER_ACCEPT = "application/x-wf-txn-jbmar-xid-list;version=1,application/x-wf-jbmar-new-txn;version=1";

    HttpString READ_ONLY = new HttpString("x-wf-txn-read-only");
    HttpString TIMEOUT = new HttpString("x-wf-txn-timeout");
    HttpString RECOVERY_PARENT_NAME = new HttpString("x-wf-txn-parent-name");
    HttpString RECOVERY_FLAGS = new HttpString("x-wf-txn-recovery-flags");


    ContentType NEW_TRANSACTION = new ContentType("application/x-wf-jbmar-new-txn", 1);

    String V1_UT_BEGIN = "/v1/ut/begin";
    String V1_UT_COMMIT = "/v1/ut/commit";
    String V1_UT_ROLLBACK = "/v1/ut/rollback";
    String V1_XA_COMMIT = "/v1/xa/commit";
    String V1_XA_ROLLBACK = "/v1/xa/rollback";
    String V1_XA_PREP = "/v1/xa/prep";
    String V1_XA_FORGET = "/v1/xa/forget";
    String V1_XA_BC = "/v1/xa/bc";
    String V1_XA_RECOVER = "/v1/xa/recover";

    String TXN_V1_UT_BEGIN = "/txn" + V1_UT_BEGIN;
    String TXN_V1_UT_COMMIT = "/txn" + V1_UT_COMMIT;
    String TXN_V1_UT_ROLLBACK = "/txn" + V1_UT_ROLLBACK;
    String TXN_V1_XA_COMMIT = "/txn" + V1_XA_COMMIT;
    String TXN_V1_XA_ROLLBACK = "/txn" + V1_XA_ROLLBACK;
    String TXN_V1_XA_PREP = "/txn" + V1_XA_PREP;
    String TXN_V1_XA_FORGET = "/txn" + V1_XA_FORGET;
    String TXN_V1_XA_BC = "/txn" + V1_XA_BC;
    String TXN_V1_XA_RECOVER = "/txn" + V1_XA_RECOVER;

}
