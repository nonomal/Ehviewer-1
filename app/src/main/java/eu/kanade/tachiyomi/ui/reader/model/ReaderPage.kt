package eu.kanade.tachiyomi.ui.reader.model

import com.hippo.ehviewer.image.Image
import eu.kanade.tachiyomi.source.model.Page

class ReaderPage(index: Int) : Page(index) {
    var image: Image? = null
}
