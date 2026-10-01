package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class af implements of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2483a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2486d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2485c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df f2484b = new df();

    public af(p6 p6Var) {
        this.f2483a = (Context) p6Var.f2983w;
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final gf a(Uri uri) throws ff, a6.c {
        if (i(uri)) {
            throw new ff("Android backend cannot perform remote operations without a remote backend");
        }
        File fileB = eh.b(h(uri));
        return new gf(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final boolean b(Uri uri) throws ff {
        if (i(uri)) {
            throw new ff("Android backend cannot perform remote operations without a remote backend");
        }
        return eh.b(h(uri)).exists();
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final OutputStream c(Uri uri) {
        return this.f2484b.c(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final void d(Uri uri) throws IOException {
        this.f2484b.d(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final String e() {
        return "android";
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final void f(Uri uri, Uri uri2) throws IOException {
        this.f2484b.f(h(uri), h(uri2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    @Override // com.google.android.gms.internal.measurement.of
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File g(android.net.Uri r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.af.g(android.net.Uri):java.io.File");
    }

    public final Uri h(Uri uri) throws IOException {
        if (i(uri)) {
            throw new a6.c("Operation across authorities is not allowed.");
        }
        File fileG = g(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        y9.b0 b0VarJ = y9.f0.j();
        builderPath.path(fileG.getAbsolutePath());
        y9.z0 z0VarG = b0VarJ.g();
        Pattern pattern = lf.f2867a;
        return builderPath.encodedFragment(z0VarG.isEmpty() ? null : "transform=".concat(String.valueOf(new re.t("+").b(z0VarG)))).build();
    }

    public final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f2483a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
