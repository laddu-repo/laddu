package h6;

import a6.i;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import b8.h;
import g6.r;
import g6.s;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.d {
    public static final String[] F = {"_data"};
    public final int A;
    public final i B;
    public final Class C;
    public volatile boolean D;
    public volatile com.bumptech.glide.load.data.d E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f6150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f6151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f6152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Uri f6153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f6154z;

    public c(Context context, s sVar, s sVar2, Uri uri, int i, int i10, i iVar, Class cls) {
        this.f6150v = context.getApplicationContext();
        this.f6151w = sVar;
        this.f6152x = sVar2;
        this.f6153y = uri;
        this.f6154z = i;
        this.A = i10;
        this.B = iVar;
        this.C = cls;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.C;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        com.bumptech.glide.load.data.d dVar = this.E;
        if (dVar != null) {
            dVar.b();
        }
    }

    public final com.bumptech.glide.load.data.d c() throws Throwable {
        r rVarB;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.f6150v;
        i iVar = this.B;
        int i = this.A;
        int i10 = this.f6154z;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.f6153y;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, F, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            rVarB = this.f6151w.b(file, i10, i, iVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.f6153y;
            boolean zB = h.B(requireOriginal);
            s sVar = this.f6152x;
            if (zB && requireOriginal.getPathSegments().contains("picker")) {
                rVarB = sVar.b(requireOriginal, i10, i, iVar);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                rVarB = sVar.b(requireOriginal, i10, i, iVar);
            }
        }
        if (rVarB != null) {
            return rVarB.f5696c;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.D = true;
        com.bumptech.glide.load.data.d dVar = this.E;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) throws Throwable {
        try {
            com.bumptech.glide.load.data.d dVarC = c();
            if (dVarC == null) {
                cVar.k(new IllegalArgumentException("Failed to build fetcher for: " + this.f6153y));
            } else {
                this.E = dVarC;
                if (this.D) {
                    cancel();
                } else {
                    dVarC.e(hVar, cVar);
                }
            }
        } catch (FileNotFoundException e7) {
            cVar.k(e7);
        }
    }
}
