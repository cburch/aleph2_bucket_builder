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

import scala.scalajs.js.annotation.JSExportAll
import scala.scalajs.js.annotation.JSExport

@js.native
/** The configuration object for Formly
 *  Represented as a bean because we're passing it around as JSON via Java APIs
 *  We then turn into JS objects via upicke/JSON.parse
 * @author alex
 */
trait FormConfigJs extends js.Object {
  val key: String = js.native
  val `type`: String = js.native
  val templateOptions: FormConfigTemplateJs = js.native
}

object FormConfigJs {
  def apply(
    key: String = null, 
    ttype: String = null, 
    templateOptions: FormConfigTemplateJs = null): FormConfigJs =     
  js.Dynamic.literal(key = key, `type` = ttype, templateOptions = templateOptions).asInstanceOf[FormConfigJs]
  
}

@js.native
/** More configuration for Formly
 *  Represented as a bean because we're passing it around as JSON via Java APIs
 *  We then turn into JS objects via upicke/JSON.parse
 * @author alex
 */
trait FormConfigTemplateJs extends js.Object {
   val `type`: String = js.native
   val label: String = js.native
   val placeholder: String = js.native
   val options: js.Array[js.Dictionary[js.Any]] = js.native
   val ngOptions: String = js.native
   val required: Boolean = js.native
}

object FormConfigTemplateJs {
  def apply(
        ttype: String = null, 
        label: String = null, 
        placeholder: String = null, 
        options: js.Array[js.Dictionary[js.Any]] = null,
        ngOptions: String = null,
        required: Boolean = false
      ): FormConfigTemplateJs = 
  js.Dynamic.literal(`type` = ttype, label = label, placeholder = placeholder, options = options, ngOptions = ngOptions, required = required).asInstanceOf[FormConfigTemplateJs]
}