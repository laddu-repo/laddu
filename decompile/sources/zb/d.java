package zb;

import a8.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.MediaDrmException;
import bg.c0;
import bg.n;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.u7;
import f2.r;
import f2.s;
import f2.t;
import g8.p;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import hb.x;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.k;
import m2.i0;
import n9.w;
import r1.e0;
import ua.m;
import w8.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class d implements o1.b, e9.d, t, i8.b, m2.d, n9.f, w {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f15327x;

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d f15325y = new d(19);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ d f15326z = new d(20);
    public static final /* synthetic */ d A = new d(21);
    public static final /* synthetic */ d B = new d(22);
    public static final /* synthetic */ d C = new d(23);
    public static final /* synthetic */ d D = new d(24);
    public static final /* synthetic */ d E = new d(25);
    public static final /* synthetic */ d F = new d(26);
    public static final /* synthetic */ d G = new d(27);
    public static final /* synthetic */ d H = new d(28);
    public static final /* synthetic */ d I = new d(29);

    public /* synthetic */ d(int i6) {
        this.f15327x = i6;
    }

    public static d s(Context context, int i6) {
        boolean z10;
        if (i6 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j5.b("Cannot create a CalendarItemStyle with a styleResId of 0", z10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, t9.a.f12694x);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        i.i(context, obtainStyledAttributes, 4);
        i.i(context, obtainStyledAttributes, 9);
        i.i(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        m.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        d dVar = new d(6);
        j5.c(rect.left);
        j5.c(rect.top);
        j5.c(rect.right);
        j5.c(rect.bottom);
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, bg.k] */
    public static c0 t(String str) {
        k.e(str, "<this>");
        n nVar = cg.c.f2090a;
        ?? obj = new Object();
        obj.s0(str);
        return cg.c.d(obj, false);
    }

    public static c0 u(File file) {
        String str = c0.f1692y;
        k.e(file, "<this>");
        String file2 = file.toString();
        k.d(file2, "toString(...)");
        return t(file2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean w(g1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.d.w(g1.b, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hb.x, java.lang.Object, hb.o] */
    public static x y(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((e0) it.next()).f11379b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.l(unsupportedOperationException);
                return obj;
            }
        }
        return j5.l(list);
    }

    @Override // n9.w
    public Object b() {
        switch (this.f15327x) {
            case 20:
                return new Boolean(((Boolean) u7.f2460a.b()).booleanValue());
            case 21:
                List list = n9.e0.f9226a;
                g7.f2236y.get();
                Long l10 = (Long) i7.f2263b.b();
                l10.getClass();
                return l10;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                List list2 = n9.e0.f9226a;
                Boolean bool = (Boolean) n9.f2367b.b();
                bool.getClass();
                return bool;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                List list3 = n9.e0.f9226a;
                g7.f2236y.get();
                return (String) i7.f2282l.b();
            case 24:
                List list4 = n9.e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.f2281k0.b()).longValue());
            case 25:
                List list5 = n9.e0.f9226a;
                g7.f2236y.get();
                return (String) i7.f2299u0.b();
            case 26:
                List list6 = n9.e0.f9226a;
                g7.f2236y.get();
                return (String) i7.N.b();
            case 27:
                List list7 = n9.e0.f9226a;
                g7.f2236y.get();
                Long l11 = (Long) i7.U.b();
                l11.getClass();
                return l11;
            case 28:
                List list8 = n9.e0.f9226a;
                g7.f2236y.get();
                return Integer.valueOf((int) ((Long) i7.K.b()).longValue());
            default:
                List list9 = n9.e0.f9226a;
                g7.f2236y.get();
                Long l12 = (Long) i7.S.b();
                l12.getClass();
                return l12;
        }
    }

    @Override // f2.t
    public Map c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // n9.f
    public /* synthetic */ String c0(String str, String str2) {
        return null;
    }

    @Override // m2.d
    public m2.e e(int i6) {
        int i10;
        i0 i0Var = new i0();
        i0 i0Var2 = new i0();
        boolean z10 = false;
        try {
            i0Var.f8508x.y(a.a.k(0));
            int e10 = i0Var.e();
            if (e10 % 2 == 0) {
                z10 = true;
            }
            if (z10) {
                i10 = e10 + 1;
            } else {
                i10 = e10 - 1;
            }
            i0Var2.f8508x.y(a.a.k(i10));
            if (z10) {
                i0Var.f8509y = i0Var2;
                return i0Var;
            }
            i0Var2.f8509y = i0Var;
            return i0Var2;
        } catch (IOException e11) {
            k4.f(i0Var);
            k4.f(i0Var2);
            throw e11;
        }
    }

    @Override // m2.d
    public m2.d f() {
        return new l(18);
    }

    @Override // f2.t
    public s g() {
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [p8.a, java.lang.Object] */
    @Override // ge.a
    public Object get() {
        switch (this.f15327x) {
            case 13:
                return new p(Executors.newSingleThreadExecutor(), 0);
            default:
                ?? obj = new Object();
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(d8.d.f3973x, new m8.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(d8.d.f3975z, new m8.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(m8.d.f8712y)));
                            if (unmodifiableSet != null) {
                                hashMap.put(d8.d.f3974y, new m8.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= d8.d.values().length) {
                                    new HashMap();
                                    return new m8.a(obj, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
        }
    }

    @Override // f2.t
    public y1.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // e9.d
    public a3.c i(Context context, String str, e9.c cVar) {
        int d10;
        switch (this.f15327x) {
            case 9:
                a3.c cVar2 = new a3.c();
                int d11 = cVar.d(context, str, true);
                cVar2.f522b = d11;
                if (d11 != 0) {
                    cVar2.f523c = 1;
                } else {
                    int m9 = cVar.m(context, str);
                    cVar2.f521a = m9;
                    if (m9 != 0) {
                        cVar2.f523c = -1;
                    }
                }
                return cVar2;
            default:
                a3.c cVar3 = new a3.c();
                int m10 = cVar.m(context, str);
                cVar3.f521a = m10;
                int i6 = 1;
                int i10 = 0;
                if (m10 != 0) {
                    d10 = cVar.d(context, str, false);
                    cVar3.f522b = d10;
                } else {
                    d10 = cVar.d(context, str, true);
                    cVar3.f522b = d10;
                }
                int i11 = cVar3.f521a;
                if (i11 == 0) {
                    if (d10 == 0) {
                        i6 = 0;
                        cVar3.f523c = i6;
                        return cVar3;
                    }
                } else {
                    i10 = i11;
                }
                if (i10 >= d10) {
                    i6 = -1;
                }
                cVar3.f523c = i6;
                return cVar3;
        }
    }

    @Override // f2.t
    public byte[] j() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // f2.t
    public void k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // f2.t
    public byte[] m(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // f2.t
    public void n(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // f2.t
    public r o(byte[] bArr, List list, int i6, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // f2.t
    public int p() {
        return 1;
    }

    @Override // f2.t
    public boolean r(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    public Signature[] v(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean x(CharSequence charSequence) {
        return false;
    }

    public d(Context context) {
        this.f15327x = 2;
    }

    @Override // f2.t
    public void a() {
    }

    @Override // f2.t
    public void d(k7.d dVar) {
    }

    @Override // f2.t
    public void l(byte[] bArr) {
    }

    @Override // f2.t
    public /* synthetic */ void q(byte[] bArr, b2.m mVar) {
    }
}
