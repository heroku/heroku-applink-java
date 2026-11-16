/*
 * Copyright (c) 2026, Salesforce, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.heroku.applink;

/**
 * An authorization lookup can't start because its input or the app's config vars are missing or
 * invalid. Thrown before any request is sent.
 */
public final class ConfigurationException extends AppLinkException {
  private static final long serialVersionUID = 1L;

  ConfigurationException(String message) {
    super(message);
  }
}
