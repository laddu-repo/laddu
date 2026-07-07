package j1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6927a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6928b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6929c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6930d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6931e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6932f;

    public m(ViewGroup container) {
        kotlin.jvm.internal.k.e(container, "container");
        this.f6927a = container;
        this.f6928b = new ArrayList();
        this.f6929c = new ArrayList();
    }

    public static final m i(ViewGroup container, p0 fragmentManager) {
        kotlin.jvm.internal.k.e(container, "container");
        kotlin.jvm.internal.k.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.k.d(fragmentManager.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof m) {
            return (m) tag;
        }
        m mVar = new m(container);
        container.setTag(R.id.special_effects_controller_view_tag, mVar);
        return mVar;
    }

    public static boolean j(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = true;
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            a1 a1Var = (a1) obj;
            if (!a1Var.f6883k.isEmpty()) {
                ArrayList arrayList2 = a1Var.f6883k;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        z0 z0Var = (z0) obj2;
                        z0Var.getClass();
                        if (!(z0Var instanceof i)) {
                        }
                    }
                }
                z10 = true;
            }
            z10 = false;
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj3 = arrayList.get(i11);
                i11++;
                ie.p.z(((a1) obj3).f6883k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(a1 operation) {
        kotlin.jvm.internal.k.e(operation, "operation");
        if (operation.f6882i) {
            h8.c.d(operation.f6874a, operation.f6876c.G(), this.f6927a);
            operation.f6882i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x022b, code lost:
    
        if (r12.f6874a != 3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x022d, code lost:
    
        r12.f6882i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0232, code lost:
    
        r12.j.add(new j1.i(r9));
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020f, code lost:
    
        if (j1.p0.L(2) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0211, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animator set on " + r10 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fd, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023e, code lost:
    
        r4 = r1.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0244, code lost:
    
        if (r6 >= r4) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0246, code lost:
    
        r8 = r1.get(r6);
        r6 = r6 + 1;
        r8 = (j1.g) r8;
        r9 = (j1.a1) r8.f4301y;
        r10 = r9.f6876c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0256, code lost:
    
        if (r2 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0273, code lost:
    
        if (r7 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0290, code lost:
    
        r9.j.add(new j1.f(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
    
        if (j1.p0.L(2) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x027b, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r10 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x025c, code lost:
    
        if (j1.p0.L(2) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025e, code lost:
    
        android.util.Log.v("FragmentManager", "Ignoring Animation set on " + r10 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x029b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r8 = (j1.a1) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (j1.p0.L(2) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r14 + " to " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        r4 = new java.util.ArrayList();
        r7 = new java.util.ArrayList();
        r9 = ((j1.a1) ie.j.M(r18)).f6876c;
        r10 = r18.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r11 >= r10) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        r12 = r18.get(r11);
        r11 = r11 + 1;
        r12 = ((j1.a1) r12).f6876c.f7027j0;
        r13 = r9.f7027j0;
        r12.f6996b = r13.f6996b;
        r12.f6997c = r13.f6997c;
        r12.f6998d = r13.f6998d;
        r12.f6999e = r13.f6999e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        r9 = r18.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (r10 >= r9) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0107, code lost:
    
        r12 = r18.get(r10);
        r10 = r10 + 1;
        r12 = (j1.a1) r12;
        r4.add(new j1.g(r12, r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        if (r19 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011b, code lost:
    
        if (r12 != r14) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0122, code lost:
    
        r15 = r12.f6876c;
        r13 = new e3.e(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if (r12.f6874a != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        if (r19 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        r6 = r15.f7027j0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
    
        if (r12.f6874a != 2) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0140, code lost:
    
        if (r19 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
    
        r6 = r15.f7027j0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0145, code lost:
    
        r6 = r15.f7027j0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0147, code lost:
    
        if (r11 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        if (r19 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        r6 = r15.f7027j0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
    
        r7.add(r13);
        r12.f6877d.add(new j1.d(r17, r12, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0130, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        if (r19 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        r6 = r15.f7027j0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        r15.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
    
        if (r12 != r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = r7.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (r6 >= r2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        r8 = r7.get(r6);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0179, code lost:
    
        if (((j1.l) r8).Z0() != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        r1.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
    
        r2 = new java.util.ArrayList();
        r6 = r1.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0189, code lost:
    
        if (r7 >= r6) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018b, code lost:
    
        r8 = r1.get(r7);
        r7 = r7 + 1;
        ((j1.l) r8).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        r1 = r2.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019c, code lost:
    
        if (r6 >= r1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019e, code lost:
    
        r7 = r2.get(r6);
        r6 = r6 + 1;
        ((j1.l) r7).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r6 = r4.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
    
        if (r7 >= r6) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        r8 = r4.get(r7);
        r7 = r7 + 1;
        ie.p.z(((j1.a1) ((j1.g) r8).f4301y).f6883k, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cd, code lost:
    
        r2 = r2.isEmpty();
        r6 = r4.size();
        r7 = false;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        if (r8 >= r6) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
    
        r9 = r4.get(r8);
        r8 = r8 + 1;
        r9 = (j1.g) r9;
        r10 = r17.f6927a.getContext();
        r12 = (j1.a1) r9.f4301y;
        kotlin.jvm.internal.k.d(r10, "context");
        r10 = r9.e1(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f4, code lost:
    
        if (r10 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fb, code lost:
    
        if (((android.animation.AnimatorSet) r10.f7159y) != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
    
        r10 = r12.f6876c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0209, code lost:
    
        if (r12.f6883k.isEmpty() != false) goto L158;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.m.b(java.util.ArrayList, boolean):void");
    }

    public final void c(List operations) {
        kotlin.jvm.internal.k.e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            ie.p.z(((a1) it.next()).f6883k, arrayList);
        }
        List Z = ie.j.Z(ie.j.c0(arrayList));
        int size = Z.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((z0) Z.get(i6)).b(this.f6927a);
        }
        int size2 = operations.size();
        for (int i10 = 0; i10 < size2; i10++) {
            a((a1) operations.get(i10));
        }
        List Z2 = ie.j.Z(operations);
        int size3 = Z2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            a1 a1Var = (a1) Z2.get(i11);
            if (a1Var.f6883k.isEmpty()) {
                a1Var.b();
            }
        }
    }

    public final void d(int i6, int i10, v0 v0Var) {
        synchronized (this.f6928b) {
            try {
                y yVar = v0Var.f6992c;
                kotlin.jvm.internal.k.d(yVar, "fragmentStateManager.fragment");
                a1 f3 = f(yVar);
                if (f3 == null) {
                    y yVar2 = v0Var.f6992c;
                    if (!yVar2.K && !yVar2.J) {
                        f3 = null;
                    }
                    f3 = g(yVar2);
                }
                if (f3 != null) {
                    f3.d(i6, i10);
                    return;
                }
                a1 a1Var = new a1(i6, i10, v0Var);
                this.f6928b.add(a1Var);
                a1Var.f6877d.add(new d(this, a1Var, 1));
                a1Var.f6877d.add(new d(this, a1Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z10;
        if (this.f6932f) {
            return;
        }
        if (!this.f6927a.isAttachedToWindow()) {
            h();
            this.f6931e = false;
            return;
        }
        synchronized (this.f6928b) {
            try {
                ArrayList a02 = ie.j.a0(this.f6929c);
                this.f6929c.clear();
                int size = a02.size();
                int i6 = 0;
                while (true) {
                    z10 = true;
                    if (i6 >= size) {
                        break;
                    }
                    Object obj = a02.get(i6);
                    i6++;
                    a1 a1Var = (a1) obj;
                    if (this.f6928b.isEmpty() || !a1Var.f6876c.K) {
                        z10 = false;
                    }
                    a1Var.f6880g = z10;
                }
                int size2 = a02.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = a02.get(i10);
                    i10++;
                    a1 a1Var2 = (a1) obj2;
                    if (this.f6930d) {
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + a1Var2);
                        }
                        a1Var2.b();
                    } else {
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + a1Var2);
                        }
                        a1Var2.a(this.f6927a);
                    }
                    this.f6930d = false;
                    if (!a1Var2.f6879f) {
                        this.f6929c.add(a1Var2);
                    }
                }
                if (!this.f6928b.isEmpty()) {
                    l();
                    ArrayList a03 = ie.j.a0(this.f6928b);
                    if (a03.isEmpty()) {
                        return;
                    }
                    this.f6928b.clear();
                    this.f6929c.addAll(a03);
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(a03, this.f6931e);
                    boolean j = j(a03);
                    int size3 = a03.size();
                    boolean z11 = true;
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = a03.get(i11);
                        i11++;
                        if (!((a1) obj3).f6876c.K) {
                            z11 = false;
                        }
                    }
                    if (!z11 || j) {
                        z10 = false;
                    }
                    this.f6930d = z10;
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + j + " \ntransition = " + z11);
                    }
                    if (!z11) {
                        k(a03);
                        c(a03);
                    } else if (j) {
                        k(a03);
                        int size4 = a03.size();
                        for (int i12 = 0; i12 < size4; i12++) {
                            a((a1) a03.get(i12));
                        }
                    }
                    this.f6931e = false;
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a1 f(y yVar) {
        Object obj;
        ArrayList arrayList = this.f6928b;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                obj = arrayList.get(i6);
                i6++;
                a1 a1Var = (a1) obj;
                if (kotlin.jvm.internal.k.a(a1Var.f6876c, yVar) && !a1Var.f6878e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (a1) obj;
    }

    public final a1 g(y yVar) {
        Object obj;
        ArrayList arrayList = this.f6929c;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                obj = arrayList.get(i6);
                i6++;
                a1 a1Var = (a1) obj;
                if (kotlin.jvm.internal.k.a(a1Var.f6876c, yVar) && !a1Var.f6878e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (a1) obj;
    }

    public final void h() {
        String str;
        String str2;
        if (p0.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f6927a.isAttachedToWindow();
        synchronized (this.f6928b) {
            try {
                l();
                k(this.f6928b);
                ArrayList a02 = ie.j.a0(this.f6929c);
                int size = a02.size();
                int i6 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = a02.get(i10);
                    i10++;
                    ((a1) obj).f6880g = false;
                }
                int size2 = a02.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = a02.get(i11);
                    i11++;
                    a1 a1Var = (a1) obj2;
                    if (p0.L(2)) {
                        if (isAttachedToWindow) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str2 = "Container " + this.f6927a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + a1Var);
                    }
                    a1Var.a(this.f6927a);
                }
                ArrayList a03 = ie.j.a0(this.f6928b);
                int size3 = a03.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = a03.get(i12);
                    i12++;
                    ((a1) obj3).f6880g = false;
                }
                int size4 = a03.size();
                while (i6 < size4) {
                    Object obj4 = a03.get(i6);
                    i6++;
                    a1 a1Var2 = (a1) obj4;
                    if (p0.L(2)) {
                        if (isAttachedToWindow) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str = "Container " + this.f6927a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + a1Var2);
                    }
                    a1Var2.a(this.f6927a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(List list) {
        float f3;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            a1 a1Var = (a1) list.get(i6);
            v0 v0Var = a1Var.f6884l;
            if (!a1Var.f6881h) {
                a1Var.f6881h = true;
                int i10 = a1Var.f6875b;
                if (i10 == 2) {
                    y yVar = v0Var.f6992c;
                    kotlin.jvm.internal.k.d(yVar, "fragmentStateManager.fragment");
                    View findFocus = yVar.f7024g0.findFocus();
                    if (findFocus != null) {
                        yVar.b().f7004k = findFocus;
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + yVar);
                        }
                    }
                    View G = a1Var.f6876c.G();
                    if (G.getParent() == null) {
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "Adding fragment " + yVar + " view " + G + " to container in onStart");
                        }
                        v0Var.b();
                        G.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (G.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && G.getVisibility() == 0) {
                        if (p0.L(2)) {
                            Log.v("FragmentManager", "Making view " + G + " INVISIBLE in onStart");
                        }
                        G.setVisibility(4);
                    }
                    w wVar = yVar.f7027j0;
                    float f10 = 1.0f;
                    if (wVar == null) {
                        f3 = 1.0f;
                    } else {
                        f3 = wVar.j;
                    }
                    G.setAlpha(f3);
                    if (p0.L(2)) {
                        StringBuilder sb2 = new StringBuilder("Setting view alpha to ");
                        w wVar2 = yVar.f7027j0;
                        if (wVar2 != null) {
                            f10 = wVar2.j;
                        }
                        sb2.append(f10);
                        sb2.append(" in onStart");
                        Log.v("FragmentManager", sb2.toString());
                    }
                } else if (i10 == 3) {
                    y yVar2 = v0Var.f6992c;
                    kotlin.jvm.internal.k.d(yVar2, "fragmentStateManager.fragment");
                    View G2 = yVar2.G();
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "Clearing focus " + G2.findFocus() + " on view " + G2 + " for Fragment " + yVar2);
                    }
                    G2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ie.p.z(((a1) it.next()).f6883k, arrayList);
        }
        List Z = ie.j.Z(ie.j.c0(arrayList));
        int size2 = Z.size();
        for (int i11 = 0; i11 < size2; i11++) {
            z0 z0Var = (z0) Z.get(i11);
            z0Var.getClass();
            ViewGroup container = this.f6927a;
            kotlin.jvm.internal.k.e(container, "container");
            if (!z0Var.f7048a) {
                z0Var.d(container);
            }
            z0Var.f7048a = true;
        }
    }

    public final void l() {
        ArrayList arrayList = this.f6928b;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            a1 a1Var = (a1) obj;
            int i10 = 2;
            if (a1Var.f6875b == 2) {
                int visibility = a1Var.f6876c.G().getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i10 = 3;
                        } else {
                            throw new IllegalArgumentException(h8.c.i(visibility, "Unknown visibility "));
                        }
                    }
                }
                a1Var.d(i10, 1);
            }
        }
    }
}
