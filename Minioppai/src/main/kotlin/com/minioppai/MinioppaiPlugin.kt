package com.minioppai

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class MinioppaiPlugin: Plugin() {
    override fun load(context: Context) {
        // All providers should be added in this manner. Please don't edit the providers list directly.
        registerMainAPI(Minioppai())
        registerExtractorAPI(Streampai())
        registerExtractorAPI(Paistream())
        registerExtractorAPI(TvMinioppai())
    }
}