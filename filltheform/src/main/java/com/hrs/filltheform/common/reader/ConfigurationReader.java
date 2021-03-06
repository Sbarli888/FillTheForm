/*
 * Copyright (C) 2015 HRS GmbH
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
package com.hrs.filltheform.common.reader;

import android.support.annotation.NonNull;

import com.hrs.filltheformcompanion.FillTheFormCompanion;

/**
 * ConfigurationReader reads and parses the data from the configuration file.
 * It can report its status to ConfigurationReaderListener.
 */
public interface ConfigurationReader {

    void readConfigurationFile(@FillTheFormCompanion.ConfigurationSource int source, @NonNull String configurationFilePath);

    String getConfigurationVariablePattern();
}