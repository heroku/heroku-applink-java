/*
 * Copyright (c) 2026, Salesforce, Inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 */
package com.heroku.applink;

import java.util.Objects;

/**
 * A Salesforce user.
 *
 * @param id the ID of the user
 * @param username the username of the user
 */
public record User(String id, String username) {
  /**
   * Creates a user.
   *
   * @param id the ID of the user
   * @param username the username of the user
   */
  public User {
    Objects.requireNonNull(id, "id");
    Objects.requireNonNull(username, "username");
  }
}
