package app.babachan.l4s_realm

import io.realm.RealmObject

open class Memo (
    open var title: String = "",
            open var content: String = ""
) : RealmObject()