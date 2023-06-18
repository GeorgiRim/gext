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

import com.github.stannismod.gext.api.IGraphicsComponent;
import com.github.stannismod.gext.api.IGraphicsLayout;
import com.github.stannismod.gext.api.IListener;
import com.github.stannismod.gext.api.resource.ITexture;
import com.github.stannismod.gext.utils.Align;
import com.github.stannismod.gext.utils.Bound;
import com.github.stannismod.gext.utils.BaseComponentBuilder;
import com.github.stannismod.gext.utils.TextureMapping;

import java.util.List;

public class GImage extends GBasic {

    protected TextureMapping mapping;

    protected GImage(final int x, final int y, final int width, final int height, final boolean clippingEnabled,
                     final IGraphicsLayout<? extends IGraphicsComponent> parent, final IGraphicsComponent binding,
                     final Bound bound, final Align alignment, final int xPadding, final int yPadding,
                     final List<IListener> listeners, final TextureMapping mapping) {
        super(x, y, width, height, clippingEnabled, parent, binding, bound, alignment, xPadding, yPadding, listeners);
        this.mapping = mapping;
    }

    @Override
    public void draw(int mouseX, int mouseY, float partialTicks) {
        mapping.draw(0, 0, getWidth(), getHeight(), 0);
    }

    public static abstract class BuilderBase extends BaseComponentBuilder<GImage> {

        protected TextureMapping mapping;

        public BuilderBase texture(ITexture location) {
            return texture(location, 256, 256);
        }

        public BuilderBase texture(ITexture location, int textureWidth, int textureHeight) {
            this.mapping = new TextureMapping(location);
            this.mapping.setTextureWidth(textureWidth);
            this.mapping.setTextureHeight(textureHeight);
            return this;
        }

        public BuilderBase uv(int startU, int startV, int u, int v) {
            this.mapping.setU(startU);
            this.mapping.setV(startV);
            this.mapping.setTextureX(u);
            this.mapping.setTextureY(v);
            return this;
        }
    }
}
