/*
 * Copyright 2022 Stanislav Batalenkov
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

package com.github.stannismod.gext.engine;

public interface IGlStateManager {

    void translate(float x, float y, float z);

    void rotate(float angle, float x, float y, float z);

    void scale(float x, float y, float z);

    void enableTexture();

    void disableTexture();

    void pushMatrix();

    void popMatrix();

    void setUniforms();

    void loadIdentity();
}
