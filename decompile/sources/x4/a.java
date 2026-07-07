package x4;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14534a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14535b;

    /* renamed from: c, reason: collision with root package name */
    public final h5.c f14536c;

    /* renamed from: d, reason: collision with root package name */
    public final w5.a f14537d;

    /* renamed from: e, reason: collision with root package name */
    public final List f14538e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14539f;

    /* renamed from: g, reason: collision with root package name */
    public final v f14540g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f14541h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f14542i;
    public final Intent j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14543k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14544l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f14545m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14546n;

    /* renamed from: o, reason: collision with root package name */
    public final File f14547o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f14548p;

    /* renamed from: q, reason: collision with root package name */
    public final List f14549q;

    /* renamed from: r, reason: collision with root package name */
    public final List f14550r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final g5.b f14551t;

    /* renamed from: u, reason: collision with root package name */
    public final le.h f14552u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14553v;

    public a(Context context, String str, h5.c cVar, w5.a migrationContainer, List list, boolean z10, v vVar, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z13, g5.b bVar, le.h hVar) {
        kotlin.jvm.internal.k.e(context, "context");
        kotlin.jvm.internal.k.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.k.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.k.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.k.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.k.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f14534a = context;
        this.f14535b = str;
        this.f14536c = cVar;
        this.f14537d = migrationContainer;
        this.f14538e = list;
        this.f14539f = z10;
        this.f14540g = vVar;
        this.f14541h = queryExecutor;
        this.f14542i = transactionExecutor;
        this.j = intent;
        this.f14543k = z11;
        this.f14544l = z12;
        this.f14545m = set;
        this.f14546n = str2;
        this.f14547o = file;
        this.f14548p = callable;
        this.f14549q = typeConverters;
        this.f14550r = autoMigrationSpecs;
        this.s = z13;
        this.f14551t = bVar;
        this.f14552u = hVar;
        this.f14553v = true;
    }
}
