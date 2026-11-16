/*
 * Copyright (c) 2026, Salesforce, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.heroku.applink;

/**
 * Data sent to the app is missing or can't be parsed, such as a missing or malformed {@code
 * x-client-context} header.
 */
public final class InvalidInboundDataException extends AppLinkException {
  private static final long serialVersionUID = 1L;

  InvalidInboundDataException(String message) {
    super(message);
  }
}
