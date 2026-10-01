package xg;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import java.util.ArrayList;
import kotlin.jvm.internal.x;
import o1.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends pg.a {

    /* renamed from: c, reason: collision with root package name */
    public final e f14755c;

    public a(e eVar) {
        super(2, new ArrayList());
        this.f14755c = eVar;
    }

    @Override // pg.a
    public final Object a(kotlin.jvm.internal.e eVar) {
        if (eVar.equals(x.a(a1.class))) {
            return d1.c(this.f14755c);
        }
        return super.a(eVar);
    }
}
