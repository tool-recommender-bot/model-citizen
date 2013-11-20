package com.tobedevoured.modelcitizen.field;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
   *
 * http://www.apache.org/licenses/LICENSE-2.0
   *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.tobedevoured.modelcitizen.callback.internal.Getable;

/**
 * Callback for a Field when the Model is created
 * @deprecated for {@link com.tobedevoured.modelcitizen.callback.FieldCallback}
 * @author Michael Guymon
 */
@Deprecated
public abstract class FieldCallback implements Getable {
	
	/**
	 * Get the Field value
	 * 
	 * @param referenceModel Object
	 * @return instance of Field class
	 */
	public abstract Object get( Object referenceModel );
}
