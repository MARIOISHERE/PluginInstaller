package tech.nully.PluginInstaller;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class PluginList {
    private static String[] AlphaPluginList = new String[]{"AntiSwear", "AyunCord", "BitchFilter", "CoreProtect", "CrackShot", "CraftBook", "DupePatch", "DynMap", "Essentials",
    "EssenttialsAntiBuild", "EssentialsChat", "EssentialsProtect", "EssentialsSpawn", "Factions", "MCore", "Multiverse", "MyWarp", "PermissionSex", "ProtocolLib",
    "Vault", "WorldEdit", "WorldGuard"};
    public static void SendPG1ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");
        int SecondCollumn = 8;
        for (int i = 1; i < 8; i++) {
            sender.sendMessage(i+". "+ AlphaPluginList[i-1] + "" +SecondCollumn + ". " + AlphaPluginList[SecondCollumn-1]);
            SecondCollumn++;
        }
        sender.sendMessage("       Page 1 of 12");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG2ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 22;
        for (int i = 15; i < 22; i++) {
            String Col1 = "";
            String Col2 = "";

            //  Null checkers for elements in the Array
            if (AlphaPluginList[i-1] != null) {
                Col1 = AlphaPluginList[i-1];
            } else {
                Col1 = "N/A";
            }
            if (AlphaPluginList[SecondCollumn-1] != null) {
                Col2 = AlphaPluginList[SecondCollumn-1];
            } else {
                Col2 = "N/A";
            }
            // _________________________________________

            sender.sendMessage(i+". "+ Col1 + "" + SecondCollumn + ". " + Col2);
            SecondCollumn++;
        }

        sender.sendMessage("       Page 2 of 12");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }

    public static void SendPG3ToSender(CommandSender sender) {
        sender.sendMessage(ChatColor.GREEN + "Here is a list of available plugins in the database:");

        // List -------------------------------------------------------------
        int SecondCollumn = 36;
        for (int i = 29; i < 36; i++) {
            String Col31;
            String Col32;

            //  Null checkers for elements in the Array
            if (AlphaPluginList[i-1] != null) {
                Col31 = AlphaPluginList[i-1];
            } else {
                Col31 = "N/A";
            }
            if (AlphaPluginList[SecondCollumn-1] != null) {
                Col32 = AlphaPluginList[SecondCollumn-1];
            } else {
                Col32 = "N/A";
            }
            // _________________________________________

            sender.sendMessage(i+". "+ Col31 + "" + SecondCollumn + ". " + Col32);
            SecondCollumn++;
        }

        sender.sendMessage("       Page 3 of 12");
        sender.sendMessage("Note: You do not need to have proper");
        sender.sendMessage("capitalization when using the install command");
    }
}

