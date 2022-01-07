/*
 * Copyright (c) 2021 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 */

package com.adyenreact;

import com.adyen.checkout.core.api.Environment;

public class DropInConfigHelper {

    static public Environment parseEnvironment(String string) {
        switch (string.toLowerCase()) {
            case "live_europe":
            case "live":
                return Environment.EUROPE;
            case "live_us":
                return Environment.UNITED_STATES;
            case "live_australia":
                return Environment.AUSTRALIA;
            default:
                return Environment.TEST;
        }
    }
}