package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class df implements of {
    @Override // com.google.android.gms.internal.measurement.of
    public final gf a(Uri uri) throws a6.c {
        File fileB = eh.b(uri);
        return new gf(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final boolean b(Uri uri) {
        return eh.b(uri).exists();
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final OutputStream c(Uri uri) throws IOException {
        File fileB = eh.b(uri);
        android.support.v4.media.session.b.j(fileB);
        return new hf(new FileOutputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final void d(Uri uri) throws IOException {
        File fileB = eh.b(uri);
        if (fileB.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileB.delete()) {
            return;
        }
        if (!fileB.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final String e() {
        return "file";
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final void f(Uri uri, Uri uri2) throws IOException {
        File fileB = eh.b(uri);
        File fileB2 = eh.b(uri2);
        android.support.v4.media.session.b.j(fileB2);
        if (!fileB.renameTo(fileB2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.of
    public final File g(Uri uri) {
        return eh.b(uri);
    }
}
