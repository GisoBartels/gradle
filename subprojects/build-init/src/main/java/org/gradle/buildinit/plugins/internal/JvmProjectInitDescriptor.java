/*
 * Copyright 2019 the original author or authors.
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

package org.gradle.buildinit.plugins.internal;

public abstract class JvmProjectInitDescriptor extends LanguageLibraryProjectInitDescriptor {
    @Override
    public boolean supportsPackage() {
        return true;
    }

    @Override
    public void generate(InitSettings settings, BuildScriptBuilder buildScriptBuilder, TemplateFactory templateFactory) {
        buildScriptBuilder.repositories().jcenter("Use jcenter for resolving dependencies.\nYou can declare any Maven/Ivy/file repository here.");
        // TODO: remove when migrating to Groovy 2.5.10 GA
        buildScriptBuilder.repositories().maven("Temporary Groovy snapshots repository for Groovy 2.5.10 JDK14 support evaluation", "https://oss.jfrog.org/artifactory/oss-snapshot-local");
    }
}
