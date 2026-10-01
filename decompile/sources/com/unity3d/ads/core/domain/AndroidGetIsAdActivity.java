package com.unity3d.ads.core.domain;

import bg.n;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import he.f;
import java.util.List;
import kotlin.jvm.internal.k;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetIsAdActivity {
    private final f activities$delegate;
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(SessionRepository sessionRepository) {
        k.e(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities$delegate = he.a.d(new AndroidGetIsAdActivity$activities$2(this));
    }

    private final List<n> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(String activityName) {
        k.e(activityName, "activityName");
        String sHA256Hash = StringExtensionsKt.getSHA256Hash(activityName);
        n nVar = n.A;
        return getActivities().contains(l.t(sHA256Hash));
    }
}
