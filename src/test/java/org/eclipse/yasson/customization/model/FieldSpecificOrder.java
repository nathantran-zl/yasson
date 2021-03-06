/*
 * Copyright (c) 2016, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.yasson.customization.model;

import javax.json.bind.annotation.JsonbPropertyOrder;

/**
 * @author David Kral
 */
@JsonbPropertyOrder({"aField", "dField"})
public class FieldSpecificOrder {

    public String aField = "aValue";
    public String dField = "dValue";
    public String bField = "bValue";
    public String cField = "cValue";

}
