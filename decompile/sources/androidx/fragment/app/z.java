package androidx.fragment.app;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements u4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.j f1164b;

    public /* synthetic */ z(h.j jVar, int i) {
        this.f1163a = i;
        this.f1164b = jVar;
    }

    @Override // u4.c
    public final Bundle a() {
        h.j jVar;
        switch (this.f1163a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                break;
            default:
                Bundle bundle = new Bundle();
                c.i iVar = this.f1164b.D;
                iVar.getClass();
                LinkedHashMap linkedHashMap = iVar.f1646b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f1648d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f1650g));
                return bundle;
        }
        do {
            jVar = this.f1164b;
        } while (h.j.p(jVar.o()));
        jVar.R.d(androidx.lifecycle.m.ON_STOP);
        return new Bundle();
    }
}
