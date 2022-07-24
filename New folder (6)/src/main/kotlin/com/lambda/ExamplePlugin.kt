package com.lambda

import com.lambda.client.plugin.api.Plugin
import com.lambda.huds.ExampleLabelHud

internal object ExamplePlugin : Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
        hudElements.add(ExampleLabelHud)
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}