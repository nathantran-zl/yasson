/*
 * Copyright (c) 2017, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.yasson.defaultmapping.basic.model;

/**
 * Encapsulates Number type of field so the serialization and deserialization of number can be tested
 *
 * @author David Kral
 */
public class BigDecimalInNumber {

    private Number bigDecValue;

    public BigDecimalInNumber(){
    }

    public Number getBigDecValue() {
        return bigDecValue;
    }

    public void setBigDecValue(Number bigDecValue) {
        this.bigDecValue = bigDecValue;
    }
}
