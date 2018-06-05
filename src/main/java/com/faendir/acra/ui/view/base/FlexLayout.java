/*
 * (C) Copyright 2018 Lukas Morawietz (https://github.com/F43nd1r)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.faendir.acra.ui.view.base;

import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.themes.AcraTheme;

/**
 * @author lukas
 * @since 28.05.18
 */
public class FlexLayout extends CssLayout {
    public FlexLayout(Component... children) {
        super(children);
        setResponsive(true);
        addStyleName(AcraTheme.FLEX_LAYOUT);
    }

    @Override
    public void addComponent(Component c) {
        super.addComponent(c);
        c.addStyleName(AcraTheme.FLEX_ITEM);
    }
}
