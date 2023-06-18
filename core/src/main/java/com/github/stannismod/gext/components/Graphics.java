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
import com.github.stannismod.gext.components.container.BasicLayout;
import com.github.stannismod.gext.components.container.GList;
import com.github.stannismod.gext.components.container.GPanel;
import com.github.stannismod.gext.components.container.GTabPanel;
import com.github.stannismod.gext.components.text.GTextBox;
import com.github.stannismod.gext.components.text.GTextPanel;

public class Graphics {

    public static GLabel.Builder label() {
        return new GLabel.Builder() {
            @Override
            protected GLabel create() {
                return new GLabel(x, y, clippingEnabled, parent, binding, bound, alignment, xPadding, yPadding,
                        listeners, text, color, fontRenderer, scale, centered);
            }
        };
    }

    public static GLink.BuilderBase link() {
        return new GLink.BuilderBase() {
            @Override
            protected GLink create() {
                return new GLink(x, y, clippingEnabled, parent, binding, bound, alignment, xPadding, yPadding,
                        listeners, text, color, fontRenderer, scale, centered, activeColor, inactiveColor, uri);
            }
        };
    }

    public static GButton.BuilderBase button() {
        return new GButton.BuilderBase() {
            @Override
            protected GButton create() {
                return new GButton(x, y, width, height, clippingEnabled, parent, binding, bound, alignment, xPadding,
                        yPadding, listeners, label, action);
            }
        };
    }

    public static GImage.BuilderBase image() {
        return new GImage.BuilderBase() {
            @Override
            protected GImage create() {
                return new GImage(x, y, width, height, clippingEnabled, parent, binding, bound, alignment, xPadding,
                        yPadding, listeners, mapping);
            }
        };
    }

    public static GBackground.BuilderBase background() {
        return new GBackground.BuilderBase() {
            @Override
            protected GBackground create() {
                return new GBackground(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, borderSize, cornerSize);
            }
        };
    }

    public static GTextPanel.BuilderBase textPanel() {
        return new GTextPanel.BuilderBase() {
            @Override
            protected GTextPanel create() {
                return new GTextPanel(x, y, width, height, clippingEnabled, parent, binding, bound, alignment, xPadding,
                        yPadding, listeners, xOffset, yOffset, interval, text, textList, scale, title, titleScale,
                        backgroundDrawingEnabled, wrapContent, renderer, scrollHandler);
            }
        };
    }

    public static GTextBox.BuilderBase textBox() {
        return new GTextBox.BuilderBase() {
            @Override
            protected GTextBox create() {
                return new GTextBox(x, y, width, height, clippingEnabled, parent, binding, bound, alignment, xPadding,
                        yPadding, listeners, xOffset, yOffset, interval, text, textList, scale, title, titleScale,
                        backgroundDrawingEnabled, wrapContent, renderer, scrollHandler);
            }
        };
    }

    public static BasicLayout.BuilderBase layout() {
        return new BasicLayout.BuilderBase() {
            @Override
            protected BasicLayout create() {
                return new BasicLayout(x, y, width, height, clippingEnabled, parent, binding,
                        bound, alignment, xPadding, yPadding, listeners, tooltip, selector);
            }
        };
    }

    public static <T extends IGraphicsComponent> GPanel.BuilderBase panel() {
        return new GPanel.BuilderBase() {
            @Override
            protected GPanel<T> create() {
                return new GPanel<>(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, tooltip, selector, scrollHandler, xOffset, yOffset, wrapContent);
            }
        };
    }

    public static <T extends IGraphicsComponent> GList.BuilderBase list() {
        return new GList.BuilderBase() {
            @Override
            protected GList<T> create() {
                return new GList<>(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, tooltip, selector, scrollHandler, xOffset, yOffset,
                        wrapContent, background, drawBackground, interval);
            }
        };
    }

    public static <K extends IGraphicsComponent, V extends IGraphicsComponent> GTabPanel.BuilderBase tabPanel() {
            return new GTabPanel.BuilderBase() {
            @Override
            protected GTabPanel<K, V> create() {
                return new GTabPanel<>(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, tooltip, selector, scrollHandler, xOffset, yOffset,
                        wrapContent, background, drawBackground, interval, target, contentMap, deselectionEnabled);
            }
        };
    }

    public static GCheckBox.BuilderBase checkbox() {
        return new GCheckBox.BuilderBase() {
            @Override
            protected GCheckBox create() {
                return new GCheckBox(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners);
            }
        };
    }

    public static GProgressBar.BuilderBase progressBar() {
        return new GProgressBar.BuilderBase() {
            @Override
            protected GProgressBar create() {
                return new GProgressBar(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners);
            }
        };
    }

    public static GRadioButton.BuilderBase radioButton() {
        return new GRadioButton.BuilderBase() {
            @Override
            protected GRadioButton create() {
                return new GRadioButton(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, interval, checkBoxSize);
            }
        };
    }

    public static Tooltip.BuilderBase tooltip() {
        return new Tooltip.BuilderBase() {
            @Override
            protected Tooltip create() {
                return new Tooltip(x, y, width, height, clippingEnabled, parent, binding, bound, alignment,
                        xPadding, yPadding, listeners, selector, buildXOffset, buildYOffset);
            }
        };
    }
}
