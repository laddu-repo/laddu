package x4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f14641a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14642b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14643c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14644d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14645e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f14646f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f14647g;

    /* renamed from: h, reason: collision with root package name */
    public g8.j f14648h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14649i;
    public final v j;

    /* renamed from: k, reason: collision with root package name */
    public final long f14650k;

    /* renamed from: l, reason: collision with root package name */
    public final w5.a f14651l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashSet f14652m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f14653n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f14654o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14655p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14656q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f14657r;

    public t(Context context, Class cls, String str) {
        kotlin.jvm.internal.k.e(context, "context");
        this.f14644d = new ArrayList();
        this.f14645e = new ArrayList();
        this.j = v.f14658x;
        this.f14650k = -1L;
        this.f14651l = new w5.a(2);
        this.f14652m = new LinkedHashSet();
        this.f14653n = new LinkedHashSet();
        this.f14654o = new ArrayList();
        this.f14655p = true;
        this.f14657r = true;
        this.f14641a = kotlin.jvm.internal.x.a(cls);
        this.f14642b = context;
        this.f14643c = str;
    }

    public final void a(b5.a... aVarArr) {
        for (b5.a aVar : aVarArr) {
            Integer valueOf = Integer.valueOf(aVar.f1472a);
            LinkedHashSet linkedHashSet = this.f14653n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(aVar.f1473b));
        }
        b5.a[] migrations = (b5.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
        w5.a aVar2 = this.f14651l;
        aVar2.getClass();
        kotlin.jvm.internal.k.e(migrations, "migrations");
        for (b5.a aVar3 : migrations) {
            aVar2.b(aVar3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0228, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cc A[LOOP:6: B:118:0x029f->B:130:0x02cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x4.w b() {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.t.b():x4.w");
    }
}
