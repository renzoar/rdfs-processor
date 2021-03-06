
/* 
 * Copyright 2020 Renzo Angles (http://renzoangles.com/)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import Extractor.Extractor;
import RDFSchema.Schema;
import Reader.SchemaReader;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Run Tester RDFSExtractor");
        SchemaReader reader = new SchemaReader();
        Schema schema = reader.run("./test/sp10k-schema.ttl");
        schema.write("schema.ttl");    }

}
