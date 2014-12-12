/**
 * Copyright (C) 2012 the original author or authors.
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

package uk.co.boombastech.conf;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import ninja.ebean.NinjaEbeanModule;
import uk.co.boombastech.homepage.HomepageModule;
import uk.co.boombastech.imperialassault.di.ImperialAssaultModule;
import uk.co.boombastech.repositories.search.ebean.SearchCriteriaEbean;

@Singleton
public class Module extends AbstractModule {

    protected void configure() {
		bind(SearchCriteriaEbean.class);

		install(new NinjaEbeanModule());
        install(new HomepageModule());
		install(new ImperialAssaultModule());
    }
}