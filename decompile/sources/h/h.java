package h;

import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h implements u4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5926b;

    public h(o.r rVar) {
        this.f5925a = 1;
        this.f5926b = new LinkedHashSet();
        rVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // u4.c
    public final Bundle a() {
        switch (this.f5925a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Bundle bundle = new Bundle();
                ((j) this.f5926b).m().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f5926b));
                return bundle2;
        }
    }

    public h(j jVar) {
        this.f5925a = 0;
        this.f5926b = jVar;
    }
}
