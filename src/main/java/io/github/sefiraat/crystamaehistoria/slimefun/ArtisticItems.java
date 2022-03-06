package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.BasicPaintbrush;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.ImbuedStand;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.InfinitePaintbrush;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.MagicPaintbrush;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.PaintProfile;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.PoseChanger;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.artistic.PoseCloner;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.text.MessageFormat;

@UtilityClass
public class ArtisticItems {

    @Getter
    private static BasicPaintbrush blackPaintBrush100;
    @Getter
    private static BasicPaintbrush bluePaintBrush100;
    @Getter
    private static BasicPaintbrush brownPaintBrush100;
    @Getter
    private static BasicPaintbrush cyanPaintBrush100;
    @Getter
    private static BasicPaintbrush grayPaintBrush100;
    @Getter
    private static BasicPaintbrush greenPaintBrush100;
    @Getter
    private static BasicPaintbrush lightBluePaintBrush100;
    @Getter
    private static BasicPaintbrush lightGrayPaintBrush100;
    @Getter
    private static BasicPaintbrush limePaintBrush100;
    @Getter
    private static BasicPaintbrush magentaPaintBrush100;
    @Getter
    private static BasicPaintbrush orangePaintBrush100;
    @Getter
    private static BasicPaintbrush pinkPaintBrush100;
    @Getter
    private static BasicPaintbrush purplePaintBrush100;
    @Getter
    private static BasicPaintbrush redPaintBrush100;
    @Getter
    private static BasicPaintbrush whitePaintBrush100;
    @Getter
    private static BasicPaintbrush yellowPaintBrush100;
    @Getter
    private static BasicPaintbrush blackPaintBrush1000;
    @Getter
    private static BasicPaintbrush bluePaintBrush1000;
    @Getter
    private static BasicPaintbrush brownPaintBrush1000;
    @Getter
    private static BasicPaintbrush cyanPaintBrush1000;
    @Getter
    private static BasicPaintbrush grayPaintBrush1000;
    @Getter
    private static BasicPaintbrush greenPaintBrush1000;
    @Getter
    private static BasicPaintbrush lightBluePaintBrush1000;
    @Getter
    private static BasicPaintbrush lightGrayPaintBrush1000;
    @Getter
    private static BasicPaintbrush limePaintBrush1000;
    @Getter
    private static BasicPaintbrush magentaPaintBrush1000;
    @Getter
    private static BasicPaintbrush orangePaintBrush1000;
    @Getter
    private static BasicPaintbrush pinkPaintBrush1000;
    @Getter
    private static BasicPaintbrush purplePaintBrush1000;
    @Getter
    private static BasicPaintbrush redPaintBrush1000;
    @Getter
    private static BasicPaintbrush whitePaintBrush1000;
    @Getter
    private static BasicPaintbrush yellowPaintBrush1000;
    @Getter
    private static SlimefunItem mysticalPigmentato;
    @Getter
    private static SlimefunItem mysticalTintanno;
    @Getter
    private static InfinitePaintbrush paintersResolve;
    @Getter
    private static SlimefunItem bodyStand;
    @Getter
    private static SlimefunItem mindStand;
    @Getter
    private static SlimefunItem soulStand;
    @Getter
    private static SlimefunItem mysticalAttitudinizer;
    @Getter
    private static ImbuedStand imbuedStand;
    @Getter
    private static PoseChanger poseChanger;
    @Getter
    private static PoseCloner poseCloner;

