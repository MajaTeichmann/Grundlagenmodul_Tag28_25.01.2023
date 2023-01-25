class Page {
    var text: String = ""
    var page: Int = 0

    constructor(text: String) {
        this.text = text
    }

    fun readPage() {
        println(text)
    }
}