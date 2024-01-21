package com.github.paopaoyue.onmyojimod.patch.kami;

import com.evacipated.cardcrawl.modthespire.lib.SpireField;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.github.paopaoyue.onmyojimod.object.kami.KamiManager;

@SpirePatch(
        cls = "com.megacrit.cardcrawl.core.AbstractCreature",
        method = "<class>"
)
public class KamiManagerField {
    public static SpireField<KamiManager> kamiManager = new SpireField<>(KamiManager::new);

    public KamiManagerField() {
    }
}