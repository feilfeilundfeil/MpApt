package de.jensklingenberg.mpapt

import de.jensklingenberg.testAnnotations.TestClass
import de.jensklingenberg.testAnnotations.TestFunction
import de.jensklingenberg.testAnnotations.TestProperty
import de.jensklingenberg.testAnnotations.TestValueParameter


@TestClass
class JsSecondAnnotated {

    @TestProperty
    val name: String? = null

    @TestFunction
    fun what() {

    }

    fun elses(@TestValueParameter param: String) {

    }

}