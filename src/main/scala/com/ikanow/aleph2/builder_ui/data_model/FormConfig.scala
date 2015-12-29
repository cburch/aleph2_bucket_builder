/*******************************************************************************
* Copyright 2015, The IKANOW Open Source Project.
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
******************************************************************************/
package com.ikanow.aleph2.builder_ui.data_model

import com.greencatsoft.angularjs.core._
import scala.scalajs.js
import com.greencatsoft.angularjs._

@js.native
/** Configures a form element
 * @author alex
 */
trait FormConfig extends js.Object {  
  
  val key:String = js.native
  val `type`:String = js.native
  
  val templateOptions: FormConfigTemplate = js.native
}

@js.native
/** Configures the Gridster Grid - drag specific
 * @author alex
 */
trait FormConfigTemplate extends js.Object {  
  val `type`:String = js.native
  val label:String = js.native
  val placeholder:String = js.native
  val required:Boolean = js.native
}

object FormConfig {
  def apply(key:String, ttype: String, templateOptions: FormConfigTemplate): FormConfig = 
    js.Dynamic.literal(
        key = key,
        `type` = ttype,
        templateOptions = templateOptions
        )
        .asInstanceOf[FormConfig]
}

object FormConfigTemplate {
  def apply(ttype: String, label: String, placeholder: String, required: Boolean): FormConfigTemplate = 
    js.Dynamic.literal(
        `type` = ttype,
        label = label,
        placeholder = placeholder,
        required = required
        )
        .asInstanceOf[FormConfigTemplate]
}
