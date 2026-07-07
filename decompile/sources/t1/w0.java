package t1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12134a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12135b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12136c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12137d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12138e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12139g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12140h = true;
    public y9.f0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y9.f0 f12141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y9.f0 f12142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y9.f0 f12145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v0 f12146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y9.f0 f12147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public HashMap f12151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HashSet f12152u;

    public w0() {
        y9.c0 c0Var = y9.f0.f14553w;
        y9.z0 z0Var = y9.z0.f14637z;
        this.i = z0Var;
        this.f12141j = z0Var;
        this.f12142k = z0Var;
        this.f12143l = Integer.MAX_VALUE;
        this.f12144m = Integer.MAX_VALUE;
        this.f12145n = z0Var;
        this.f12146o = v0.f12128a;
        this.f12147p = z0Var;
        this.f12148q = true;
        this.f12149r = 0;
        this.f12150s = false;
        this.f12151t = new HashMap();
        this.f12152u = new HashSet();
    }

    public x0 a() {
        return new x0(this);
    }

    public void b(int i) {
        Iterator it = this.f12151t.values().iterator();
        while (it.hasNext()) {
            if (((u0) it.next()).f12121a.f12113c == i) {
                it.remove();
            }
        }
    }

    public final void c(x0 x0Var) {
        this.f12134a = x0Var.f12154a;
        this.f12135b = x0Var.f12155b;
        this.f12136c = x0Var.f12156c;
        this.f12137d = x0Var.f12157d;
        this.f12138e = x0Var.f12158e;
        this.f = x0Var.f;
        this.f12139g = x0Var.f12159g;
        this.f12140h = x0Var.f12160h;
        this.i = x0Var.i;
        this.f12141j = x0Var.f12161j;
        this.f12142k = x0Var.f12162k;
        this.f12143l = x0Var.f12163l;
        this.f12144m = x0Var.f12164m;
        this.f12145n = x0Var.f12165n;
        this.f12146o = x0Var.f12166o;
        this.f12147p = x0Var.f12167p;
        this.f12148q = x0Var.f12168q;
        this.f12149r = x0Var.f12169r;
        this.f12150s = x0Var.f12170s;
        this.f12152u = new HashSet(x0Var.f12172u);
        this.f12151t = new HashMap(x0Var.f12171t);
    }

    public void d(int i, boolean z2) {
        if (z2) {
            this.f12152u.add(Integer.valueOf(i));
        } else {
            this.f12152u.remove(Integer.valueOf(i));
        }
    }
}
