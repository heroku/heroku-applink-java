/*
 * Copyright (c) 2026, Salesforce, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.heroku.applink;

/** The common base class of all exceptions the SDK throws. */
public sealed class AppLinkException extends RuntimeException
    permits InvalidInboundDataException,
        ConfigurationException,
        TransportException,
        HttpException,
        UnusableAuthorizationException,
        UnexpectedResponseException {
  private static final long serialVersionUID = 1L;

  AppLinkException(String message) {
    super(message);
  }

  AppLinkException(String message, Throwable cause) {
    super(message, cause);
  }
}
