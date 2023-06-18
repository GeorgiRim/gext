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

package com.github.stannismod.gext.forge1710.adapter;

import com.github.stannismod.gext.api.adapter.IFontRenderer;
import com.github.stannismod.gext.api.adapter.IResourceManager;
import com.github.stannismod.gext.api.adapter.IScaledResolution;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.jetbrains.annotations.NotNull;

public class MinecraftResourceManager implements IResourceManager {

    public static MinecraftFontRenderer DEFAULT_FONTRENDERER;

    @Override
    public @NotNull IScaledResolution scaled() {
        return new MinecraftScaledResolution(new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight));
    }

    @Override
    public @NotNull IFontRenderer standardRenderer() {
        if (DEFAULT_FONTRENDERER == null) {
            DEFAULT_FONTRENDERER = new MinecraftFontRenderer(Minecraft.getMinecraft().fontRenderer);
        }
        return DEFAULT_FONTRENDERER;
    }
}
