package com.unity3d.ads.core.domain;

import bg.n;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidGetIsAdActivity$activities$2 extends l implements ve.a {
    final /* synthetic */ AndroidGetIsAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetIsAdActivity$activities$2(AndroidGetIsAdActivity androidGetIsAdActivity) {
        super(0);
        this.this$0 = androidGetIsAdActivity;
    }

    @Override // ve.a
    public final List<n> invoke() {
        SessionRepository sessionRepository;
        sessionRepository = this.this$0.sessionRepository;
        List<ByteString> observableAndroidActivitiesList = sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
        k.d(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
        ArrayList arrayList = new ArrayList(ie.l.x(observableAndroidActivitiesList, 10));
        Iterator<T> it = observableAndroidActivitiesList.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            byte[] data = Arrays.copyOf(byteArray, byteArray.length);
            n nVar = n.A;
            k.e(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            k.d(copyOf, "copyOf(...)");
            arrayList.add(new n(copyOf));
        }
        return arrayList;
    }
}
