package d1;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends de.j implements ce.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h0 f3885w = new h0(1);

    @Override // ce.l
    public final Object a(Object obj) {
        File file = (File) obj;
        de.i.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        de.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new h1(absolutePath);
    }
}
