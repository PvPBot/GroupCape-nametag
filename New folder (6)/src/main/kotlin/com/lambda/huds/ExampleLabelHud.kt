package com.lambda.huds

import com.lambda.ExamplePlugin
import com.lambda.client.event.SafeClientEvent
import com.lambda.client.plugin.api.PluginLabelHud
import com.lambda.client.util.color.ColorHolder
import com.lambda.util.FriendManager

internal object ExampleLabelHud : PluginLabelHud(
    name = "Gooon Squad",
    category = Category.MISC,
    description = "Olympus on top!",
    pluginMain = ExamplePlugin
) {

    override fun SafeClientEvent.updateText() {
        for(player in mc.world.playerEntities) {
            if(FriendManager.isFriendly(player.name)) {
                displayText.add(player.name + "\n", ColorHolder(0,255,0))
            }
            else{
                displayText.add(player.name + "\n", ColorHolder(255,0,0))

            }
        }

    }
}