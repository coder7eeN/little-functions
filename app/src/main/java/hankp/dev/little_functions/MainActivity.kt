package hankp.dev.little_functions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import hankp.dev.little_functions.downloader.AndroidDownloader

/**
 * @author huypham on 1/22/23
 */
class MainActivity: AppCompatActivity() {
    companion object {
        private const val DOWNLOAD_LINK = "https://w0.peakpx.com/wallpaper/798/1016/HD-wallpaper-re-zero-emilia-yukata-fireworks-festival-anime.jpg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val downloader = AndroidDownloader(this)
        downloader.downloadFile(DOWNLOAD_LINK)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
