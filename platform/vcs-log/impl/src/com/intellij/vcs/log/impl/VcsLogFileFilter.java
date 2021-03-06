/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.vcs.log.impl;

import com.intellij.vcs.log.VcsLogFilter;
import com.intellij.vcs.log.VcsLogFilterCollection;
import com.intellij.vcs.log.VcsLogRootFilter;
import com.intellij.vcs.log.VcsLogStructureFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VcsLogFileFilter implements VcsLogFilter {
  @Nullable private final VcsLogStructureFilter myStructureFilter;
  @Nullable private final VcsLogRootFilter myRootFilter;

  public VcsLogFileFilter(@Nullable VcsLogStructureFilter structureFilter, @Nullable VcsLogRootFilter rootFilter) {
    myStructureFilter = structureFilter;
    myRootFilter = rootFilter;
  }

  @Nullable
  public VcsLogStructureFilter getStructureFilter() {
    return myStructureFilter;
  }

  @Nullable
  public VcsLogRootFilter getRootFilter() {
    return myRootFilter;
  }

  @NotNull
  @Override
  public VcsLogFilterCollection.FilterKey<?> getKey() {
    return VcsLogFilterCollection.FilterKey.create("file");
  }
}
