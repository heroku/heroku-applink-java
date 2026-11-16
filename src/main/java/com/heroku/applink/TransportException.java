/*
 * Copyright (c) 2026, Salesforce, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.heroku.applink;

/**
 * A request to the AppLink API didn't complete, for example because the connection failed or timed
 * out.
 */
public final class TransportException extends AppLinkException {
  private static final long serialVersionUID = 1L;

  TransportException(String message, Throwable cause) {
    super(message, cause);
  }
}
