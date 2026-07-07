package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import he.y;
import kotlin.jvm.internal.k;
import le.c;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, c cVar) {
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, cVar);
            if (destroy == me.a.f8833x) {
                return destroy;
            }
            return y.f6101a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            k.e(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
