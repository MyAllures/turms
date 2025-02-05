/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.rpc.service;

import im.turms.common.constant.DeviceType;
import im.turms.server.common.constraint.ValidDeviceType;
import im.turms.server.common.dto.CloseReason;
import reactor.core.publisher.Mono;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author James Chen
 */
public interface ISessionService {

    Mono<Boolean> setLocalSessionsOfflineByIp(
            @NotNull byte[] ip,
            @NotNull CloseReason closeReason);

    Mono<Boolean> setLocalSessionOfflineByUserIdAndDeviceTypes(
            @NotNull Long userId,
            @NotEmpty Set<@ValidDeviceType DeviceType> deviceTypes,
            @NotNull CloseReason closeReason);

    Mono<Boolean> setLocalUserOffline(
            @NotNull Long userId,
            @NotNull CloseReason closeReason);

}
