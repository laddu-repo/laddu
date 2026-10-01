package com.google.android.gms.internal.measurement;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class qc {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qc f3020c = new qc(nc.f2930b, jc.B());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nc f3021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jc f3022b;

    public qc(nc ncVar, jc jcVar) {
        ncVar.getClass();
        this.f3021a = ncVar;
        this.f3022b = jcVar;
    }

    public static qc a(w0 w0Var, boolean z2) throws u1 {
        nc ncVarA;
        int I = w0Var.I();
        if (I > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(I).length() + 44);
            sb2.append("Unsupported version: ");
            sb2.append(I);
            sb2.append(". Current version is: 1");
            throw new u1(sb2.toString());
        }
        w0Var.I();
        int iD = w0Var.d(w0Var.G());
        a1 a1Var = a1.f2467a;
        int i = o0.f2941a;
        jc jcVarA = jc.A(w0Var, a1.f2468b);
        w0Var.e(iD);
        lc lcVar = new lc();
        Inflater inflater = lcVar.f2857v;
        try {
            if (z2) {
                int iD2 = w0Var.d(w0Var.G());
                int iF = w0Var.f();
                try {
                    ncVarA = nc.a(w0.m(new InflaterInputStream(new kc(lcVar, w0Var), inflater, iF < 0 ? 4096 : Math.min(iF, 4096)), 4096));
                    inflater.reset();
                    if (w0Var.f() != 0) {
                        throw new u1("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    w0Var.e(iD2);
                } finally {
                }
            } else {
                inflater.setInput(w0Var.F());
                try {
                    ncVarA = nc.a(w0.m(new kc(lcVar, 0), 4096));
                } finally {
                }
            }
            lcVar.close();
            return new qc(ncVarA, jcVarA);
        } finally {
            try {
                lcVar.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }
}
