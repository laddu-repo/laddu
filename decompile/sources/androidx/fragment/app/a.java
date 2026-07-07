package androidx.fragment.app;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f959e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f961h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0 f968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f970r;

    public a(q0 q0Var) {
        q0Var.F();
        c0 c0Var = q0Var.f1085t;
        if (c0Var != null) {
            c0Var.f988y.getClassLoader();
        }
        this.f955a = new ArrayList();
        this.f967o = false;
        this.f970r = -1;
        this.f968p = q0Var;
    }

    @Override // androidx.fragment.app.o0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (q0.I(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f960g) {
            return true;
        }
        q0 q0Var = this.f968p;
        if (q0Var.f1071d == null) {
            q0Var.f1071d = new ArrayList();
        }
        q0Var.f1071d.add(this);
        return true;
    }

    public final void b(y0 y0Var) {
        this.f955a.add(y0Var);
        y0Var.f1159d = this.f956b;
        y0Var.f1160e = this.f957c;
        y0Var.f = this.f958d;
        y0Var.f1161g = this.f959e;
    }

    public final void c(int i) {
        if (this.f960g) {
            if (q0.I(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f955a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                y0 y0Var = (y0) arrayList.get(i10);
                y yVar = y0Var.f1157b;
                if (yVar != null) {
                    yVar.M += i;
                    if (q0.I(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + y0Var.f1157b + " to " + y0Var.f1157b.M);
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (this.f969q) {
            throw new IllegalStateException("commit already called");
        }
        if (q0.I(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new a1());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f969q = true;
        boolean z10 = this.f960g;
        q0 q0Var = this.f968p;
        if (z10) {
            this.f970r = q0Var.i.getAndIncrement();
        } else {
            this.f970r = -1;
        }
        q0Var.w(this, z2);
        return this.f970r;
    }

    public final void e(int i, y yVar, String str, int i10) {
        String str2 = yVar.f1142i0;
        if (str2 != null) {
            n1.c.c(yVar, str2);
        }
        Class<?> cls = yVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = yVar.T;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(yVar);
                sb2.append(": was ");
                throw new IllegalStateException(d0.d.n(sb2, yVar.T, " now ", str));
            }
            yVar.T = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + yVar + " with tag " + str + " to container view with no id");
            }
            int i11 = yVar.R;
            if (i11 != 0 && i11 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + yVar + ": was " + yVar.R + " now " + i);
            }
            yVar.R = i;
            yVar.S = i;
        }
        b(new y0(i10, yVar));
        yVar.N = this.f968p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f961h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f970r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f969q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f956b != 0 || this.f957c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f956b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f957c));
            }
            if (this.f958d != 0 || this.f959e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f958d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f959e));
            }
            if (this.i != 0 || this.f962j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f962j);
            }
            if (this.f963k != 0 || this.f964l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f963k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f964l);
            }
        }
        ArrayList arrayList = this.f955a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y0 y0Var = (y0) arrayList.get(i);
            switch (y0Var.f1156a) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case g1.g.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case g1.g.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + y0Var.f1156a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(y0Var.f1157b);
            if (z2) {
                if (y0Var.f1159d != 0 || y0Var.f1160e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(y0Var.f1159d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(y0Var.f1160e));
                }
                if (y0Var.f != 0 || y0Var.f1161g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(y0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(y0Var.f1161g));
                }
            }
        }
    }

    public final void g(y yVar) {
        q0 q0Var = yVar.N;
        if (q0Var == null || q0Var == this.f968p) {
            b(new y0(3, yVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + yVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void h(int i, y yVar) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i, yVar, null, 2);
    }

    public final void i(y yVar, androidx.lifecycle.n nVar) {
        q0 q0Var = yVar.N;
        q0 q0Var2 = this.f968p;
        if (q0Var != q0Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + q0Var2);
        }
        if (nVar == androidx.lifecycle.n.f1218w && yVar.f1151v > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + " after the Fragment has been created");
        }
        if (nVar == androidx.lifecycle.n.f1217v) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        y0 y0Var = new y0();
        y0Var.f1156a = 10;
        y0Var.f1157b = yVar;
        y0Var.f1158c = false;
        y0Var.f1162h = yVar.f1143j0;
        y0Var.i = nVar;
        b(y0Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f970r >= 0) {
            sb2.append(" #");
            sb2.append(this.f970r);
        }
        if (this.f961h != null) {
            sb2.append(" ");
            sb2.append(this.f961h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
