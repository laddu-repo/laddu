package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.core.configuration.IExperiments;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import sd.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class ScarAdFormatProvider implements IScarAdFormatProvider {
    private final IExperiments experiments;
    private final TokenConfiguration tokenConfiguration;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(TokenConfiguration tokenConfiguration, IExperiments experiments) {
        k.e(experiments, "experiments");
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = experiments;
    }

    @Override // com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider
    public List<d> buildAdFormatList() {
        ArrayList arrayList = new ArrayList();
        TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        d dVar = d.A;
        if (tokenConfiguration == null) {
            arrayList.add(d.f12294z);
            arrayList.add(d.f12293y);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(dVar);
                return arrayList;
            }
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] == 1) {
                if (this.experiments.isScarBannerHbEnabled()) {
                    arrayList.add(dVar);
                }
            } else {
                arrayList.add(AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
                return arrayList;
            }
        }
        return arrayList;
    }

    public final IExperiments getExperiments() {
        return this.experiments;
    }

    public final TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }
}
