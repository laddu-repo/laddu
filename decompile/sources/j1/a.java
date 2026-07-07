package j1;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6855a;

    /* renamed from: b, reason: collision with root package name */
    public int f6856b;

    /* renamed from: c, reason: collision with root package name */
    public int f6857c;

    /* renamed from: d, reason: collision with root package name */
    public int f6858d;

    /* renamed from: e, reason: collision with root package name */
    public int f6859e;

    /* renamed from: f, reason: collision with root package name */
    public int f6860f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6861g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6862h;

    /* renamed from: i, reason: collision with root package name */
    public String f6863i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f6864k;

    /* renamed from: l, reason: collision with root package name */
    public int f6865l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6866m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f6867n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f6868o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6869p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f6870q;

    /* renamed from: r, reason: collision with root package name */
    public final p0 f6871r;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public int f6872t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6873u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(p0 p0Var) {
        this();
        p0Var.I();
        a0 a0Var = p0Var.f6963w;
        if (a0Var != null) {
            a0Var.B.getClassLoader();
        }
        this.f6872t = -1;
        this.f6873u = false;
        this.f6871r = p0Var;
    }

    @Override // j1.l0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (p0.L(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f6861g) {
            this.f6871r.f6946d.add(this);
            return true;
        }
        return true;
    }

    public final void b(w0 w0Var) {
        this.f6855a.add(w0Var);
        w0Var.f7008d = this.f6856b;
        w0Var.f7009e = this.f6857c;
        w0Var.f7010f = this.f6858d;
        w0Var.f7011g = this.f6859e;
    }

    public final void c(int i6) {
        if (this.f6861g) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
            }
            ArrayList arrayList = this.f6855a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                w0 w0Var = (w0) arrayList.get(i10);
                y yVar = w0Var.f7006b;
                if (yVar != null) {
                    yVar.R += i6;
                    if (p0.L(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + w0Var.f7006b + " to " + w0Var.f7006b.R);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f6855a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            w0 w0Var = (w0) arrayList.get(size);
            if (w0Var.f7007c) {
                if (w0Var.f7005a == 8) {
                    w0Var.f7007c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i6 = w0Var.f7006b.X;
                    w0Var.f7005a = 2;
                    w0Var.f7007c = false;
                    for (int i10 = size - 1; i10 >= 0; i10--) {
                        w0 w0Var2 = (w0) arrayList.get(i10);
                        if (w0Var2.f7007c && w0Var2.f7006b.X == i6) {
                            arrayList.remove(i10);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z10, boolean z11) {
        if (!this.s) {
            if (p0.L(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new y0());
                h("  ", printWriter, true);
                printWriter.close();
            }
            this.s = true;
            boolean z12 = this.f6861g;
            p0 p0Var = this.f6871r;
            if (z12) {
                this.f6872t = p0Var.f6952k.getAndIncrement();
            } else {
                this.f6872t = -1;
            }
            if (z11) {
                p0Var.x(this, z10);
            }
            return this.f6872t;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void g(int i6, y yVar, String str, int i10) {
        String str2 = yVar.f7031n0;
        if (str2 != null) {
            k1.c.c(yVar, str2);
        }
        Class<?> cls = yVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = yVar.Y;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + yVar + ": was " + yVar.Y + " now " + str);
                }
                yVar.Y = str;
            }
            if (i6 != 0) {
                if (i6 != -1) {
                    int i11 = yVar.W;
                    if (i11 != 0 && i11 != i6) {
                        throw new IllegalStateException("Can't change container ID of fragment " + yVar + ": was " + yVar.W + " now " + i6);
                    }
                    yVar.W = i6;
                    yVar.X = i6;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + yVar + " with tag " + str + " to container view with no id");
                }
            }
            b(new w0(i10, yVar));
            yVar.S = this.f6871r;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6863i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6872t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.s);
            if (this.f6860f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6860f));
            }
            if (this.f6856b != 0 || this.f6857c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6856b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6857c));
            }
            if (this.f6858d != 0 || this.f6859e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6858d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6859e));
            }
            if (this.j != 0 || this.f6864k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6864k);
            }
            if (this.f6865l != 0 || this.f6866m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6865l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6866m);
            }
        }
        ArrayList arrayList = this.f6855a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                w0 w0Var = (w0) arrayList.get(i6);
                switch (w0Var.f7005a) {
                    case 0:
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
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + w0Var.f7005a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(w0Var.f7006b);
                if (z10) {
                    if (w0Var.f7008d != 0 || w0Var.f7009e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(w0Var.f7008d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(w0Var.f7009e));
                    }
                    if (w0Var.f7010f != 0 || w0Var.f7011g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(w0Var.f7010f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(w0Var.f7011g));
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, j1.w0] */
    public final void i(y yVar, androidx.lifecycle.x xVar) {
        p0 p0Var = yVar.S;
        p0 p0Var2 = this.f6871r;
        if (p0Var == p0Var2) {
            if (xVar == androidx.lifecycle.x.f992y && yVar.f7040x > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + xVar + " after the Fragment has been created");
            }
            if (xVar != androidx.lifecycle.x.f991x) {
                ?? obj = new Object();
                obj.f7005a = 10;
                obj.f7006b = yVar;
                obj.f7007c = false;
                obj.f7012h = yVar.o0;
                obj.f7013i = xVar;
                b(obj);
                return;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + xVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + p0Var2);
    }

    public final void j(y yVar) {
        p0 p0Var = yVar.S;
        if (p0Var != null && p0Var != this.f6871r) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + yVar.toString() + " is already attached to a FragmentManager.");
        }
        b(new w0(8, yVar));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6872t >= 0) {
            sb2.append(" #");
            sb2.append(this.f6872t);
        }
        if (this.f6863i != null) {
            sb2.append(" ");
            sb2.append(this.f6863i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, j1.w0] */
    public a(a aVar) {
        this();
        aVar.f6871r.I();
        a0 a0Var = aVar.f6871r.f6963w;
        if (a0Var != null) {
            a0Var.B.getClassLoader();
        }
        ArrayList arrayList = aVar.f6855a;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            w0 w0Var = (w0) obj;
            ArrayList arrayList2 = this.f6855a;
            ?? obj2 = new Object();
            obj2.f7005a = w0Var.f7005a;
            obj2.f7006b = w0Var.f7006b;
            obj2.f7007c = w0Var.f7007c;
            obj2.f7008d = w0Var.f7008d;
            obj2.f7009e = w0Var.f7009e;
            obj2.f7010f = w0Var.f7010f;
            obj2.f7011g = w0Var.f7011g;
            obj2.f7012h = w0Var.f7012h;
            obj2.f7013i = w0Var.f7013i;
            arrayList2.add(obj2);
        }
        this.f6856b = aVar.f6856b;
        this.f6857c = aVar.f6857c;
        this.f6858d = aVar.f6858d;
        this.f6859e = aVar.f6859e;
        this.f6860f = aVar.f6860f;
        this.f6861g = aVar.f6861g;
        this.f6862h = aVar.f6862h;
        this.f6863i = aVar.f6863i;
        this.f6865l = aVar.f6865l;
        this.f6866m = aVar.f6866m;
        this.j = aVar.j;
        this.f6864k = aVar.f6864k;
        if (aVar.f6867n != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f6867n = arrayList3;
            arrayList3.addAll(aVar.f6867n);
        }
        if (aVar.f6868o != null) {
            ArrayList arrayList4 = new ArrayList();
            this.f6868o = arrayList4;
            arrayList4.addAll(aVar.f6868o);
        }
        this.f6869p = aVar.f6869p;
        this.f6872t = -1;
        this.f6873u = false;
        this.f6871r = aVar.f6871r;
        this.s = aVar.s;
        this.f6872t = aVar.f6872t;
        this.f6873u = aVar.f6873u;
    }

    public a() {
        this.f6855a = new ArrayList();
        this.f6862h = true;
        this.f6869p = false;
    }
}
