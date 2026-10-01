package kb;

import ac.o;
import ac.t;
import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.x;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h1.e f7897b = new h1.e("fire-global");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1.e f7898c = new h1.e("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1.e f7899d = new h1.e("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb.f f7900a;

    public l(Context context, String str) {
        this.f7900a = new cb.f(context, d0.d.k("FirebaseHeartBeat", str));
    }

    public final synchronized long a(h1.b bVar) {
        long j8;
        try {
            long jLongValue = ((Long) b8.h.v(bVar, f7898c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : bVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((h1.e) entry.getKey()).f6049a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            bVar.e(qf.g.G(str), hashSet2);
            j8 = jLongValue - 1;
            bVar.d(f7898c, Long.valueOf(j8));
        } catch (Throwable th) {
            throw th;
        }
        return j8;
    }

    public final synchronized void b() {
        this.f7900a.a(new t(3, this));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            cb.f fVar = this.f7900a;
            fVar.getClass();
            for (Map.Entry entry : ((Map) x.o(sd.i.f11797v, new cb.c(fVar, null, 0))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((h1.e) entry.getKey()).f6049a, new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j8) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j8));
        }
        Instant instant = new Date(j8).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized h1.e e(h1.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return qf.g.G(((h1.e) entry.getKey()).f6049a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j8, long j9) {
        return d(j8).equals(d(j9));
    }

    public final synchronized void g() {
        this.f7900a.a(new j(0, this, d(System.currentTimeMillis())));
    }

    public final synchronized void h(h1.b bVar, String str) {
        try {
            h1.e eVarE = e(bVar, str);
            if (eVarE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) b8.h.v(bVar, eVarE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.c(eVarE);
            } else {
                bVar.e(eVarE, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean i(long j8) {
        return j(f7897b, j8);
    }

    public final synchronized boolean j(h1.e eVar, long j8) {
        cb.f fVar = this.f7900a;
        fVar.getClass();
        de.i.e(eVar, "key");
        sd.c cVar = null;
        o oVar = new o(fVar, eVar, cVar, 3);
        sd.i iVar = sd.i.f11797v;
        if (f(((Long) x.o(iVar, oVar)).longValue(), j8)) {
            return false;
        }
        cb.f fVar2 = this.f7900a;
        Long lValueOf = Long.valueOf(j8);
        fVar2.getClass();
        return true;
    }

    public final synchronized void k(final String str, long j8) {
        final String strD = d(j8);
        final h1.e eVarG = qf.g.G(str);
        this.f7900a.a(new ce.l() { // from class: kb.i
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // ce.l
            public final Object a(Object obj) {
                l lVar = this.f7889v;
                String str2 = strD;
                String str3 = str;
                h1.e eVar = eVarG;
                h1.b bVar = (h1.b) obj;
                lVar.getClass();
                h1.e eVar2 = l.f7899d;
                if (((String) b8.h.v(bVar, eVar2, "")).equals(str2)) {
                    h1.e eVarE = lVar.e(bVar, str2);
                    if (eVarE == null || eVarE.f6049a.equals(str3)) {
                        return null;
                    }
                    synchronized (lVar) {
                        lVar.h(bVar, str2);
                        HashSet hashSet = new HashSet((Collection) b8.h.v(bVar, eVar, new HashSet()));
                        hashSet.add(str2);
                        bVar.e(eVar, hashSet);
                    }
                    return null;
                }
                h1.e eVar3 = l.f7898c;
                long jLongValue = ((Long) b8.h.v(bVar, eVar3, 0L)).longValue();
                if (jLongValue + 1 == 30) {
                    jLongValue = lVar.a(bVar);
                }
                HashSet hashSet2 = new HashSet((Collection) b8.h.v(bVar, eVar, new HashSet()));
                hashSet2.add(str2);
                bVar.e(eVar, hashSet2);
                bVar.e(eVar3, Long.valueOf(jLongValue + 1));
                bVar.e(eVar2, str2);
                return null;
            }
        });
    }

    public final synchronized void l(final long j8) {
        this.f7900a.a(new ce.l() { // from class: kb.k
            @Override // ce.l
            public final Object a(Object obj) {
                ((h1.b) obj).d(l.f7897b, Long.valueOf(j8));
                return null;
            }
        });
    }
}
