package j5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.kc;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f6869a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f6870b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f6871c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f6872d = {31, -117, 8};

    public static d0 a(final String str, Callable callable, androidx.emoji2.text.v vVar) {
        j jVarA = str == null ? null : o5.g.f9953b.a(str);
        d0 d0Var = jVarA != null ? new d0(jVarA) : null;
        HashMap map = f6869a;
        if (str != null && map.containsKey(str)) {
            d0Var = (d0) map.get(str);
        }
        if (d0Var != null) {
            if (vVar != null) {
                vVar.run();
            }
            return d0Var;
        }
        d0 d0Var2 = new d0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            d0Var2.b(new z() { // from class: j5.l
                @Override // j5.z
                public final void onResult(Object obj) {
                    switch (i) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            HashMap map2 = n.f6869a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                n.j();
                            }
                            break;
                        default:
                            HashMap map3 = n.f6869a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                n.j();
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            d0Var2.a(new z() { // from class: j5.l
                @Override // j5.z
                public final void onResult(Object obj) {
                    switch (i10) {
                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                            HashMap map2 = n.f6869a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                n.j();
                            }
                            break;
                        default:
                            HashMap map3 = n.f6869a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                n.j();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, d0Var2);
                if (map.size() == 1) {
                    j();
                }
            }
        }
        return d0Var2;
    }

    public static b0 b(Context context, String str, String str2) {
        j jVarA = str2 == null ? null : o5.g.f9953b.a(str2);
        if (jVarA != null) {
            return new b0(jVarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e7) {
            return new b0(e7);
        }
    }

    public static b0 c(Context context, InputStream inputStream, String str) {
        j jVarA = str == null ? null : o5.g.f9953b.a(str);
        if (jVarA != null) {
            return new b0(jVarA);
        }
        try {
            vf.n nVarH = z7.b.h(z7.b.M(inputStream));
            if (i(nVarH, f6871c).booleanValue()) {
                return g(context, new ZipInputStream(new kc(nVarH, 3)), str);
            }
            if (i(nVarH, f6872d).booleanValue()) {
                return d(new GZIPInputStream(new kc(nVarH, 3)), str);
            }
            String[] strArr = u5.b.f12889z;
            return e(new u5.c(nVarH), str, true);
        } catch (IOException e7) {
            return new b0(e7);
        }
    }

    public static b0 d(InputStream inputStream, String str) {
        vf.n nVarH = z7.b.h(z7.b.M(inputStream));
        String[] strArr = u5.b.f12889z;
        return e(new u5.c(nVarH), str, true);
    }

    public static b0 e(u5.c cVar, String str, boolean z2) {
        j jVarA;
        try {
            if (str == null) {
                jVarA = null;
            } else {
                try {
                    jVarA = o5.g.f9953b.a(str);
                } catch (Exception e7) {
                    b0 b0Var = new b0(e7);
                    if (z2) {
                        v5.i.b(cVar);
                    }
                    return b0Var;
                }
            }
            if (jVarA != null) {
                b0 b0Var2 = new b0(jVarA);
                if (z2) {
                    v5.i.b(cVar);
                }
                return b0Var2;
            }
            j jVarA2 = t5.r.a(cVar);
            if (str != null) {
                o5.g.f9953b.f9954a.l(str, jVarA2);
            }
            b0 b0Var3 = new b0(jVarA2);
            if (z2) {
                v5.i.b(cVar);
            }
            return b0Var3;
        } catch (Throwable th) {
            if (z2) {
                v5.i.b(cVar);
            }
            throw th;
        }
    }

    public static b0 f(int i, Context context, String str) {
        j jVarA = str == null ? null : o5.g.f9953b.a(str);
        if (jVarA != null) {
            return new b0(jVarA);
        }
        try {
            vf.n nVarH = z7.b.h(z7.b.M(context.getResources().openRawResource(i)));
            if (i(nVarH, f6871c).booleanValue()) {
                return g(context, new ZipInputStream(new kc(nVarH, 3)), str);
            }
            if (!i(nVarH, f6872d).booleanValue()) {
                String[] strArr = u5.b.f12889z;
                return e(new u5.c(nVarH), str, true);
            }
            try {
                return d(new GZIPInputStream(new kc(nVarH, 3)), str);
            } catch (IOException e7) {
                return new b0(e7);
            }
        } catch (Resources.NotFoundException e10) {
            return new b0(e10);
        }
    }

    public static b0 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            v5.i.b(zipInputStream);
        }
    }

    public static b0 h(Context context, ZipInputStream zipInputStream, String str) {
        j jVarA;
        y yVar;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            jVarA = null;
        } else {
            try {
                jVarA = o5.g.f9953b.a(str);
            } catch (IOException e7) {
                return new b0(e7);
            }
        }
        if (jVarA != null) {
            return new b0(jVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        j jVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                vf.n nVarH = z7.b.h(z7.b.M(zipInputStream));
                String[] strArr = u5.b.f12889z;
                jVar = e(new u5.c(nVarH), null, false).f6812a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new b0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    v5.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    v5.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (jVar == null) {
            return new b0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) jVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    yVar = null;
                    break;
                }
                yVar = (y) it.next();
                if (yVar.f6918d.equals(str4)) {
                    break;
                }
            }
            if (yVar != null) {
                yVar.f = v5.i.d((Bitmap) entry.getValue(), yVar.f6915a, yVar.f6916b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z2 = false;
            for (o5.c cVar : jVar.f.values()) {
                if (cVar.f9941a.equals(entry2.getKey())) {
                    cVar.f9944d = (Typeface) entry2.getValue();
                    z2 = true;
                }
            }
            if (!z2) {
                v5.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) jVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                y yVar2 = (y) ((Map.Entry) it2.next()).getValue();
                if (yVar2 == null) {
                    return null;
                }
                String str5 = yVar2.f6918d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            yVar2.f = v5.i.d(bitmapDecodeByteArray, yVar2.f6915a, yVar2.f6916b);
                        }
                    } catch (IllegalArgumentException e10) {
                        v5.c.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            o5.g.f9953b.f9954a.l(str, jVar);
        }
        return new b0(jVar);
    }

    public static Boolean i(vf.n nVar, byte[] bArr) {
        try {
            vf.n nVarH = z7.b.h(new vf.l(nVar));
            for (byte b9 : bArr) {
                if (nVarH.readByte() != b9) {
                    return Boolean.FALSE;
                }
            }
            nVarH.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            v5.c.f13172a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(f6870b);
        if (arrayList.size() > 0) {
            throw d0.d.f(0, arrayList);
        }
    }

    public static String k(Context context, int i) {
        return u5.a.b(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
