package hankp.dev.little_functions

/**
 * @author huypham on 1/22/23
 */
interface Downloader {
    fun downloadFile(url: String): Long
}
