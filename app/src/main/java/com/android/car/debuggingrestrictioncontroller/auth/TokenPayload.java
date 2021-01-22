/*
 * Copyright 2020 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.android.car.debuggingrestrictioncontroller.auth;

import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.util.Key;

import java.util.HashMap;

public class TokenPayload extends JsonWebSignature.Payload {

  @Key("nonce")
  private String nonce;

  @Key("deviceId")
  private String deviceId;

  @Key("restrictions")
  private HashMap<String, Boolean> restrictions;

  public String getNonce() {
    return nonce;
  }

  public String getDeviceId() {
    return deviceId;
  }

  public HashMap<String, Boolean> getRestrictions() {
    return restrictions;
  }
}
