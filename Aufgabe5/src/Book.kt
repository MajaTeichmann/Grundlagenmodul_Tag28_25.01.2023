class Book{
    var pages: List<Page>
    var currentPage: Int

    constructor(pages: List<Page>){
        this.pages = pages
        this.currentPage = 0
    }

    fun nextPage(){
        if(currentPage < pages.size-1){
            currentPage++
        }
        else{
            println("Letzte Seite erreicht!")
        }
    }

    fun previousPage(){ //vorherigeSeite
        if(currentPage > 0){
            currentPage--
        }
    }

    fun read(){
        pages[currentPage].readPage()
    }

    fun readForwards(){
        for(Page in pages){
            Page.readPage()
        }
    }

    fun readBackwards() {
        for (i in pages.size - 1 downTo 0) {
            pages[i].readPage()
        }
    }
}