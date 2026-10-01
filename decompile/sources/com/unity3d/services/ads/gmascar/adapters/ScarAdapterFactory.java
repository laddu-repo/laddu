package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import e1.p;
import ud.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class ScarAdapterFactory {

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion = iArr;
            try {
                iArr[ScarAdapterVersion.V21.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.V23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, c cVar) {
        String m9 = h8.c.m("SCAR version ", scarAdapterVersion.name(), " is not supported.");
        cVar.handleError(new g(b.D, m9, new Object[0]));
        DeviceLog.debug(m9);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [xd.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [be.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [vd.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [zd.a, java.lang.Object] */
    public d createScarAdapter(ScarAdapterVersion scarAdapterVersion, c cVar) {
        int i6 = AnonymousClass1.$SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion[scarAdapterVersion.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                reportAdapterFailure(scarAdapterVersion, cVar);
                return null;
            }
            String versionName = SdkProperties.getVersionName();
            a aVar = new a(cVar, 1);
            p pVar = new p(versionName, 1);
            ?? obj = new Object();
            obj.f15332a = pVar;
            aVar.f13104f = obj;
            ?? obj2 = new Object();
            obj2.f1665e = obj;
            aVar.f3395a = obj2;
            return aVar;
        }
        String versionName2 = SdkProperties.getVersionName();
        a aVar2 = new a(cVar, 0);
        p pVar2 = new p(versionName2, 1);
        ?? obj3 = new Object();
        obj3.f13507a = pVar2;
        aVar2.f13104f = obj3;
        ?? obj4 = new Object();
        obj4.f14719e = obj3;
        aVar2.f3395a = obj4;
        return aVar2;
    }
}
