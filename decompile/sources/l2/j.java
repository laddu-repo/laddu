package l2;

import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements x {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f8096v = new j();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f8097w = new j();

    public List a(String str, boolean z2, boolean z10) {
        return y.d(str, z2, z10);
    }

    @Override // l2.x
    public int f(Object obj) {
        String str = ((o) obj).f8099a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
