package l4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.j1;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8198a;

    /* renamed from: b, reason: collision with root package name */
    public final o4.h f8199b = new o4.h(this, new j(this, 0));

    /* renamed from: c, reason: collision with root package name */
    public final e1.m f8200c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f8201d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8202e;

    /* renamed from: f, reason: collision with root package name */
    public final o0 f8203f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8204g;

    /* renamed from: h, reason: collision with root package name */
    public final he.m f8205h;

    public x(Context context) {
        Object obj;
        this.f8198a = context;
        this.f8200c = new e1.m(context, 1);
        Iterator it = cf.l.M(new cf.p(14), context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f8201d = (Activity) obj;
        this.f8203f = new o0(this, 2);
        this.f8204g = true;
        k0 k0Var = this.f8199b.f9915r;
        k0Var.a(new w(k0Var));
        this.f8199b.f9915r.a(new b(this.f8198a));
        this.f8205h = he.a.d(new j(this, 1));
    }

    public final void a(l lVar) {
        o4.h hVar = this.f8199b;
        hVar.getClass();
        hVar.f9912o.add(lVar);
        ie.h hVar2 = hVar.f9904f;
        if (!hVar2.isEmpty()) {
            h hVar3 = (h) hVar2.last();
            lVar.a(hVar.f9899a, hVar3.f8141y, hVar3.E.a());
        }
    }

    public final int b() {
        ie.h hVar = this.f8199b.f9904f;
        int i6 = 0;
        if (hVar != null && hVar.isEmpty()) {
            return 0;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            if (!(((h) it.next()).f8141y instanceof v) && (i6 = i6 + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r9, android.os.Bundle r10, l4.z r11) {
        /*
            r8 = this;
            o4.h r0 = r8.f8199b
            ie.h r1 = r0.f9904f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Ld
            l4.v r1 = r0.f9901c
            goto L17
        Ld:
            ie.h r1 = r0.f9904f
            java.lang.Object r1 = r1.last()
            l4.h r1 = (l4.h) r1
            l4.u r1 = r1.f8141y
        L17:
            if (r1 == 0) goto Lc1
            l4.f r2 = r1.c(r9)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L3d
            if (r11 != 0) goto L25
            l4.z r11 = r2.f8117b
        L25:
            int r5 = r2.f8116a
            android.os.Bundle r6 = r2.f8118c
            if (r6 == 0) goto L3b
            he.i[] r7 = new he.i[r4]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
            he.i[] r7 = (he.i[]) r7
            android.os.Bundle r7 = k6.e.b(r7)
            r7.putAll(r6)
            goto L3f
        L3b:
            r7 = r3
            goto L3f
        L3d:
            r5 = r9
            goto L3b
        L3f:
            if (r10 == 0) goto L52
            if (r7 != 0) goto L4f
            he.i[] r6 = new he.i[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r6, r4)
            he.i[] r4 = (he.i[]) r4
            android.os.Bundle r7 = k6.e.b(r4)
        L4f:
            r7.putAll(r10)
        L52:
            if (r5 != 0) goto L64
            if (r11 == 0) goto L64
            boolean r10 = r11.f8212d
            int r4 = r11.f8211c
            r6 = -1
            if (r4 != r6) goto L5e
            goto L64
        L5e:
            if (r4 == r6) goto L63
            r0.l(r4, r10)
        L63:
            return
        L64:
            if (r5 == 0) goto Lb9
            l4.u r10 = r0.c(r5, r3)
            if (r10 != 0) goto Lb5
            int r10 = l4.u.C
            e1.m r10 = r8.f8200c
            java.lang.String r11 = com.google.android.gms.internal.measurement.k4.j(r10, r5)
            java.lang.String r0 = " cannot be found from the current destination "
            if (r2 != 0) goto L92
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "Navigation action/destination "
            r10.<init>(r2)
            r10.append(r11)
            r10.append(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L92:
            java.lang.String r2 = "Navigation destination "
            java.lang.String r3 = " referenced from action "
            java.lang.StringBuilder r11 = r4.a.q(r2, r11, r3)
            java.lang.String r9 = com.google.android.gms.internal.measurement.k4.j(r10, r9)
            r11.append(r9)
            r11.append(r0)
            r11.append(r1)
            java.lang.String r9 = r11.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        Lb5:
            r0.k(r10, r7, r11)
            return
        Lb9:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo"
            r9.<init>(r10)
            throw r9
        Lc1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "No current destination found. Ensure a navigation graph has been set for NavController "
            r10.<init>(r11)
            r10.append(r8)
            r11 = 46
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.x.c(int, android.os.Bundle, l4.z):void");
    }

    public final boolean d() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle a10;
        Bundle bundle3;
        Intent intent;
        int b10 = b();
        o4.h hVar = this.f8199b;
        int i6 = 0;
        if (b10 == 1) {
            Activity activity = this.f8201d;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            if (iArr != null) {
                if (this.f8202e) {
                    kotlin.jvm.internal.k.b(activity);
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    kotlin.jvm.internal.k.b(extras);
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    kotlin.jvm.internal.k.b(intArray);
                    ArrayList r02 = ie.i.r0(intArray);
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    if (r02.size() >= 2) {
                        int intValue = ((Number) ie.p.B(r02)).intValue();
                        if (parcelableArrayList != null) {
                        }
                        u d10 = o4.h.d(intValue, hVar.g(), null, false);
                        if (d10 instanceof v) {
                            int i10 = v.E;
                            intValue = ((u) cf.l.O(cf.l.M(new cf.p(19), (v) d10))).f8195y.f9924a;
                        }
                        u f3 = hVar.f();
                        if (f3 != null && intValue == f3.f8195y.f9924a) {
                            b4.h hVar2 = new b4.h(this);
                            Bundle b11 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                            b11.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                            Bundle bundle4 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle4 != null) {
                                b11.putAll(bundle4);
                            }
                            ((Intent) hVar2.B).putExtra("android-support-nav:controller:deepLinkExtras", b11);
                            int size = r02.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = r02.get(i11);
                                i11++;
                                int i12 = i6 + 1;
                                if (i6 >= 0) {
                                    int intValue2 = ((Number) obj).intValue();
                                    if (parcelableArrayList != null) {
                                        bundle3 = (Bundle) parcelableArrayList.get(i6);
                                    } else {
                                        bundle3 = null;
                                    }
                                    ((ArrayList) hVar2.f1470y).add(new s(intValue2, bundle3));
                                    if (((v) hVar2.f1469x) != null) {
                                        hVar2.n();
                                    }
                                    i6 = i12;
                                } else {
                                    ie.k.w();
                                    throw null;
                                }
                            }
                            hVar2.h().b();
                            activity.finish();
                            return true;
                        }
                    }
                }
            } else {
                u f10 = hVar.f();
                kotlin.jvm.internal.k.b(f10);
                int i13 = f10.f8195y.f9924a;
                for (v vVar = f10.f8196z; vVar != null; vVar = vVar.f8196z) {
                    o4.j jVar = vVar.f8195y;
                    if (vVar.D.f12259a != i13) {
                        Bundle b12 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                            Intent intent3 = activity.getIntent();
                            kotlin.jvm.internal.k.d(intent3, "getIntent(...)");
                            b12.putParcelable("android-support-nav:controller:deepLinkIntent", intent3);
                            v i14 = hVar.i();
                            Intent intent4 = activity.getIntent();
                            kotlin.jvm.internal.k.d(intent4, "getIntent(...)");
                            t j = i14.j(new j1(intent4.getData(), intent4.getAction(), intent4.getType(), 27), i14);
                            if (j != null) {
                                bundle2 = j.f8192y;
                            } else {
                                bundle2 = null;
                            }
                            if (bundle2 != null && (a10 = j.f8191x.a(j.f8192y)) != null) {
                                b12.putAll(a10);
                            }
                        }
                        b4.h hVar3 = new b4.h(this);
                        int i15 = jVar.f9924a;
                        ArrayList arrayList = (ArrayList) hVar3.f1470y;
                        arrayList.clear();
                        arrayList.add(new s(i15, null));
                        if (((v) hVar3.f1469x) != null) {
                            hVar3.n();
                        }
                        ((Intent) hVar3.B).putExtra("android-support-nav:controller:deepLinkExtras", b12);
                        hVar3.h().b();
                        if (activity != null) {
                            activity.finish();
                        }
                        return true;
                    }
                    i13 = jVar.f9924a;
                }
            }
            return false;
        }
        if (hVar.f9904f.isEmpty()) {
            return false;
        }
        u f11 = hVar.f();
        kotlin.jvm.internal.k.b(f11);
        return hVar.l(f11.f8195y.f9924a, true);
    }
}