    public static void setup() {

        CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        final ItemStack brushCore = Materials.getBasicFibres().getItem();
        final ItemStack dyeBlack = new ItemStack(Material.BLACK_DYE);
        final ItemStack dyeBlue = new ItemStack(Material.BLUE_DYE);
        final ItemStack dyeBrown = new ItemStack(Material.BROWN_DYE);
        final ItemStack dyeCyan = new ItemStack(Material.CYAN_DYE);
        final ItemStack dyeGray = new ItemStack(Material.GRAY_DYE);
        final ItemStack dyeGreen = new ItemStack(Material.GREEN_DYE);
        final ItemStack dyeLightBlue = new ItemStack(Material.LIGHT_BLUE_DYE);
        final ItemStack dyeLightGray = new ItemStack(Material.LIGHT_GRAY_DYE);
        final ItemStack dyeLime = new ItemStack(Material.LIME_DYE);
        final ItemStack dyeMagenta = new ItemStack(Material.MAGENTA_DYE);
        final ItemStack dyeOrange = new ItemStack(Material.ORANGE_DYE);
        final ItemStack dyePink = new ItemStack(Material.PINK_DYE);
        final ItemStack dyePurple = new ItemStack(Material.PURPLE_DYE);
        final ItemStack dyeRed = new ItemStack(Material.RED_DYE);
        final ItemStack dyeWhite = new ItemStack(Material.WHITE_DYE);
        final ItemStack dyeYellow = new ItemStack(Material.YELLOW_DYE);

        // Black Paintbrush 100
        blackPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_BLACK_100",
                MagicPaintbrush.getTippedBrush(DyeColor.BLACK),
                ThemeType.TOOL,
                "魔法画刷 (黑色)",
                "可以将染色方块染成黑色.",
                "", 
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeBlack, dyeBlack, dyeBlack,
                dyeBlack, brushCore, dyeBlack,
                dyeBlack, dyeBlack, dyeBlack
            },
            PaintProfile.BLACK,
            100
        );

        // Blue Paintbrush 100
        bluePaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_BLUE_100",
                MagicPaintbrush.getTippedBrush(DyeColor.BLUE),
                ThemeType.TOOL,
                "魔法画刷 (蓝色)",
                "可以将染色方块染成蓝色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeBlue, dyeBlue, dyeBlue,
                dyeBlue, brushCore, dyeBlue,
                dyeBlue, dyeBlue, dyeBlue
            },
            PaintProfile.BLUE,
            100
        );

        // Brown Paintbrush 100
        brownPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_BROWN_100",
                MagicPaintbrush.getTippedBrush(DyeColor.BROWN),
                ThemeType.TOOL,
                "魔法画刷 (棕色)",
                "可以将染色方块染成棕色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeBrown, dyeBrown, dyeBrown,
                dyeBrown, brushCore, dyeBrown,
                dyeBrown, dyeBrown, dyeBrown
            },
            PaintProfile.BROWN,
            100
        );

        // Cyan Paintbrush 100
        cyanPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_CYAN_100",
                MagicPaintbrush.getTippedBrush(DyeColor.CYAN),
                ThemeType.TOOL,
                "魔法画刷 (青色)",
                "可以将染色方块染成青色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeCyan, dyeCyan, dyeCyan,
                dyeCyan, brushCore, dyeCyan,
                dyeCyan, dyeCyan, dyeCyan
            },
            PaintProfile.CYAN,
            100
        );

        // Gray Paintbrush 100
        grayPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_GRAY_100",
                MagicPaintbrush.getTippedBrush(DyeColor.GRAY),
                ThemeType.TOOL,
                "魔法画刷 (灰色)",
                "可以将染色方块染成灰色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeGray, dyeGray, dyeGray,
                dyeGray, brushCore, dyeGray,
                dyeGray, dyeGray, dyeGray
            },
            PaintProfile.GRAY,
            100
        );

        // Green Paintbrush 100
        greenPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_GREEN_100",
                MagicPaintbrush.getTippedBrush(DyeColor.GREEN),
                ThemeType.TOOL,
                "魔法画刷 (绿色)",
                "可以将染色方块染成绿色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeGreen, dyeGreen, dyeGreen,
                dyeGreen, brushCore, dyeGreen,
                dyeGreen, dyeGreen, dyeGreen
            },
            PaintProfile.GREEN,
            100
        );

        // Light Blue Paintbrush 100
        lightBluePaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_LIGHT_BLUE_100",
                MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_BLUE),
                ThemeType.TOOL,
                "魔法画刷 (淡蓝色)",
                "可以将染色方块染成淡蓝色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeLightBlue, dyeLightBlue, dyeLightBlue,
                dyeLightBlue, brushCore, dyeLightBlue,
                dyeLightBlue, dyeLightBlue, dyeLightBlue
            },
            PaintProfile.LIGHT_BLUE,
            100
        );

        // Light Gray Paintbrush 100
        lightGrayPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_LIGHT_GRAY_100",
                MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_GRAY),
                ThemeType.TOOL,
                "魔法画刷 (淡灰色)",
                "可以将染色方块染成淡灰色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeLightGray, dyeLightGray, dyeLightGray,
                dyeLightGray, brushCore, dyeLightGray,
                dyeLightGray, dyeLightGray, dyeLightGray
            },
            PaintProfile.LIGHT_GRAY,
            100
        );

        // Lime Paintbrush 100
        limePaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_LIME_100",
                MagicPaintbrush.getTippedBrush(DyeColor.LIME),
                ThemeType.TOOL,
                "魔法画刷 (黄绿色)",
                "可以将染色方块染成黄绿色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeLime, dyeLime, dyeLime,
                dyeLime, brushCore, dyeLime,
                dyeLime, dyeLime, dyeLime
            },
            PaintProfile.LIME,
            100
        );

        // Magenta Paintbrush 100
        magentaPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_MAGENTA_100",
                MagicPaintbrush.getTippedBrush(DyeColor.MAGENTA),
                ThemeType.TOOL,
                "魔法画刷 (品红色)",
                "可以将染色方块染成品红色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeMagenta, dyeMagenta, dyeMagenta,
                dyeMagenta, brushCore, dyeMagenta,
                dyeMagenta, dyeMagenta, dyeMagenta
            },
            PaintProfile.MAGENTA,
            100
        );

        // Orange Paintbrush 100
        orangePaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_ORANGE_100",
                MagicPaintbrush.getTippedBrush(DyeColor.ORANGE),
                ThemeType.TOOL,
                "魔法画刷 (橙色)",
                "可以将染色方块染成橙色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeOrange, dyeOrange, dyeOrange,
                dyeOrange, brushCore, dyeOrange,
                dyeOrange, dyeOrange, dyeOrange
            },
            PaintProfile.ORANGE,
            100
        );

        // Pink Paintbrush 100
        pinkPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_PINK_100",
                MagicPaintbrush.getTippedBrush(DyeColor.PINK),
                ThemeType.TOOL,
                "魔法画刷 (粉色)",
                "可以将染色方块染成粉色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyePink, dyePink, dyePink,
                dyePink, brushCore, dyePink,
                dyePink, dyePink, dyePink
            },
            PaintProfile.PINK,
            100
        );

        // Purple Paintbrush 100
        purplePaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_PURPLE_100",
                MagicPaintbrush.getTippedBrush(DyeColor.PURPLE),
                ThemeType.TOOL,
                "魔法画刷 (紫色)",
                "可以将染色方块染成紫色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyePurple, dyePurple, dyePurple,
                dyePurple, brushCore, dyePurple,
                dyePurple, dyePurple, dyePurple
            },
            PaintProfile.PURPLE,
            100
        );

        // Red Paintbrush 100
        redPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_RED_100",
                MagicPaintbrush.getTippedBrush(DyeColor.RED),
                ThemeType.TOOL,
                "魔法画刷 (红色)",
                "可以将染色方块染成红色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeRed, dyeRed, dyeRed,
                dyeRed, brushCore, dyeRed,
                dyeRed, dyeRed, dyeRed
            },
            PaintProfile.RED,
            100
        );

        // White Paintbrush 100
        whitePaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_WHITE_100",
                MagicPaintbrush.getTippedBrush(DyeColor.WHITE),
                ThemeType.TOOL,
                "魔法画刷 (白色)",
                "可以将染色方块染成白色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeWhite, dyeWhite, dyeWhite,
                dyeWhite, brushCore, dyeWhite,
                dyeWhite, dyeWhite, dyeWhite
            },
            PaintProfile.WHITE,
            100
        );

        // Yellow Paintbrush 100
        yellowPaintBrush100 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_YELLOW_100",
                MagicPaintbrush.getTippedBrush(DyeColor.YELLOW),
                ThemeType.TOOL,
                "魔法画刷 (黄色)",
                "可以将染色方块染成黄色.",
                "",
                LoreBuilder.usesLeft(100)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                dyeYellow, dyeYellow, dyeYellow,
                dyeYellow, brushCore, dyeYellow,
                dyeYellow, dyeYellow, dyeYellow
            },
            PaintProfile.YELLOW,
            100
        );

        // Black Paintbrush 1000
        RecipeItem blackPaintbrush1000Recipe = new RecipeItem(
            blackPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        blackPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_BLACK_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.BLACK),
                ThemeType.TOOL,
                "魔法画刷 (黑色)",
                "可以将染色方块染成黑色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            blackPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.BLACK,
            1000
        );

        // Blue Paintbrush 1000
        RecipeItem bluePaintbrush1000Recipe = new RecipeItem(
            bluePaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        bluePaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_BLUE_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.BLUE),
                ThemeType.TOOL,
                "魔法画刷 (蓝色)",
                "可以将染色方块染成蓝色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            bluePaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.BLUE,
            1000
        );

        // Brown Paintbrush 1000
        RecipeItem brownPaintbrush1000Recipe = new RecipeItem(
            brownPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        brownPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_BROWN_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.BROWN),
                ThemeType.TOOL,
                "魔法画刷 (棕色)",
                "可以将染色方块染成棕色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            brownPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.BROWN,
            1000
        );

        // Cyan Paintbrush 1000
        RecipeItem cyanPaintbrush1000Recipe = new RecipeItem(
            cyanPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        cyanPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_CYAN_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.CYAN),
                ThemeType.TOOL,
                "魔法画刷 (青色)",
                "可以将染色方块染成青色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            cyanPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.CYAN,
            1000
        );

        // Gray Paintbrush 1000
        RecipeItem grayPaintbrush1000Recipe = new RecipeItem(
            grayPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        grayPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_GRAY_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.GRAY),
                ThemeType.TOOL,
                "魔法画刷 (灰色)",
                "可以将染色方块染成灰色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            grayPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.GRAY,
            1000
        );

        // Green Paintbrush 1000
        RecipeItem greenPaintbrush1000Recipe = new RecipeItem(
            greenPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        greenPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_GREEN_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.GREEN),
                ThemeType.TOOL,
                "魔法画刷 (绿色)",
                "可以将染色方块染成绿色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            greenPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.GREEN,
            1000
        );

        // Light Blue Paintbrush 1000
        RecipeItem lightBluePaintbrush1000Recipe = new RecipeItem(
            lightBluePaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        lightBluePaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_LIGHT_BLUE_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_BLUE),
                ThemeType.TOOL,
                "魔法画刷 (淡蓝色)",
                "可以将染色方块染成淡蓝色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            lightBluePaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.LIGHT_BLUE,
            1000
        );

        // Light Gray Paintbrush 1000
        RecipeItem lightGrayPaintbrush1000Recipe = new RecipeItem(
            lightGrayPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        lightGrayPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_LIGHT_GRAY_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_GRAY),
                ThemeType.TOOL,
                "魔法画刷 (淡灰色)",
                "可以将染色方块染成淡灰色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            lightGrayPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.LIGHT_GRAY,
            1000
        );

        // Lime Paintbrush 1000
        RecipeItem limePaintbrush1000Recipe = new RecipeItem(
            limePaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        limePaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_LIME_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.LIME),
                ThemeType.TOOL,
                "魔法画刷 (黄绿色)",
                "可以将染色方块染成黄绿色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            limePaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.LIME,
            1000
        );

        // Magenta Paintbrush 1000
        RecipeItem magentaPaintbrush1000Recipe = new RecipeItem(
            magentaPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        magentaPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_MAGENTA_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.MAGENTA),
                ThemeType.TOOL,
                "魔法画刷 (品红色)",
                "可以将染色方块染成品红色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            magentaPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.MAGENTA,
            1000
        );

        // Orange Paintbrush 1000
        RecipeItem orangePaintbrush1000Recipe = new RecipeItem(
            orangePaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        orangePaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_ORANGE_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.ORANGE),
                ThemeType.TOOL,
                "魔法画刷 (橙色)",
                "可以将染色方块染成橙色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            orangePaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.ORANGE,
            1000
        );

        // Pink Paintbrush 1000
        RecipeItem pinkPaintbrush1000Recipe = new RecipeItem(
            pinkPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        pinkPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_PINK_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.PINK),
                ThemeType.TOOL,
                "魔法画刷 (粉色)",
                "可以将染色方块染成粉色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            pinkPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.PINK,
            1000
        );

        // Purple Paintbrush 1000
        RecipeItem purplePaintbrush1000Recipe = new RecipeItem(
            purplePaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        purplePaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_PURPLE_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.PURPLE),
                ThemeType.TOOL,
                "魔法画刷 (紫色)",
                "可以将染色方块染成紫色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            purplePaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.PURPLE,
            1000
        );

        // Red Paintbrush 1000
        RecipeItem redPaintbrush1000Recipe = new RecipeItem(
            redPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        redPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_RED_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.RED),
                ThemeType.TOOL,
                "魔法画刷 (红色)",
                "可以将染色方块染成红色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            redPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.RED,
            1000
        );

        // White Paintbrush 1000
        RecipeItem whitePaintbrush1000Recipe = new RecipeItem(
            whitePaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        whitePaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_WHITE_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.WHITE),
                ThemeType.TOOL,
                "魔法画刷 (白色)",
                "可以将染色方块染成白色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            whitePaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.WHITE,
            1000
        );

        // Yellow Paintbrush 1000
        RecipeItem yellowPaintbrush1000Recipe = new RecipeItem(
            yellowPaintBrush100.getItem(),
            StoryType.HISTORICAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        yellowPaintBrush1000 = new BasicPaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_YELLOW_1000",
                MagicPaintbrush.getTippedBrush(DyeColor.YELLOW),
                ThemeType.TOOL,
                "魔法画刷 (黄色)",
                "可以将染色方块染成黄色.",
                "",
                LoreBuilder.usesLeft(1000)
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            yellowPaintbrush1000Recipe.getDisplayRecipe(),
            PaintProfile.YELLOW,
            1000
        );

        // Mystical Pigmentato
        mysticalPigmentato = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_MYSTICAL_PIGMENTATO",
                new ItemStack(Material.PRISMARINE),
                ThemeType.CRAFTING,
                "神秘色素",
                "浓缩的色彩精华"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                getBlackPaintBrush1000().getItem(), getBluePaintBrush1000().getItem(), getBrownPaintBrush1000().getItem(),
                getCyanPaintBrush1000().getItem(), Materials.getAmalgamateDustEpic().getItem(), getGrayPaintBrush1000().getItem(),
                getGreenPaintBrush1000().getItem(), getLightBluePaintBrush1000().getItem(), getLightGrayPaintBrush1000().getItem(),
            }
        );

        // Mystical Tintanno
        mysticalTintanno = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_MYSTICAL_TINTANNO",
                new ItemStack(Material.DARK_PRISMARINE),
                ThemeType.CRAFTING,
                "神秘着色剂",
                "浓缩的色彩精华"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                getLimePaintBrush1000().getItem(), getMagentaPaintBrush1000().getItem(), getOrangePaintBrush1000().getItem(),
                getPinkPaintBrush1000().getItem(), Materials.getAmalgamateDustEpic().getItem(), getPurplePaintBrush1000().getItem(),
                getRedPaintBrush1000().getItem(), getWhitePaintBrush1000().getItem(), getYellowPaintBrush1000().getItem(),
            }
        );

        // Painters Resolve
        paintersResolve = new InfinitePaintbrush(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRUSH_INFINITE",
                MagicPaintbrush.getTippedBrush(DyeColor.WHITE, true),
                ThemeType.TOOL,
                "神秘画刷",
                "可以给染色方块和实体染色.",
                "可以染上所有种类的颜色, 永不用尽.",
                "",
                MessageFormat.format("{0}左键: {1}切换颜色", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                null, null, null,
                getMysticalTintanno().getItem(), Materials.getAmalgamateIngotMythical().getItem(), getMysticalPigmentato().getItem(),
                null, null, null
            }
        );

        // Body Stand
        RecipeItem bodyStandRecipe = new RecipeItem(
            new ItemStack(Material.ARMOR_STAND),
            StoryType.ELEMENTAL, 100,
            StoryType.ALCHEMICAL, 100,
            StoryType.MECHANICAL, 100
        );
        bodyStand = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_BODY_STAND",
                new ItemStack(Material.ARMOR_STAND),
                ThemeType.CRAFTING,
                "盔甲架 (躯体)",
                "这个盔甲架似乎有些不对劲."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            bodyStandRecipe.getDisplayRecipe()
        );

        // Mind Stand
        RecipeItem mindStandRecipe = new RecipeItem(
            new ItemStack(Material.ARMOR_STAND),
            StoryType.HISTORICAL, 100,
            StoryType.HUMAN, 100,
            StoryType.ANIMAL, 100
        );
        mindStand = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_MIND_STAND",
                new ItemStack(Material.ARMOR_STAND),
                ThemeType.CRAFTING,
                "盔甲架 (躯体)",
                "这个盔甲架似乎有些不对劲."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            mindStandRecipe.getDisplayRecipe()
        );

        // Soul Stand
        RecipeItem soulStandRecipe = new RecipeItem(
            new ItemStack(Material.ARMOR_STAND),
            StoryType.CELESTIAL, 100,
            StoryType.VOID, 100,
            StoryType.PHILOSOPHICAL, 100
        );
        soulStand = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SOUL_STAND",
                new ItemStack(Material.ARMOR_STAND),
                ThemeType.CRAFTING,
                "盔甲架 (灵魂)",
                "这个盔甲架似乎有些不对劲."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            soulStandRecipe.getDisplayRecipe()
        );

        // Mystical Attitudinizer
        mysticalAttitudinizer = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_MYSTICAL_ATTITUDINIZER",
                new ItemStack(Material.BELL),
                ThemeType.CRAFTING,
                "神秘姿态",
                "浓缩的姿态精华"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                Materials.getBasicFibres().getItem(), Materials.getBasicFibres().getItem(), Materials.getBasicFibres().getItem(),
                bodyStand.getItem(), mindStand.getItem(), soulStand.getItem(),
                Materials.getBasicFibres().getItem(), Materials.getBasicFibres().getItem(), Materials.getBasicFibres().getItem(),
            }
        );

        // Imbued Stand
        RecipeItem imbuedStandRecipe = new RecipeItem(
            new ItemStack(Material.ARMOR_STAND),
            StoryType.MECHANICAL, 5,
            StoryType.HUMAN, 5,
            StoryType.VOID, 5
        );
        imbuedStand = new ImbuedStand(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_IMBUED_STAND",
                new ItemStack(Material.ARMOR_STAND),
                ThemeType.TOOL,
                "注入魔法的盔甲架",
                "这种盔甲架可以用姿势切换器",
                "设置为隐身或者改变大小."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            imbuedStandRecipe.getDisplayRecipe()
        );

        // Pose Changer
        poseChanger = new PoseChanger(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_POSE_CHANGER",
                new ItemStack(Material.BAMBOO),
                ThemeType.TOOL,
                "造型切换器",
                "可以设置盔甲架的姿势.",
                "不仅能改变原版的盔甲架,",
                "还可以在注入魔法的盔甲架上",
                "做更多修改",
                "",
                MessageFormat.format("{0}左键: {1}更改选定部位", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
                MessageFormat.format("{0}Shift + 左键: {1}更改修改方式", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
                MessageFormat.format("{0}右键: {1}应用更改 (positive)", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
                MessageFormat.format("{0}Shift + 右键: {1}应用更改e (negative)", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
                "",
                MessageFormat.format("{0}选定部位: {1}头部", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
                MessageFormat.format("{0}修改方法: {1}重置", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                Materials.getBasicFibres().getItem(), Materials.getAmalgamateIngotEpic().getItem(), Materials.getBasicFibres().getItem(),
                Materials.getAmalgamateIngotEpic().getItem(), mysticalAttitudinizer.getItem(), Materials.getAmalgamateIngotEpic().getItem(),
                Materials.getBasicFibres().getItem(), Materials.getAmalgamateIngotEpic().getItem(), Materials.getBasicFibres().getItem(),
            }
        );

        // Pose Cloner
        poseCloner = new PoseCloner(
            ItemGroups.ARTISTIC,
            ThemeType.themedSlimefunItemStack(
                "CRY_POSE_CLONER",
                new ItemStack(Material.SEA_PICKLE),
                ThemeType.TOOL,
                "姿势复制器",
                "可以复制注入魔法的盔甲架的姿势,",
                "并应用到另一个注入魔法的盔甲架上.",
                "",
                MessageFormat.format("{0}右键: {1}复制姿势", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
                MessageFormat.format("{0}Shift + 右键: {1}应用复制的姿势", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                Materials.getBasicFibres().getItem(), Materials.getAmalgamateIngotUnique().getItem(), Materials.getBasicFibres().getItem(),
                Materials.getAmalgamateIngotRare().getItem(), bodyStand.getItem(), Materials.getAmalgamateIngotRare().getItem(),
                Materials.getBasicFibres().getItem(), Materials.getAmalgamateIngotUnique().getItem(), Materials.getBasicFibres().getItem(),
            }
        );

        // Slimefun Registry
        blackPaintBrush100.register(plugin);
        bluePaintBrush100.register(plugin);
        brownPaintBrush100.register(plugin);
        cyanPaintBrush100.register(plugin);
        grayPaintBrush100.register(plugin);
        greenPaintBrush100.register(plugin);
        lightBluePaintBrush100.register(plugin);
        lightGrayPaintBrush100.register(plugin);
        limePaintBrush100.register(plugin);
        magentaPaintBrush100.register(plugin);
        orangePaintBrush100.register(plugin);
        pinkPaintBrush100.register(plugin);
        purplePaintBrush100.register(plugin);
        redPaintBrush100.register(plugin);
        whitePaintBrush100.register(plugin);
        yellowPaintBrush100.register(plugin);
        blackPaintBrush1000.register(plugin);
        bluePaintBrush1000.register(plugin);
        brownPaintBrush1000.register(plugin);
        cyanPaintBrush1000.register(plugin);
        grayPaintBrush1000.register(plugin);
        greenPaintBrush1000.register(plugin);
        lightBluePaintBrush1000.register(plugin);
        lightGrayPaintBrush1000.register(plugin);
        limePaintBrush1000.register(plugin);
        magentaPaintBrush1000.register(plugin);
        orangePaintBrush1000.register(plugin);
        pinkPaintBrush1000.register(plugin);
        purplePaintBrush1000.register(plugin);
        redPaintBrush1000.register(plugin);
        whitePaintBrush1000.register(plugin);
        yellowPaintBrush1000.register(plugin);
        mysticalPigmentato.register(plugin);
        mysticalTintanno.register(plugin);
        paintersResolve.register(plugin);

        bodyStand.register(plugin);
        mindStand.register(plugin);
        soulStand.register(plugin);
        mysticalAttitudinizer.register(plugin);
        imbuedStand.register(plugin);
        poseChanger.register(plugin);
        poseCloner.register(plugin);

        // Liquefaction Recipes
        LiquefactionBasinCache.addCraftingRecipe(blackPaintBrush1000, blackPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(bluePaintBrush1000, bluePaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(brownPaintBrush1000, brownPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(cyanPaintBrush1000, cyanPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(grayPaintBrush1000, grayPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(greenPaintBrush1000, greenPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(lightBluePaintBrush1000, lightBluePaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(lightGrayPaintBrush1000, lightGrayPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(limePaintBrush1000, limePaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(magentaPaintBrush1000, magentaPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(orangePaintBrush1000, orangePaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(pinkPaintBrush1000, pinkPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(purplePaintBrush1000, purplePaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(redPaintBrush1000, redPaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(whitePaintBrush1000, whitePaintbrush1000Recipe);
        LiquefactionBasinCache.addCraftingRecipe(yellowPaintBrush1000, yellowPaintbrush1000Recipe);

        LiquefactionBasinCache.addCraftingRecipe(bodyStand, bodyStandRecipe);
        LiquefactionBasinCache.addCraftingRecipe(mindStand, mindStandRecipe);
        LiquefactionBasinCache.addCraftingRecipe(soulStand, soulStandRecipe);
        LiquefactionBasinCache.addCraftingRecipe(imbuedStand, imbuedStandRecipe);
    }
}
