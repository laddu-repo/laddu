package se;

import java.io.File;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final File f12303a;

    public f(File root) {
        k.e(root, "root");
        this.f12303a = root;
    }

    public abstract File a();
}
