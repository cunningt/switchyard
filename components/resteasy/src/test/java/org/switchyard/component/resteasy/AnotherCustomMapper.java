/*
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.component.resteasy;

import org.switchyard.Context;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyContextMapper;


/**
 * Custom ContextMapper.
 *
 * @author Magesh Kumar B <mageshbk@jboss.com> &copy; 2013 Red Hat Inc.
 */
public class AnotherCustomMapper extends RESTEasyContextMapper {

    /**
     * {@inheritDoc}
     */
    @Override
    public void mapTo(Context context, RESTEasyBindingData target) throws Exception {
        // delegate to parent to pick up existing context mapping logic for RESTEasy
        super.mapTo(context, target);
        // add a custom header
        target.addHeader("bar", "123");
        target.addHeader("bar", "456");
    }

}
