/*
 * Copyright 2013 Topher Donovan (themaskedcrusader.com)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.themaskedcrusader.tmcz.modules.mobs;

import com.themaskedcrusader.bukkit.config.ConfigAccessor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class SpawnControl {
    private static String fileName = "spawn-control.yml";
    private static ConfigAccessor settings;

    private SpawnControl() {}

    public static void init(JavaPlugin plugin) {
        settings = new ConfigAccessor(plugin, fileName);
        settings.reloadConfig();
        settings.saveDefaultConfig();
    }

    public static FileConfiguration getConfig() {
        return settings.getConfig();
    }

    public static ConfigAccessor get() {
        return settings;
    }

    public static void saveConfig() {
        settings.saveConfig();
    }
}
