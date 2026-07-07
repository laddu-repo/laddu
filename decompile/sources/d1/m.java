package d1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m extends de.j implements ce.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3916w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f3917x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(e0 e0Var, int i) {
        super(0);
        this.f3916w = i;
        this.f3917x = e0Var;
    }

    @Override // ce.a
    public final Object b() throws IOException {
        switch (this.f3916w) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((l0) this.f3917x.f3871j.getValue()).f3912c;
            default:
                i0 i0Var = this.f3917x.f3864a;
                File canonicalFile = ((File) i0Var.f3895c.b()).getCanonicalFile();
                synchronized (i0.f3892e) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = i0.f3891d;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    de.i.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new l0(canonicalFile, i0Var.f3893a, (p0) i0Var.f3894b.a(canonicalFile), new androidx.lifecycle.j0(1, canonicalFile));
        }
    }
}
