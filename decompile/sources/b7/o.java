package b7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.protobuf.CodedOutputStream;
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

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1570a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f1571b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1572c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1573d = {31, -117, 8};

    public static f0 a(final String str, Callable callable, a2.a aVar) {
        j a10;
        f0 f0Var = null;
        if (str == null) {
            a10 = null;
        } else {
            a10 = g7.g.f5508b.a(str);
        }
        if (a10 != null) {
            f0Var = new f0(a10);
        }
        HashMap hashMap = f1570a;
        if (str != null && hashMap.containsKey(str)) {
            f0Var = (f0) hashMap.get(str);
        }
        if (f0Var != null) {
            if (aVar != null) {
                aVar.run();
            }
            return f0Var;
        }
        f0 f0Var2 = new f0(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i6 = 0;
            f0Var2.b(new b0() { // from class: b7.m
                @Override // b7.b0
                public final void onResult(Object obj) {
                    switch (i6) {
                        case 0:
                            HashMap hashMap2 = o.f1570a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = o.f1570a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                    }
                }
            });
            final int i10 = 1;
            f0Var2.a(new b0() { // from class: b7.m
                @Override // b7.b0
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap hashMap2 = o.f1570a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                        default:
                            HashMap hashMap3 = o.f1570a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                o.j();
                                return;
                            }
                            return;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, f0Var2);
                if (hashMap.size() == 1) {
                    j();
                }
            }
        }
        return f0Var2;
    }

    public static d0 b(String str, String str2, Context context) {
        j a10;
        if (str2 == null) {
            a10 = null;
        } else {
            a10 = g7.g.f5508b.a(str2);
        }
        if (a10 != null) {
            return new d0(a10);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new d0(e10);
        }
    }

    public static d0 c(Context context, InputStream inputStream, String str) {
        j a10;
        if (str == null) {
            a10 = null;
        } else {
            a10 = g7.g.f5508b.a(str);
        }
        if (a10 != null) {
            return new d0(a10);
        }
        try {
            bg.f0 d10 = bg.b.d(bg.b.l(inputStream));
            int i6 = 1;
            if (i(d10, f1572c).booleanValue()) {
                return g(context, new ZipInputStream(new bg.j(d10, i6)), str);
            }
            if (i(d10, f1573d).booleanValue()) {
                return d(new GZIPInputStream(new bg.j(d10, i6)), str);
            }
            String[] strArr = m7.a.B;
            return e(new m7.b(d10), str, true);
        } catch (IOException e10) {
            return new d0(e10);
        }
    }

    public static d0 d(InputStream inputStream, String str) {
        bg.f0 d10 = bg.b.d(bg.b.l(inputStream));
        String[] strArr = m7.a.B;
        return e(new m7.b(d10), str, true);
    }

    public static d0 e(m7.b bVar, String str, boolean z10) {
        j a10;
        try {
            if (str == null) {
                a10 = null;
            } else {
                try {
                    a10 = g7.g.f5508b.a(str);
                } catch (Exception e10) {
                    d0 d0Var = new d0(e10);
                    if (z10) {
                        n7.i.b(bVar);
                    }
                    return d0Var;
                }
            }
            if (a10 != null) {
                d0 d0Var2 = new d0(a10);
                if (z10) {
                    n7.i.b(bVar);
                }
                return d0Var2;
            }
            j a11 = l7.r.a(bVar);
            if (str != null) {
                g7.g.f5508b.f5509a.l(str, a11);
            }
            d0 d0Var3 = new d0(a11);
            if (z10) {
                n7.i.b(bVar);
            }
            return d0Var3;
        } catch (Throwable th) {
            if (z10) {
                n7.i.b(bVar);
            }
            throw th;
        }
    }

    public static d0 f(int i6, Context context, String str) {
        j a10;
        if (str == null) {
            a10 = null;
        } else {
            a10 = g7.g.f5508b.a(str);
        }
        if (a10 != null) {
            return new d0(a10);
        }
        try {
            bg.f0 d10 = bg.b.d(bg.b.l(context.getResources().openRawResource(i6)));
            int i10 = 1;
            if (i(d10, f1572c).booleanValue()) {
                return g(context, new ZipInputStream(new bg.j(d10, i10)), str);
            }
            if (i(d10, f1573d).booleanValue()) {
                try {
                    return d(new GZIPInputStream(new bg.j(d10, i10)), str);
                } catch (IOException e10) {
                    return new d0(e10);
                }
            }
            String[] strArr = m7.a.B;
            return e(new m7.b(d10), str, true);
        } catch (Resources.NotFoundException e11) {
            return new d0(e11);
        }
    }

    public static d0 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            n7.i.b(zipInputStream);
        }
    }

    public static d0 h(Context context, ZipInputStream zipInputStream, String str) {
        j a10;
        a0 a0Var;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = g7.g.f5508b.a(str);
            } catch (IOException e10) {
                return new d0(e10);
            }
        }
        if (a10 != null) {
            return new d0(a10);
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
                bg.f0 d10 = bg.b.d(bg.b.l(zipInputStream));
                String[] strArr = m7.a.B;
                jVar = e(new m7.b(d10), null, false).f1517a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new d0(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
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
                                break;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        n7.c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        n7.c.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (jVar == null) {
            return new d0(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) jVar.c()).values().iterator();
            while (true) {
                if (it.hasNext()) {
                    a0Var = (a0) it.next();
                    if (a0Var.f1487d.equals(str4)) {
                        break;
                    }
                } else {
                    a0Var = null;
                    break;
                }
            }
            if (a0Var != null) {
                a0Var.f1489f = n7.i.d((Bitmap) entry.getValue(), a0Var.f1484a, a0Var.f1485b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (g7.c cVar : jVar.f1547f.values()) {
                if (cVar.f5496a.equals(entry2.getKey())) {
                    cVar.f5499d = (Typeface) entry2.getValue();
                    z10 = true;
                }
            }
            if (!z10) {
                n7.c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) jVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                a0 a0Var2 = (a0) ((Map.Entry) it2.next()).getValue();
                if (a0Var2 == null) {
                    return null;
                }
                String str5 = a0Var2.f1487d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            a0Var2.f1489f = n7.i.d(decodeByteArray, a0Var2.f1484a, a0Var2.f1485b);
                        }
                    } catch (IllegalArgumentException e11) {
                        n7.c.c("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            g7.g.f5508b.f5509a.l(str, jVar);
        }
        return new d0(jVar);
    }

    public static Boolean i(bg.f0 f0Var, byte[] bArr) {
        try {
            bg.f0 peek = f0Var.peek();
            for (byte b10 : bArr) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            n7.c.f9090a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(f1571b);
        if (arrayList.size() <= 0) {
        } else {
            throw h8.c.h(0, arrayList);
        }
    }

    public static String k(Context context, int i6) {
        String str;
        StringBuilder sb2 = new StringBuilder("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb2.append(str);
        sb2.append(i6);
        return sb2.toString();
    }
}
