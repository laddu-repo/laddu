package com.unity3d.services.banners;

import a8.b;
import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;
    public static final Companion Companion = new Companion(null);
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    private static final UnityBannerSize standard = new UnityBannerSize(320, 50);

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final UnityBannerSize getDynamicSize(Context context) {
            k.e(context, "context");
            int l10 = b.l(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            if (l10 >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            if (l10 >= getIabStandard().getWidth()) {
                return getIabStandard();
            }
            return getStandard();
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }

        private Companion() {
        }
    }

    public UnityBannerSize(int i6, int i10) {
        this.width = i6;
        this.height = i10;
    }

    public static final UnityBannerSize getDynamicSize(Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
