/*******************************************************************************
 * Copyright 2017, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.events;

import jsinterop.annotations.JsType;
import ol.Disposable;

/**
 * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
 *
 * @author Tino Desjardins
 */
@JsType(isNative = true)
public interface EventTarget extends Disposable {}
