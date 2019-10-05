package com.onurcemkarakoc.datatransferwithhigherorderfunc

class ObjectA(var x:Int) {

    fun print(onresponse:(Int) -> Unit) {
        onresponse(this.x)
    }
}