/*
 * Copyright (C) 2018 The Sylph Authors
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
package ideal.sylph.plugins.hdfs.parquet;

import ideal.sylph.etl.Row;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FileWriter
{
    long getDataSize();

    long getCooldownTime();

    long getCreatedTime();

    String getWritePath();

    void writeLine(Map<String, Object> evalRow);

    public void writeLine(List<Object> evalRow);

    public void writeLine(Row row);

    public void close()
            throws IOException;
}