package hankp.dev.little_functions.downloader

/**
 * @author huypham on 1/22/23
 */
interface Downloader {
    fun downloadFile(url: String): Long
}
