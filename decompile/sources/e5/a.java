package e5;

import android.os.Bundle;
import he.i;
import ie.j;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4350a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4351b;

    public a(e eVar) {
        this.f4350a = 0;
        this.f4351b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // e5.d
    public final Bundle a() {
        switch (this.f4350a) {
            case 0:
                Bundle b10 = k6.e.b((i[]) Arrays.copyOf(new i[0], 0));
                c9.a.o(b10, "classes_to_restore", j.Z((LinkedHashSet) this.f4351b));
                return b10;
            default:
                Bundle bundle = new Bundle();
                ((i.j) this.f4351b).w().getClass();
                return bundle;
        }
    }

    public a(i.j jVar) {
        this.f4350a = 1;
        this.f4351b = jVar;
    }
}
