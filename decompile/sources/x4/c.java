package x4;

import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {
    public static final t c(Context context, Class cls, String str) {
        kotlin.jvm.internal.k.e(context, "context");
        if (!df.m.S(str)) {
            if (!str.equals(":memory:")) {
                return new t(context, cls, str);
            }
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final Object d(o oVar, String str, ne.c cVar) {
        Object b10 = oVar.b(str, new od.e0(5), cVar);
        if (b10 == me.a.f8833x) {
            return b10;
        }
        return he.y.f6101a;
    }

    public abstract void a(g5.c cVar, Object obj);

    public abstract String b();

    public void e(g5.a connection, Object obj) {
        kotlin.jvm.internal.k.e(connection, "connection");
        if (obj == null) {
            return;
        }
        g5.c d02 = connection.d0(b());
        try {
            a(d02, obj);
            d02.X();
            c9.a.c(d02, null);
            e9.f.f(connection);
        } finally {
        }
    }

    public void f(g5.a connection, Object obj) {
        kotlin.jvm.internal.k.e(connection, "connection");
        if (obj == null) {
            return;
        }
        g5.c d02 = connection.d0(b());
        try {
            a(d02, obj);
            d02.X();
            c9.a.c(d02, null);
        } finally {
        }
    }
}
