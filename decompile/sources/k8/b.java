package k8;

import com.google.android.gms.internal.measurement.h8;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m8;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f7386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f7387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f7388e;
    public Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f7390h;
    public final com.google.android.gms.internal.measurement.i1 i;

    public b(c cVar, String str, int i, com.google.android.gms.internal.measurement.i1 i1Var, int i10) {
        this.f7389g = i10;
        this.f7390h = cVar;
        this.f7384a = str;
        this.f7385b = i;
        this.i = i1Var;
    }

    public static Boolean c(Boolean bool, boolean z2) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, m8 m8Var, v0 v0Var) {
        List listZ;
        t7.y.g(m8Var);
        if (str != null && m8Var.u() && m8Var.C() != 1 && (m8Var.C() != 7 ? m8Var.v() : m8Var.A() != 0)) {
            int iC = m8Var.C();
            boolean zY = m8Var.y();
            String strW = (zY || iC == 2 || iC == 7) ? m8Var.w() : m8Var.w().toUpperCase(Locale.ENGLISH);
            if (m8Var.A() == 0) {
                listZ = null;
            } else {
                listZ = m8Var.z();
                if (!zY) {
                    ArrayList arrayList = new ArrayList(listZ.size());
                    Iterator it = listZ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listZ = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iC == 2 ? strW : null;
            if (iC != 7 ? strW != null : listZ != null && !listZ.isEmpty()) {
                if (!zY && iC != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iC - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zY ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (v0Var != null) {
                                    v0Var.E.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strW));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strW));
                    case g1.g.LONG_FIELD_NUMBER /* 4 */:
                        return Boolean.valueOf(str.contains(strW));
                    case g1.g.STRING_FIELD_NUMBER /* 5 */:
                        return Boolean.valueOf(str.equals(strW));
                    case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (listZ != null) {
                            return Boolean.valueOf(listZ.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.j8 r9, double r10) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.b.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.j8, double):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:3: B:89:0x0246->B:238:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.Long r22, java.lang.Long r23, com.google.android.gms.internal.measurement.r9 r24, long r25, k8.s r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.r9, long, k8.s, boolean):boolean");
    }

    public boolean b(Long l10, Long l11, ia iaVar, boolean z2) {
        boolean z10;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        com.google.android.gms.internal.measurement.a4.a();
        p1 p1Var = (p1) this.f7390h.f2053w;
        g gVar = p1Var.f7695y;
        q0 q0Var = p1Var.E;
        v0 v0Var = p1Var.A;
        boolean zO = gVar.O(this.f7384a, f0.E0);
        l8 l8Var = (l8) this.i;
        boolean zY = l8Var.y();
        boolean z11 = l8Var.z();
        boolean zB = l8Var.B();
        boolean z12 = zY || z11 || zB;
        if (z2 && !z12) {
            p1.l(v0Var);
            v0Var.J.c(Integer.valueOf(this.f7385b), l8Var.u() ? Integer.valueOf(l8Var.v()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        h8 h8VarX = l8Var.x();
        boolean z13 = h8VarX.z();
        if (!iaVar.z()) {
            z10 = zB;
            if (!iaVar.D()) {
                if (!iaVar.x()) {
                    p1.l(v0Var);
                    v0Var.E.b(q0Var.c(iaVar.w()), "User property has no value, property");
                } else if (h8VarX.u()) {
                    String strY = iaVar.y();
                    m8 m8VarV = h8VarX.v();
                    p1.l(v0Var);
                    boolC = c(d(strY, m8VarV, v0Var), z13);
                } else if (!h8VarX.w()) {
                    p1.l(v0Var);
                    v0Var.E.b(q0Var.c(iaVar.w()), "No string or number filter defined. property");
                } else if (p4.h0(iaVar.y())) {
                    String strY2 = iaVar.y();
                    j8 j8VarX = h8VarX.x();
                    if (p4.h0(strY2)) {
                        try {
                            boolE = e(new BigDecimal(strY2), j8VarX, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                        boolC = c(boolE, z13);
                    } else {
                        boolE = null;
                        boolC = c(boolE, z13);
                    }
                } else {
                    p1.l(v0Var);
                    v0Var.E.c(q0Var.c(iaVar.w()), iaVar.y(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (h8VarX.w()) {
                double dE = iaVar.E();
                try {
                    boolE2 = e(new BigDecimal(dE), h8VarX.x(), Math.ulp(dE));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, z13);
            } else {
                p1.l(v0Var);
                v0Var.E.b(q0Var.c(iaVar.w()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (h8VarX.w()) {
            z10 = zB;
            try {
                boolE3 = e(new BigDecimal(iaVar.A()), h8VarX.x(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, z13);
        } else {
            p1.l(v0Var);
            v0Var.E.b(q0Var.c(iaVar.w()), "No number filter for long property. property");
            z10 = zB;
            boolC = null;
        }
        p1.l(v0Var);
        v0Var.J.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.f7386c = Boolean.TRUE;
        if (!z10 || boolC.booleanValue()) {
            if (!z2 || l8Var.y()) {
                this.f7387d = boolC;
            }
            if (boolC.booleanValue() && z12 && iaVar.u()) {
                long jV = iaVar.v();
                if (l10 != null) {
                    jV = l10.longValue();
                }
                if (zO && l8Var.y() && !l8Var.z() && l11 != null) {
                    jV = l11.longValue();
                }
                if (l8Var.z()) {
                    this.f = Long.valueOf(jV);
                } else {
                    this.f7388e = Long.valueOf(jV);
                }
            }
        }
        return true;
    }
}
