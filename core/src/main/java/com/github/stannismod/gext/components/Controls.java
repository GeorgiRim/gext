/*
 * Copyright 2020-2022 Stanislav Batalenkov
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
 */

package com.github.stannismod.gext.components;

public class Controls {

    public static GVerticalScroll.BuilderBase verticalScroll() {
        return new GVerticalScroll.BuilderBase() {
            @Override
            protected GVerticalScroll create() {
                return new GVerticalScroll(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, barWidth, scrollFactor);
            }
        };
    }
}
